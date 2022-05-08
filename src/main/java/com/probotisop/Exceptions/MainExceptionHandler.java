package com.probotisop.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class MainExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(org.jsoup.HttpStatusException.class)
	public ResponseEntity<Object> HttpStatusEception (org.jsoup.HttpStatusException ex){
		
		String msg = "Please enter the curency codes correctly";
		
		return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
	}

}
