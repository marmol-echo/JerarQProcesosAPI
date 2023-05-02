package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaUbiUbicacion;

import java.util.List;

public interface PlaUbicacionService {

    public PlaUbiUbicacion save(PlaUbiUbicacion ubicacion);
    public List<PlaUbiUbicacion> validarBahia(String codigo);
    public PlaUbiUbicacion findUbicacion(Short codigo);
    public PlaUbiUbicacion findUbicacion(String descripcion);

}
