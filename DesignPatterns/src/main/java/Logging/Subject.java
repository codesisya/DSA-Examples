package Logging;


import java.util.HashMap;
import java.util.Map;

public class Subject {
  String data;
  Map<Level, LogObserver> observerMap = new HashMap<Level, LogObserver>();
  public void setData(String msg){
    data = msg;
  }
  public String getData(String msg){
    return data;
  }
  public void attach(Level appenderType, LogObserver ob){
    observerMap.put(appenderType,ob);
  }
  public void notifyObservers(){
    for(LogObserver ob:observerMap.values())
      ob.update(data);
  }
}
