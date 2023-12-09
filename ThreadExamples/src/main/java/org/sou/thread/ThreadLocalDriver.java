package org.sou.thread;

public class ThreadLocalDriver {
  public static void main(String[] args) throws InterruptedException {
    ThreadLocalProcessor processor = new ThreadLocalProcessor(5,10);
    Thread t1 = new Thread(()->processor.setValues(1,2));
    Thread t2 = new Thread(()->processor.setValues(3,4));
    t1.start();
    t2.start();
    Thread.sleep(2000);
    processor.printVal();

  }
}
