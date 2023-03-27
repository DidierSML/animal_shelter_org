package com.example.animal_shelter_org.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NotFoundCustomException extends RuntimeException {

    private final String message;
}

