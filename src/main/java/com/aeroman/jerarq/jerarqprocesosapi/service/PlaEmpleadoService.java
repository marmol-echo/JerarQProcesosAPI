package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaEmpEmpleado;

import java.util.List;

public interface PlaEmpleadoService {

    public PlaEmpEmpleado findEmpleado(String codigo);
    public List<PlaEmpEmpleado> validarEmpleado(String cod86, String codM4);
    public List<PlaEmpEmpleado> getRetirados();
    public List<PlaEmpEmpleado> getActivosPorCodigo(String codigo);
    public Boolean esEmpleadoActivo(String codigo);

}
