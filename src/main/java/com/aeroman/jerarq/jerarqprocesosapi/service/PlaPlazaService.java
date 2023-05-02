package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaPlzPlaza;

import java.util.List;

public interface PlaPlazaService {

    public PlaPlzPlaza getPlazaByCod(Integer codigo);
    public PlaPlzPlaza findPlazaCia(Integer codcia, Integer codplz);
    public List<PlaPlzPlaza> validarPuesto(String codigo);
    public PlaPlzPlaza actualizarPlaza(PlaPlzPlaza plaza);

}
