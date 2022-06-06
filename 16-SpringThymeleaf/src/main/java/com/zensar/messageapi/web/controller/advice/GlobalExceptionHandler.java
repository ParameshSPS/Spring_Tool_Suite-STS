package com.zensar.messageapi.web.controller.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // This is used to handle exception generated in controller class
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class) // Her you specify type of exception
    public String handleException()
    {
        return "error";
    } 
}