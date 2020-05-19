package io.springlab.springexceptions.controllerexception;

public class InvalidFieldException extends RuntimeException {


    private static final long serialVersionUID = -1407967840611857402L;

    private String message;

    public InvalidFieldException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
