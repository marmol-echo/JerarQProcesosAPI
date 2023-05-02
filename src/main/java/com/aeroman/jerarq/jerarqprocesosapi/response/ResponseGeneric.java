package com.aeroman.jerarq.jerarqprocesosapi.response;

public class ResponseGeneric<T> {

	private T response;

	public ResponseGeneric() {
		super();
	}
	
	
	public ResponseGeneric(T response) {
		super();
		this.response = response;
	}

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}
	
	
}
