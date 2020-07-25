package com.huseyinaydin;

public class DatabaseLogger extends BaseLogger {
    @Override
    public void log(String message) {
        System.out.println("Database log: " + message);
    }
}
