package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqSolicitud;
import com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq.JqSolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JqSolicitudServiceImpl implements JqSolicitudService {

    @Autowired
    private JqSolicitudRepository repository;

    @Override
    public JqSolicitud save(JqSolicitud solicitud) {
        try {
            solicitud.setSolFechaMod(new Date());
            return repository.save(solicitud);
        } catch (Exception e) {
            return null;
        }
    }
}
