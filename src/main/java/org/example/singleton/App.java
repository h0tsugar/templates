package org.example.singleton;

public class App {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First Log");
        ProgramLogger.getProgramLogger().addLogInfo("Second Log");

        ProgramLogger.getProgramLogger().showLogFile();

        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());
        System.out.println(ProgramLogger.getProgramLogger());
    }
}
