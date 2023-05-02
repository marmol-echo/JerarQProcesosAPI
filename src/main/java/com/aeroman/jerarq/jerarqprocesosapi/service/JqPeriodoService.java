package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqPeriodoAut;

import java.util.List;

public interface JqPeriodoService {

    public List<JqPeriodoAut> getPeriodos();
    public JqPeriodoAut save(JqPeriodoAut periodo);
}
