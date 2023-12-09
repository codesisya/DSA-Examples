package org.sou.exec;

import java.util.concurrent.*;

public class ExecutorSimple {
  public static void main(String[] args) {
    ExecutorService ex = Executors.newSingleThreadExecutor();
    int ticks = 5;

    Future f = ex.submit(()->task(ticks));
    ex.shutdown();
    try {
      f.get(3, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (ExecutionException e) {
      e.printStackTrace();
    } catch (TimeoutException e) {
      System.out.println("i have timed out");
      f.cancel(true);
      e.printStackTrace();
    }
  }

  public static void task(int ticks)  {
    for(int i =0;i<ticks;i++) {
      System.out.println("ticking"+ i+ " task with" + Thread.currentThread());
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
