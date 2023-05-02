package com.aeroman.jerarq.jerarqprocesosapi.request;

public class PostBahiaRequest {

    private String employee; // Codigo 86 del colaborador
    private String bahia;

    public PostBahiaRequest() {}

    public PostBahiaRequest(String employee, String bahia) {
        this.employee = employee;
        this.bahia = bahia;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getBahia() {
        return bahia;
    }

    public void setBahia(String bahia) {
        this.bahia = bahia;
    }
}
