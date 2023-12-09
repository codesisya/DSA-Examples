package org.sou.bankTransferDeadlock;

public class Driver {
  public static void main(String[] args) throws InterruptedException {
    Processor p = new Processor();
    Thread t1 = new Thread(()-> {
      try {
        p.firstThread();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    Thread t2 = new Thread(()->p.secondThread());
    t1.start();
    t2.start();
    Thread.sleep(1000);
    p.finished();
  }
}
