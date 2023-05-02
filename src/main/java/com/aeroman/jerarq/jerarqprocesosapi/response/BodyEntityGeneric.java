package com.aeroman.jerarq.jerarqprocesosapi.response;

public class BodyEntityGeneric<T> {

	private String errorCode;
	private String errorMsg;
	private T msg;
	
	public BodyEntityGeneric() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BodyEntityGeneric(String errorCode, String errorMsg, T msg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.msg = msg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public T getMsg() {
		return msg;
	}

	public void setMsg(T msg) {
		this.msg = msg;
	}
	
	
	
}
