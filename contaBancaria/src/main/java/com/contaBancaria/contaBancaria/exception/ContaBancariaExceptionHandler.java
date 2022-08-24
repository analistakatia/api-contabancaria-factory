package com.contaBancaria.contaBancaria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ContaBancariaExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> exceptionHandlerDadosInvalidos(HttpMessageNotReadableException exception, HttpServletRequest request){
        return new ResponseEntity<>("DADOS INVÁLIDOS. OPERAÇÃO FINALIZADA", HttpStatus.BAD_REQUEST);
    }
}
