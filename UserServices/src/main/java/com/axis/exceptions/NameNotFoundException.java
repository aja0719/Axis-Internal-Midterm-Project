package com.axis.exceptions;

@SuppressWarnings("serial")
public class NameNotFoundException extends RuntimeException{
	
	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}


}
