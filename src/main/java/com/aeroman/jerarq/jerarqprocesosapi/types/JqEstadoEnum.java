package com.aeroman.jerarq.jerarqprocesosapi.types;

import java.math.BigDecimal;

public enum JqEstadoEnum {
    
    PEN(BigDecimal.valueOf(1)),
    ENV(BigDecimal.valueOf(2)),
    APR(BigDecimal.valueOf(3)),
    REC(BigDecimal.valueOf(4)),
    PRO(BigDecimal.valueOf(5)),
    ELM(BigDecimal.valueOf(6)),
    FIN(BigDecimal.valueOf(7));
    
    private final BigDecimal est;
    
    JqEstadoEnum(BigDecimal e) {
        this.est = e;
    }

    public BigDecimal getEst() {
        return est;
    }
}
