package com.aeroman.jerarq.jerarqprocesosapi.repository.jerarq;

import com.aeroman.jerarq.jerarqprocesosapi.entities.jerarq.JqUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface JqUserRepository extends JpaRepository<JqUser,BigDecimal> {

    @Query("SELECT u FROM JqUser u WHERE u.resId.resId = ?1")
    public List<JqUser> findByResId(BigDecimal resId);

}
