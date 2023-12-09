package org.sou.thread;

public class ThreadLocalProcessor {
  ThreadLocal<Integer> localInt = new ThreadLocal<>();
  Integer normalInt ;

  public ThreadLocalProcessor(Integer localInt, Integer normalInt) {
    this.localInt.set(localInt);
    this.normalInt = normalInt;
  }
  public void setValues(Integer localInt, Integer normalInt) {
    this.localInt.set(localInt);
    this.normalInt = normalInt;
    System.out.println("current values = ");
    printVal();
  }
  public void printVal(){
    System.out.println(Thread.currentThread().getName()+" local="+localInt.get()+"normal="+normalInt);
  }
}
