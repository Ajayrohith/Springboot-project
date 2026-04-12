package com.project.RestApi.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.project.RestApi.Components.ErrorResponse;

@ControllerAdvice
public class RestApiExceptionHandler {

     //Below code added to handle custom exception. It is called in above method
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleexception(CustomException e)
    {
        ErrorResponse customError = new ErrorResponse(-1, e.getMessage(), System.currentTimeMillis());

        return new ResponseEntity<>(customError,HttpStatus.BAD_REQUEST);
    }

    //Below is the generic exception added to handle any exception and send the error back as json

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handlegenericException(Exception exc)
    {
        ErrorResponse genericError = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), exc.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(genericError,HttpStatus.BAD_REQUEST);
    }

}
