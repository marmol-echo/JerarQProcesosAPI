package com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqPlantillaMail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface JqMailRepository extends JpaRepository<JqPlantillaMail, BigDecimal> {

    @Procedure(value = "SP_SEND_EMAIL_JRQ", outputParameterName = "SALIDA", procedureName = "JERARQ.SP_SEND_EMAIL_JRQ")
    public String sendEmail(@Param("ASUNTO") String asunto,
                            @Param("NOTIFICACION") BigDecimal notif,
                            @Param("VHUR") BigDecimal vhur,
                            @Param("VHURCKRONO") BigDecimal vhurk,
                            @Param("ENCABEZADO") String encabezado,
                            @Param("IDS") String ids,
                            @Param("BAJAS") BigDecimal bajas);

}
