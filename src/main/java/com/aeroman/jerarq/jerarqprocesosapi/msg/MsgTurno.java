package com.aeroman.jerarq.jerarqprocesosapi.msg;

public class MsgTurno {

    private String codResp;
    private String dscResp;
    private String codTurno;

    public MsgTurno() {}

    public String getCodResp() {
        return codResp;
    }

    public void setCodResp(String codResp) {
        this.codResp = codResp;
    }

    public String getDscResp() {
        return dscResp;
    }

    public void setDscResp(String dscResp) {
        this.dscResp = dscResp;
    }

    public String getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(String codTurno) {
        this.codTurno = codTurno;
    }
}
