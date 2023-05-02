package com.aeroman.jerarq.jerarqprocesosapi.msg;

public class MsgGeneric {

	private String codResp;
	private String dscResp;
	
	public MsgGeneric() {
		super();
	}

	public MsgGeneric(String codResp, String dscResp) {
		super();
		this.codResp = codResp;
		this.dscResp = dscResp;
	}

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
	
	
}
