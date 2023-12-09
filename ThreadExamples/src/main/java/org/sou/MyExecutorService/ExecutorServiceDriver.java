package org.sou.MyExecutorService;

import java.util.concurrent.*;

public class ExecutorServiceDriver {
  public static void main(String[] args) throws InterruptedException {
    MyExecutorService service = MyExecutors.myNewFixedThreadPool(3);
    for (int i = 0; i < 20; i++) {
      service.submit(new Mytask());
    }
    service.awaitTermination(5000);
    service.shutDown();
   /* ExecutorService ex = Executors.newFixedThreadPool(5);
    ex.submit(()->testMethod());*/

    /*ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(4);
    //scheduled.scheduleAtFixedRate(()->testMethod(),3,3,TimeUnit.SECONDS);
    DelayQueue<Delayed> dq = new DelayQueue<Delayed>();
    ex.awaitTermination(4,TimeUnit.SECONDS);
    ex.shutdown();
    Thread t = new Thread(()->testMethod());
    t.start();*/
  }
  public static   void testMethod(){
    System.out.println("test called" + Thread.currentThread().getName());
  }
}
