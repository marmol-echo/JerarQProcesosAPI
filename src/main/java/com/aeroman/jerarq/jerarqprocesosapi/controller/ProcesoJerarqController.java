package com.aeroman.jerarq.jerarqprocesosapi.controller;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqDetalleSolicitud;
import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqEstado;
import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqHomologacion;
import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqPlantillaBajas;
import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaEmpEmpleado;
import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaPlzPlaza;
import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaUbiUbicacion;
import com.aeroman.jerarq.jerarqprocesosapi.msg.MsgGeneric;
import com.aeroman.jerarq.jerarqprocesosapi.msg.MsgTurno;
import com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq.JqMailRepository;
import com.aeroman.jerarq.jerarqprocesosapi.request.GenericRoot;
import com.aeroman.jerarq.jerarqprocesosapi.request.PostBahiaRequest;
import com.aeroman.jerarq.jerarqprocesosapi.request.ProcesoBajasRequest;
import com.aeroman.jerarq.jerarqprocesosapi.response.ResponseGeneric;
import com.aeroman.jerarq.jerarqprocesosapi.service.*;
import com.aeroman.jerarq.jerarqprocesosapi.types.JqEstadoEnum;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/jq")
@CrossOrigin("*")
public class ProcesoJerarqController {

    @Autowired
    private JqDetalleSolService jqDetalleSolService;
    @Autowired
    private JqBajasService jqBajasService;
    @Autowired
    private JqHomologaService jqHomologaService;
    @Autowired
    private JqMailRepository mailRepository;
    @Autowired
    private PlaEmpleadoService empleadoService;
    @Autowired
    private PlaPlazaService plazaService;
    @Autowired
    private PlaUbicacionService ubicacionService;

    private final String SUCCESSMSG = "Success.";
    private final String ERRORMSG = "Error.";
    @Value("${brokerValidTurnosUrl}")
    private String urlTurno;
    @Value("${brokerValidTarjetaUrl}")
    private String urlTarjeta;
    @Value("${brokerValidProyectoUrl}")
    private String urlProyectos;
    @Value("${brokerPostBahiaUrl}")
    private String urlPostBahia;
    @Value("${brokerBajasUrl}")
    private String urlBajas;
    @Value("${asuntoExito}")
    private String asuntoExito;
    @Value("${asuntoFallo}")
    private String asuntoFallo;
    @Value("${encabezadoExito}")
    private String encabezadoExito;
    @Value("${encabezadoFallo}")
    private String encabezadoFallo;
    @Value("${horaAutorizacionAB}")
    private int horaAutorizacionAB;  // 11:00 pm
    @Value("${horaAutorizacionCD}")
    private int horaAutorizacionCD;  // 11:00 am
    private String idsExito, idsFallidos;
    private Integer id;
    private Calendar calendar;
    private MsgTurno turno;
    private MsgGeneric msg;
    private Boolean activo;
    private List<PlaEmpEmpleado> retiradosList;
    private List<JqDetalleSolicitud> detList;
    private List<JqHomologacion> homologacionesList;
    private List<PlaEmpEmpleado> empList;
    private List<PlaPlzPlaza> plzList;
    private List<PlaUbiUbicacion> ubiList;
    private String motivoRec;
    private ResponseEntity<ResponseGeneric> response;
    private final RestTemplate template = new RestTemplate();
    private final Gson gson = new Gson();

    @Scheduled(cron = "* * 23 * * *")   // Activa los servicios a las 11:00 pm
    private void autorizacionAB() {
        this.servicioBajas();
        this.autorizar();
    }

    @Scheduled(cron = "* * 11 * * *")   // Activa los servicios a las 11:00 am
    private void autorizacionCD() {
        this.autorizar();
    }

