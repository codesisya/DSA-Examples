package org.sou.criticalSection;

public class CriticalResourceDriver {
  public static void main(String[] args) throws InterruptedException {
    CriticalResource resource = new CriticalResource(10);
    CriticalResourceModifier modifier = new CriticalResourceModifier(resource);
    CriticalResourceModifier modifier2 = new CriticalResourceModifier(resource);
    Thread t = new Thread(modifier);
    Thread t1 = new Thread(modifier2);
    t.start();
    t1.start();
    Thread.sleep(5000);
    System.out.println(resource.getInitialValue());
  }
}
