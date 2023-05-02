package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqDetalleSolicitud;
import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqLog;

public interface JqLogService {

    public JqLog save(JqDetalleSolicitud det);

}
