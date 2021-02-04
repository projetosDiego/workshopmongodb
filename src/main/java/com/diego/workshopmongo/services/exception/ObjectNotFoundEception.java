package com.diego.workshopmongo.services.exception;

public class ObjectNotFoundEception extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundEception(String msg) {
		super(msg);
	}

}
