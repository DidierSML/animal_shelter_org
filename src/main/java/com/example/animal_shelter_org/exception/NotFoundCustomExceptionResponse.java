package com.example.animal_shelter_org.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class NotFoundCustomExceptionResponse {

    private HttpStatus statusCode;
    private String statusMsg;
}
