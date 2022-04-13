package com.example.calculator.advice;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleArithmeticException(ArithmeticException ex) {
        String message = "Arithmetic Error: " + ex.getMessage();
        return message;
    }

        @ExceptionHandler(IllegalArgumentException.class)
        @ResponseStatus(HttpStatus.BAD_REQUEST)
        public String handlerIllegalArgumentException(IllegalArgumentException ex){
            String message = "Вы ввели неправильное значение: " + ex.getMessage();
            return message;
        }
    }


