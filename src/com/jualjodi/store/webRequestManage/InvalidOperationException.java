package com.jualjodi.store.webRequestManage;

public class InvalidOperationException extends Exception {
    private String message;

    public InvalidOperationException(String mesage) {
        this.message = mesage;
    }

    public InvalidOperationException() {

    }

    @Override
    public String getMessage() {
        return message;
    }
}