    @PostMapping ("/bajas")
    public ResponseEntity servicioBajas() {
        msg = null;
        activo = null;
        response = null;
        retiradosList = new ArrayList<>();
        String ids = "", idsErrados = "", plazaMail;
        PlaPlzPlaza plaza;
        Integer id = 0;

        retiradosList = empleadoService.getRetirados();

        if(retiradosList == null || retiradosList.isEmpty()) {
            return new ResponseEntity<Object>(
                    new ResponseGeneric<>(new MsgGeneric("0",
                            "No se encontraron empleados para dar de baja.")), HttpStatus.OK);
        } else {    // Se evalua la lista de empleados retirados
            for (PlaEmpEmpleado emp : retiradosList) {
                activo = empleadoService.esEmpleadoActivo(emp.getEmpCodigoAnterior());
                plaza = plazaService.getPlazaByCod(emp.getEmpCodplz());
                if (plaza == null)
                    plazaMail = "";
                else plazaMail = plaza.getPlzNombre();
                id = jqBajasService.save(new JqPlantillaBajas(
                        emp.getEmpCodigoAnterior(),
                        emp.getEmpCodigoM4(),
                        emp.getEmpNombreApellido(),
                        plazaMail
                ));
                if (activo != null) {
                    if (activo.equals(Boolean.FALSE)) {
                        // SE DEBE DAR DE BAJA
                        response =
                                template.postForEntity(urlBajas, new GenericRoot<>(
                                        new ProcesoBajasRequest(emp.getEmpCodigoAnterior())), ResponseGeneric.class);
                        msg = gson.fromJson(response.getBody().getResponse().toString(), MsgGeneric.class);

                        if (msg != null && !msg.getCodResp().equals("1")) {
                            if (ids.equals("") && id != null)
                                ids = id.toString();
                            else if (id != null)
                                ids = ids + "," + id.toString();
                        } else {
                            // NO SE PUDO DAR DE BAJA
                            if (idsErrados.equals("") && id != 0)
                                idsErrados = id.toString();
                            else if (id != 0)
                                idsErrados = idsErrados + "," + id.toString();
                        }
                    } else {
                        // NO SE DEBE DAR DE BAJA
                        if (idsErrados.equals("") && id != 0)
                            idsErrados = id.toString();
                        else if (id != 0)
                            idsErrados = idsErrados + "," + id.toString();
                    }
                } else {
                    // NO SE PUDO DAR DE BAJA POR ESTAR ACTIVO
                    if (idsErrados.equals("") && id != 0)
                        idsErrados = id.toString();
                    else if (id != 0)
                        idsErrados = idsErrados + "," + id.toString();
                }
            }

            if (!ids.equals("")) {
                mailRepository.sendEmail(
                        "Actualizacion de bajas",
                        BigDecimal.valueOf(1),
                        BigDecimal.valueOf(0),
                        BigDecimal.valueOf(0),
                        "Listado de empleados a los que se les dio de baja este dia:",
                        ids, BigDecimal.valueOf(1));
            }

            if (!idsErrados.equals("")) {
                mailRepository.sendEmail(
                        "Actualizacion de bajas",
                        BigDecimal.valueOf(1),
                        BigDecimal.valueOf(0),
                        BigDecimal.valueOf(0),
                        "Listado de empleados a los que <b>no</b> se les pudo dar de baja este dia:",
                        idsErrados, BigDecimal.valueOf(1));
            }

            jqBajasService.limpiarTabla();
            return new ResponseEntity<Object>(
                    new ResponseGeneric<>(
                            new MsgGeneric("0", SUCCESSMSG)), HttpStatus.OK);
        }
    }

