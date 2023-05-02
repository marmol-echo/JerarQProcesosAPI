package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqDetalleSolicitud;

import java.util.List;

public interface JqDetalleSolService {

    public List<JqDetalleSolicitud> getSolicitudesPendientes();
    public JqDetalleSolicitud save(JqDetalleSolicitud detalle);

}
