package com.aeroman.jerarq.jerarqprocesosapi.request;

public class GenericRequest <T>{
	private T msg;

	public GenericRequest() {
		super();
	}

	public GenericRequest(T msg) {
		super();
		this.msg = msg;
	}

	public T getMsg() {
		return msg;
	}

	public void setMsg(T msg) {
		this.msg = msg;
	}
	
	

}
