package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaUbiUbicacion;
import com.aeroman.jerarq.jerarqprocesosapi.repository.vhur.PlaUbicacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaUbicacionServiceImpl implements PlaUbicacionService {

    @Autowired
    private PlaUbicacionRepository repository;

    @Override
    public PlaUbiUbicacion save(PlaUbiUbicacion ubicacion) {
        try {
            return repository.save(ubicacion);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<PlaUbiUbicacion> validarBahia(String codigo) {
        try {
            return repository.validarBahia(codigo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public PlaUbiUbicacion findUbicacion(Short codigo) {
        try {
            return repository.findByUbiCodigo(codigo).orElse(null);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public PlaUbiUbicacion findUbicacion(String descripcion) {
        try {
            return repository.findByUbiDescripcion(descripcion.trim().toUpperCase()).orElse(null);
        } catch (Exception e) {
            return null;
        }
    }
}
