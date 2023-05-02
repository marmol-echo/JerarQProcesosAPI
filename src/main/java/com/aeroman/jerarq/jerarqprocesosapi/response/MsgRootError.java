package com.aeroman.jerarq.jerarqprocesosapi.response;

public class MsgRootError {
	private String Code;
	private String messageCode;
	

	public MsgRootError() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public MsgRootError(String code, String messageCode) {
		super();
		Code = code;
		this.messageCode = messageCode;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}


}
