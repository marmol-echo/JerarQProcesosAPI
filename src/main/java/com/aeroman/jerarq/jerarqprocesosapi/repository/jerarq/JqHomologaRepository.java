package com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqHomologacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface JqHomologaRepository extends JpaRepository<JqHomologacion,BigDecimal> {

    public List<JqHomologacion> findByHml12136(String bahia);
    public List<JqHomologacion> findByHmlVhur(String bahia);

}
