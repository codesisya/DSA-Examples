package org.sou.criticalSection;

public class CriticalResourceModifier implements Runnable{
  CriticalResource resource ;

  public CriticalResourceModifier(CriticalResource resource) {
    this.resource = resource;
  }


  @Override
  public void run() {
    System.out.println(
            Thread.currentThread().getName()+" initial="+resource.getInitialValue());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    resource.addToValue(5);
  }
}
