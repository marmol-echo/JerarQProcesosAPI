package com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqDetalleSolicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface JqDetalleSolRepository extends JpaRepository<JqDetalleSolicitud, BigDecimal> {

    @Query("SELECT d FROM JqDetalleSolicitud d WHERE " +
            "d.solId.estId.estId = ?1 AND d.detAutorizado = 0 ORDER BY d.solId.solFechaCrea ASC")
    public List<JqDetalleSolicitud> findByEstId(BigDecimal estId);

}
