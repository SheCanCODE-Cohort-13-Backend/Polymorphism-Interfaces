package org.example;

public class Interfaces {
    public static void main(String[] args) {
        ConsoleLogger logC = new ConsoleLogger();
//        logC.logMessage("Hello World");
        FileLogger logF = new FileLogger();
//        logF.logMessage("Hello Java Class");
        logF.logError("File not found error!");
        logC.logError("Arithmetic error!");
    }
}

interface Logger {
    void logMessage(String message);

    default void logError(String errorMessage) {
//        System.out.println("Error: "+errorMessage);
        logMessage(errorMessage);
    }
}

class ConsoleLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("Console Log message: " + message);
    }
}

class FileLogger implements Logger {
    @Override
    public void logMessage(String message) {
        System.out.println("File Log message: " + message);
    }
}