package com.aeroman.jerarq.jerarqprocesosapi.response;

public class ResponseRootError {

	private MsgRootError response;

	public ResponseRootError() {
		super();
	}

	public ResponseRootError(MsgRootError response) {
		super();
		this.response = response;
	}

	public MsgRootError getResponse() {
		return response;
	}

	public void setResponse(MsgRootError response) {
		this.response = response;
	}

}
