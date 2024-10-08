package org.example.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file/ \n\n";

    public static ProgramLogger getProgramLogger() { // или можно на уровне метода использовать synchronized
        synchronized (ProgramLogger.class) {
            if (programLogger == null) {
                programLogger = new ProgramLogger();
            }
            return programLogger;
        }

    }

    private ProgramLogger() {
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
