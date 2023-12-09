package Logging;

public class MyLogger extends Subject {

  public void writeLog(String msg){
    setData(msg);
    notifyObservers();
  }
}
