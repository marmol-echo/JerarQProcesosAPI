package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqPlantillaBajas;
import com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq.JqPlantillaBajasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JqBajasServiceImpl implements JqBajasService {

    @Autowired
    private JqPlantillaBajasRepository repository;

    @Override
    public int save(JqPlantillaBajas baja) {
        try {
            baja = repository.save(baja);
            return baja.getBajId().toBigInteger().intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public void limpiarTabla() {
        try {
            repository.deleteAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
