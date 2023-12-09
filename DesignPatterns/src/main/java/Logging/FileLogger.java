package Logging;

public class FileLogger implements LogObserver {
  public void update(String msg) {
    System.out.println("logging in file"+msg);
  }
}
