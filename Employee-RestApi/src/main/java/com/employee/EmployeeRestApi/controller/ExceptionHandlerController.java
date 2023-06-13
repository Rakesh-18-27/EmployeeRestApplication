package com.employee.EmployeeRestApi.controller;

import com.employee.EmployeeRestApi.exception.NotValidException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {
    @ExceptionHandler(NotValidException.class)
    public ResponseEntity<String>  handleNotValidException(NotValidException notValidException){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(notValidException.getMessage());
    }
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleConstraintViolationException(ConstraintViolationException constraintViolationException) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(constraintViolationException.getMessage().substring(34));
    }
}
