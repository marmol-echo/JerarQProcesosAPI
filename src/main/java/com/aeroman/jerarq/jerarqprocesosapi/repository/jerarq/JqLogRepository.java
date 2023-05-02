package com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface JqLogRepository extends JpaRepository<JqLog, BigDecimal> {
}
