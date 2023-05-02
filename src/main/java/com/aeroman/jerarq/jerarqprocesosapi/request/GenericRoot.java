package com.aeroman.jerarq.jerarqprocesosapi.request;

public class GenericRoot <T>  {

	private T request;

	public GenericRoot() {
		super();
	}

	public GenericRoot(T request) {
		super();
		this.request = request;
	}

	public T getRequest() {
		return request;
	}

	public void setRequest(T request) {
		this.request = request;
	}
	
	
}
