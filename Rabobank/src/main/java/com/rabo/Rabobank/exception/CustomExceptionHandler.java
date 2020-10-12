/**
 * 
 */
package com.rabo.Rabobank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author karthik
 *
 */

@ControllerAdvice
public class CustomExceptionHandler {
	
	@ExceptionHandler(CSVException.class)
	public ResponseEntity<ErrorResponse> csvException(CSVException csvEx){
		ErrorResponse error = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), csvEx.getMessage());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> csvException(Exception ex){
		ErrorResponse error = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
