package com.yanagv.task.array.exeption;

public class CustomArrayException extends Exception {
    public CustomArrayException() {
        super();
    }

    public CustomArrayException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomArrayException(String message) {
        super(message);
    }

    public CustomArrayException(Throwable cause) {
        super(cause);
    }
}
