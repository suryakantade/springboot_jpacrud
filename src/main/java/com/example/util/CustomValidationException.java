package com.example.util;

public class CustomValidationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String error_code;
	public String error_message;
	public CustomValidationException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomValidationException(String error_code, String error_message) {
		super(error_message);
		// TODO Auto-generated constructor stub
	}
	
	
}
