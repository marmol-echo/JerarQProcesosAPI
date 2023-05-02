package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqUser;

import java.util.List;

public interface JqUserService {

    public List<JqUser> findAll();
    public List<JqUser> findAllByRes(int resId);
}
