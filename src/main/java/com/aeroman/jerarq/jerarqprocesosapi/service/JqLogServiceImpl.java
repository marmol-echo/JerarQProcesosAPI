package com.aeroman.jerarq.jerarqprocesosapi.service;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqDetalleSolicitud;
import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqLog;
import com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq.JqLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JqLogServiceImpl implements JqLogService {

    @Autowired
    private JqLogRepository repository;

    @Override
    public JqLog save(JqDetalleSolicitud det) {
        JqLog log = new JqLog();
        log.setLogSolId(det.getSolId());
        log.setEstProc(det.getSolId().getEstId());
        log.setLogFechaProc(det.getSolId().getSolFechaMod());
        log.setLogUsu(det.getSolId().getSolUsuMod());
        log.setLogMotivoFalla(det.getDetMotivoRechazo());
        try {
            return repository.save(log);
        } catch (Exception e) {
            return null;
        }
    }
}
