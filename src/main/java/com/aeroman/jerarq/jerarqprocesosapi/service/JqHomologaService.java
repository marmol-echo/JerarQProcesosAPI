package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqHomologacion;

import java.util.List;

public interface JqHomologaService {

    public List<JqHomologacion> getHomologacionesVhur();
    public List<JqHomologacion> getHomologacionesVhur(String bahia);

}
