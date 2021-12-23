package com.sample.Inventory.management.system.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = InternalServerErrorException.class)
    public ResponseEntity<Object> exception(HttpServerErrorException.InternalServerError exception ) {
        return new ResponseEntity<>( "Internal Server Error",HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
