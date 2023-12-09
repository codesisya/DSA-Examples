package org.sou.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BasicThreadPool {
  static int nThreads = 3;
  private static ExecutorService ex = Executors.newFixedThreadPool(nThreads);

  public static void main(String[] args) {
    List<Callable<Object>> callables = new ArrayList<>();
    int tasks = 5;
    for( int i =0;i<tasks;i++){
      final int num = 5;
      callables.add(()->{
        performTask(num);
        return null;
      });
    }
    try {
      ex.invokeAll(callables);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    ex.shutdown();

  }


  public static void performTask(int ticks)  {
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
