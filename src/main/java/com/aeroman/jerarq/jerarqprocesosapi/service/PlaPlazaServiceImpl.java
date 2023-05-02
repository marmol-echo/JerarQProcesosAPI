package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.vhur.PlaPlzPlaza;
import com.aeroman.jerarq.jerarqprocesosapi.repository.vhur.PlaPlazaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaPlazaServiceImpl implements PlaPlazaService {

    @Autowired
    private PlaPlazaRepository plazaRepository;

    @Override
    public PlaPlzPlaza getPlazaByCod(Integer codigo) {
        try {
            return plazaRepository.findByPlzCodigo(codigo).orElse(null);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public PlaPlzPlaza findPlazaCia(Integer codcia, Integer codplz) {
        return plazaRepository.findByCodAe(codcia, codplz).orElse(null);
    }

    @Override
    public List<PlaPlzPlaza> validarPuesto(String codigo) {
        try {
            return plazaRepository.validarPuesto(codigo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public PlaPlzPlaza actualizarPlaza(PlaPlzPlaza plaza) {
        try {
            //ubicacionService.save(plaza.getPlzCodubi());
            plaza = plazaRepository.save(plaza);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return plaza;
    }

}
