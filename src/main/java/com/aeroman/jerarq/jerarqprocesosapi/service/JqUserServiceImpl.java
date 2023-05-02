package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqUser;
import com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq.JqUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class JqUserServiceImpl implements JqUserService {

    @Autowired
    private JqUserRepository repository;

    @Override
    public List<JqUser> findAll() {
        try {
            return repository.findAll();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    @Override
    public List<JqUser> findAllByRes(int resId) {
        try {
            return repository.findByResId(BigDecimal.valueOf(resId));
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
