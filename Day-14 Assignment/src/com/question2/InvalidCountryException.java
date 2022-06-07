package com.question2;

public class InvalidCountryException extends java.lang.Exception{

	public InvalidCountryException() {
		super();
	
	}

	public InvalidCountryException(String message, Throwable cause, boolean enableSuppression,boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public InvalidCountryException(String message, Throwable cause) {
		super(message, cause);
	
	}

	public InvalidCountryException(String message) {
		super(message);
		
	}

	public InvalidCountryException(Throwable cause) {
		super(cause);
	
	}

	
}
