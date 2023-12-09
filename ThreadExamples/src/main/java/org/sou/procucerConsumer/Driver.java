package org.sou.procucerConsumer;

public class Driver {
  static Processor p = new Processor();

  public static void main(String[] args)  {


    Thread t = new Thread(() -> {
      try {
        p.produce();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    Thread t1 = new Thread(()-> {
      try {
        p.consume();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    t.start();
    t1.start();
  }
}
