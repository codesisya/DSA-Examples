package Logging;

public class MyLogManager {

  public static MyLogger getLogger() {
    MyLogger myLogger = new MyLogger();
    LogObserver ob = new FileLogger();
    myLogger.attach(Level.INFO,ob);
    return myLogger;
  }
}
