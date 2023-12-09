package org.sou.criticalSection;

public class CriticalResource {
   Integer initialValue;

  public CriticalResource(int initialValue) {
    this.initialValue = initialValue;
  }
  public  void addToValue(int i){
    int initial = initialValue;
      System.out.println("current = "+initialValue);
      initialValue = initial + i;
  }

  public int getInitialValue(){
    return initialValue;
  }
}
