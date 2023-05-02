package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqDetalleSolicitud;
import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqLog;
import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqSolicitud;
import com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq.JqDetalleSolRepository;
import com.aeroman.jerarq.jerarqprocesosapi.types.JqEstadoEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JqDetalleSolServiceImpl implements JqDetalleSolService {

    @Autowired
    private JqDetalleSolRepository repository;
    @Autowired
    private JqSolicitudService solicitudService;
    @Autowired
    private JqLogService logService;

    @Override
    public List<JqDetalleSolicitud> getSolicitudesPendientes() {

        return repository.findByEstId(JqEstadoEnum.PEN.getEst());
    }

    @Override
    public JqDetalleSolicitud save(JqDetalleSolicitud detalle) {
        JqSolicitud sol;
        JqLog log;
        try {
            sol = solicitudService.save(detalle.getSolId());
            if(sol != null) {
                detalle.setSolId(sol);
                detalle = repository.save(detalle);
            }
            else return null;
            if(detalle != null) {
                log = logService.save(detalle);
            }

            return detalle;
        } catch (Exception e) {
            return null;
        }
    }
}
