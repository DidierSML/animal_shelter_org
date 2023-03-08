package com.example.animal_shelter_org.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandler {


    @org.springframework.web.bind.annotation.ExceptionHandler(NotFoundCustomException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public NotFoundCustomExceptionResponse handleNotFoundException (NotFoundCustomException ex){

        return new NotFoundCustomExceptionResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
    }


}
