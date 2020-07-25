package com.huseyinaydin;

public class Main {

    public static void main(String[] args) {
        BaseLogger[] baseLoggers = {new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
        for (BaseLogger baseLogger : baseLoggers){
            baseLogger.log("log mesajı");
        }
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