    @PostMapping("/auth")
    public ResponseEntity<Object> autorizar() {
        detList = jqDetalleSolService.getSolicitudesPendientes();
        if(calendar == null) calendar = Calendar.getInstance();
        turno = null;
        response = null;
        idsExito = "";
        idsFallidos = "";

        if (detList != null && !detList.isEmpty()) {
            for (JqDetalleSolicitud det : detList) {
                motivoRec = "";
                id = det.getSolId().getSolId().intValueExact();
                response =
                        template.getForEntity(
                                urlTurno + det.getDetCod86().trim(), ResponseGeneric.class);
                try {
                    turno = gson.fromJson(response.getBody().getResponse().toString(), MsgTurno.class);
                } catch (JsonSyntaxException e) {
                    turno = null;
                }
                // Se ejecutan las validaciones y guardado segun el turno
                if (turno != null &&
                        (turno.getCodTurno().equalsIgnoreCase("A") ||
                                turno.getCodTurno().equalsIgnoreCase("B"))) {
                    validacionesAutorizacion(det);
                } else
                    if (turno != null &&
                            (turno.getCodTurno().equalsIgnoreCase("C") ||
                                    turno.getCodTurno().equalsIgnoreCase("D"))) {
                        validacionesAutorizacion(det);
                    } else {
                        System.out.print("\nAun no es turno para ser autorizado" + "\n");
                        //validacionesAutorizacion(det);  // Para pruebas
                    }
            }

            if (!idsExito.equals("")) {
                mailRepository.sendEmail(
                        asuntoExito,
                        BigDecimal.valueOf(1),  // Perfil de notificaciones, id = 1
                        BigDecimal.valueOf(0),  // Perfil de administrador VHUR, id = 2
                        BigDecimal.valueOf(3),  // Perfil de admin. VHUR_KRONOS, id = 3
                        encabezadoExito,
                        idsExito, BigDecimal.valueOf(0));
            }

            if (!idsFallidos.equals("")) {
                mailRepository.sendEmail(
                        asuntoFallo,
                        BigDecimal.valueOf(1),  // Perfil de notificaciones, id = 1
                        BigDecimal.valueOf(0),  // Perfil de administrador VHUR, id = 2
                        BigDecimal.valueOf(0),  // Perfil de admin. VHUR_KRONOS, id = 3
                        encabezadoFallo,
                        idsFallidos, BigDecimal.valueOf(0));
            }

            return new ResponseEntity<Object>(
                    new ResponseGeneric<>(new MsgGeneric("0",
                            SUCCESSMSG)), HttpStatus.OK);
        } else {
            return new ResponseEntity<Object>(
                    new ResponseGeneric<>(new MsgGeneric("204",
                            "No se encontraron solicitudes.")), HttpStatus.NO_CONTENT);
        }
    }

    // Módulo que guarda los id de las solicitudes exitosas
    private void marcarExito() {
        if(idsExito.equals("") && !id.equals(""))
            idsExito = id.toString();
        else if(!id.equals(""))
            idsExito = idsExito + ","+ id.toString();
    }

    // Módulo que guarda los id de las solicitudes fallidas
    private void marcarFallido() {
        if(idsFallidos.equals("") && !id.equals(""))
            idsFallidos = id.toString();
        else if(!id.equals(""))
            idsFallidos = idsFallidos + ","+ id.toString();
    }

    // Módulo secundario que valida los datos ingresados en la solicitud y actualiza
    private boolean validacionesAutorizacion(JqDetalleSolicitud det) {
        // Se realizan una por una las validaciones
        if(codigosValidos(det) && puestoValido(det) && bahiaValida(det) && validarMarcado(det)) {
            // Extraemos la lista para realizar las homologaciones
            homologacionesList = jqHomologaService.getHomologacionesVhur(det.getDetBahia());
            // Actualizacion de bahia en Airsoft y VHUR
            if (proyectoValido(det) && actualizarBahiaVhur(det) && actualizarBahiaAirsoft(det)) {
                marcarExito();  // Si sale bien se marca como exitoso
            } else {
                marcarFallido(); // Si algo sale mal se marca como fallido
            }

            // Si todo sale bien se marca como Finalizado
            if(motivoRec.equals(""))
                det.getSolId().setEstId(new JqEstado(JqEstadoEnum.FIN.getEst()));
            else {
                det.getSolId().setEstId(new JqEstado(JqEstadoEnum.REC.getEst()));
                // Ingresamos el motivo de rechazo
                det.setDetMotivoRechazo(motivoRec);
            }
        } else {
            // Si hubo algún error se marca como rechazado
            marcarFallido();
            // Ingresamos el motivo de rechazo
            det.setDetMotivoRechazo(motivoRec);
            det.getSolId().setEstId(new JqEstado(JqEstadoEnum.REC.getEst()));
        }
        //System.out.print("\nActualizando solicitud"+"\n");
        det = jqDetalleSolService.save(det);
        //System.out.print(det.getSolId());
        return (det != null && det.getSolId() !=null);  // Retorna true si se cumple
    }
    // Modulo para validar que sea periodo para autorizar (no aplica)
    private boolean periodoValido() {
        /*
        boolean valido = false;
        if(calendar == null) calendar = Calendar.getInstance();
        periodoList = jqPeriodoService.getPeriodos();

        for(JqPeriodoAut per : periodoList) {
            if(!valido) {
                if(calendar.DAY_OF_MONTH >= per.getPerFechaInicio().intValueExact() &&
                        calendar.DAY_OF_MONTH <= per.getPerFechaFin().intValueExact())
                    valido = true;
            }
        }
        if(!valido) System.out.print("\nNo es periodo de autorizacion."+"\n");*/
        return true;
    }

