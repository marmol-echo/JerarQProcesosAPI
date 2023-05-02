package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqHomologacion;
import com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq.JqHomologaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JqHomologaServiceImpl implements JqHomologaService {

    @Autowired
    private JqHomologaRepository repository;

    @Override
    public List<JqHomologacion> getHomologacionesVhur() {
        return repository.findAll();
    }

    @Override
    public List<JqHomologacion> getHomologacionesVhur(String bahia) {
        try {
            return repository.findByHmlVhur(bahia.trim().toUpperCase());
        } catch (Exception e) {
            return null;
        }
    }
}
