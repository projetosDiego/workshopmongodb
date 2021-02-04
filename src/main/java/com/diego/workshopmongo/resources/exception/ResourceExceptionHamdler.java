package com.diego.workshopmongo.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.diego.workshopmongo.services.exception.ObjectNotFoundEception;

@ControllerAdvice
public class ResourceExceptionHamdler {
	
	@ExceptionHandler(ObjectNotFoundEception.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundEception e, HttpServletRequest request){
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Nao encontrado", e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}
