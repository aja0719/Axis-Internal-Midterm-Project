package com.axis.exceptions;

@SuppressWarnings("serial")
public class IDNotFoundExceptions extends RuntimeException {

	private String msg;
	

	public IDNotFoundExceptions(String msg) {
		// TODO Auto-generated constructor stub
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
}
