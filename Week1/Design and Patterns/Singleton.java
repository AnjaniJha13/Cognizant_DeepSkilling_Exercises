package com.exercise1;

public class Logger {
    private static Logger obj = new Logger();

    private Logger() {
        System.out.println("Logger object created");
    }

    public static Logger getInstance(){
        return obj;

    }

}
