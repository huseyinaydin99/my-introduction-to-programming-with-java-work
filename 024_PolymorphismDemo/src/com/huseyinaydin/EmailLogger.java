package com.huseyinaydin;

public class EmailLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Email log: " + message);
    }
}
