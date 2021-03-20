package main.java.com.vaneks.patterns.creational.Singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file \n\n";
    public static synchronized ProgramLogger getProgramLogger() {
        if(programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }
    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }
    public void ShowFile() {
        System.out.println(logFile);
    }
}
