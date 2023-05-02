package com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqSolicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface JqSolicitudRepository extends JpaRepository<JqSolicitud, BigDecimal> {
}
