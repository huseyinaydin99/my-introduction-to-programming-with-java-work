package com.huseyinaydin;

public class BalanceInsufficentException extends Exception {
    private String message;

    public BalanceInsufficentException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
