package com.employee.EmployeeRestApi.exception;

public class NotValidException extends RuntimeException{
    public NotValidException(String message){
        super(message);
    }

    public NotValidException() {
    }
}
