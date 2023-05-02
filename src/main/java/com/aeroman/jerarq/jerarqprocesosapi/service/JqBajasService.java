package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqPlantillaBajas;

public interface JqBajasService {

    public int save(JqPlantillaBajas baja);
    public void limpiarTabla();
}
