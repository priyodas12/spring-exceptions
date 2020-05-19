package io.springlab.springexceptions.exceptionhandler;

import io.springlab.springexceptions.controllerexception.InvalidFieldException;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class ProductExceptionHandler {

    @ExceptionHandler
    public String handleInvalidFieldException(InvalidFieldException e){
        return e.getMessage();
    }
}
