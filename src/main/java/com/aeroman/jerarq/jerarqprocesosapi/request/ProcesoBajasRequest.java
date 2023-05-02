package com.aeroman.jerarq.jerarqprocesosapi.request;

public class ProcesoBajasRequest {

    private String employee; // Codigo 86 del colaborador

    public ProcesoBajasRequest() {}

    public ProcesoBajasRequest(String employee) {
        this.employee = employee;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
}
