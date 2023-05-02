package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqPeriodoAut;
import com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq.JqPeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JqPeriodoServiceImpl implements JqPeriodoService {

    @Autowired
    private JqPeriodoRepository repository;

    @Override
    public List<JqPeriodoAut> getPeriodos() {
        return repository.findAll();
    }

    @Override
    public JqPeriodoAut save(JqPeriodoAut periodo) {
        try {
            return repository.save(periodo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
