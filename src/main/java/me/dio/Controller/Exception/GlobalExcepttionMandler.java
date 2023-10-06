package me.dio.Controller.Exception;

import java.util.NoSuchElementException;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import ch.qos.logback.classic.Logger;

@RestControllerAdvice
public class GlobalExcepttionMandler {
	
private final  Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ExceptionHandler(IllegalArgumentException.class)

	public ResponseEmtity<String> handlebusimessException(IllegalArgumentException busimessException){
		return new ResponseEmtity<>(businessException.getMessage(),HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)

	public ResponseEmtity<String> handleNoSuchElementException(NoSuchElementException notFoundException){
		return new ResponseEmtity<>(body: "Resource ID not found",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Throwale.class)

	public ResponseEmtity<String> handleUnerException(Throwable unexceptedException){
		
		var message = "Unexpected server error, see the logs"
;		logger.error("", unexpectedException);
		return new ResponseEmtity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
