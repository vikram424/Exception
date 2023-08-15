package com.myapp.studentdetails;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class StudentException {
	
	@ExceptionHandler(InvalidAgeException.class)
	public ResponseEntity<Object> invalidAge(InvalidAgeException nf){
		return new ResponseEntity<>(nf.getMessage(),HttpStatus.NOT_FOUND);
	}

}
