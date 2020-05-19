package io.springlab.springexceptions.exceptionhandler;

import io.springlab.springexceptions.controllerexception.InvalidFieldException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler
    public String handleInvalidFieldException(InvalidFieldException e){
        return e.getMessage();
    }
}