    private boolean codigosValidos(JqDetalleSolicitud det) {
        empList = empleadoService.validarEmpleado(
                det.getDetCod86().trim(), det.getDetCodM4().trim());
        if(empList == null || empList.isEmpty()) {
            motivoRec = "Códigos 86 y m4 no son válidos";
            return false;
        }
        return true;
    }

    private boolean puestoValido(JqDetalleSolicitud det) {
        plzList = plazaService.validarPuesto(det.getDetCod86());
        if(plzList == null || plzList.isEmpty()) {
            motivoRec = "El puesto no existe";
            return false;
        }
        return true;
    }

    private boolean bahiaValida(JqDetalleSolicitud det) {
        ubiList = ubicacionService.validarBahia(det.getDetCod86());
        if(ubiList == null || ubiList.isEmpty()) {
            motivoRec = "La ubicación no existe";
            return false;
        }
        return true;
    }

    private boolean validarMarcado(JqDetalleSolicitud det) {
        response =
                template.getForEntity(
                        urlTarjeta+det.getDetCod86().trim(), ResponseGeneric.class);
        MsgGeneric msg = null;
        try {
            msg = gson.fromJson(response.getBody().getResponse().toString(), MsgGeneric.class);
        } catch (JsonSyntaxException e) {
            msg = null;
        }

        if(msg != null && !msg.getCodResp().equalsIgnoreCase("1")) {
            return true;
        } else {
            motivoRec = "El colaborador está marcado en una tarjeta";
            return false;
        }
    }

    private boolean proyectoValido(JqDetalleSolicitud det) {
        boolean valido = false;
        if(homologacionesList != null && !homologacionesList.isEmpty()) {
            String bahia = homologacionesList.get(0).getHml12136().trim();
            response = template.getForEntity(urlProyectos, ResponseGeneric.class);
            String[] proyectos = response.getBody().getResponse().toString().split(",");
            for(int i = 0; i< Arrays.stream(proyectos).count(); i++) {
                if(!valido) {
                    if(proyectos[i].contains(bahia)) {
                        valido = true;
                    }
                }
            }
        }

        if(!valido) {
            motivoRec = "El proyecto no es válido";
        }

        return valido;
    }

    private boolean actualizarBahiaAirsoft(JqDetalleSolicitud det) {
        response = template.postForEntity(urlPostBahia,
                new GenericRoot<>(new PostBahiaRequest(
                        det.getDetCod86().trim(),
                        homologacionesList.get(0).getHml12136().trim())), ResponseGeneric.class);

        MsgGeneric msg;
        try {
            msg = gson.fromJson(response.getBody().getResponse().toString(), MsgGeneric.class);
        } catch (JsonSyntaxException e) {
            msg = null;
        }

        if(msg != null && !msg.getCodResp().equalsIgnoreCase("1"))
            return true;
        else {
            motivoRec = "No se pudo actualizar la bahia en Airsoft.";
            return false;
        }
    }

    private boolean actualizarBahiaVhur(JqDetalleSolicitud det) {
        PlaPlzPlaza plaza;
        PlaUbiUbicacion ubicacion;
        PlaEmpEmpleado empleado = empleadoService.findEmpleado(det.getDetCod86());

        if(empleado != null) {
            ubicacion = ubicacionService.findUbicacion(det.getDetBahia());
            if(ubicacion != null) {
                plaza = plazaService.findPlazaCia(empleado.getEmpCodcia(), empleado.getEmpCodplz());
                if(plaza != null) {
                    plaza.setPlzCodubi(ubicacion);
                } else {
                    motivoRec = "No se pudo actualizar bahia en VHUR. No se encontró la plaza.";
                    return false;
                }
            } else {
                motivoRec = "No se pudo actualizar bahia en VHUR. No se encontró la ubicación.";
                return false;
            }
        } else {
            motivoRec = "No se pudo actualizar bahia en VHUR. No se encontró el empleado.";
            return false;
        }

        try {
            plaza = plazaService.actualizarPlaza(plaza);
        } catch (Exception e) {
            plaza = null;
            motivoRec = "No se pudo actualizar bahia en VHUR. Ocurrió un error inesperado.";
        }

        return (plaza != null);
    }

}
