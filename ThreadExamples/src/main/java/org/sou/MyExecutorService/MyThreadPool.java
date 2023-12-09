package org.sou.MyExecutorService;

import java.util.concurrent.LinkedBlockingQueue;

public class MyThreadPool implements MyExecutorService {
  static int capacity;
  static int currentCapacity;
  static LinkedBlockingQueue<Runnable> linkedBlockingQueue;
  Execution e;
  static Boolean isShutDOwn = false;

  public MyThreadPool(int capacity) {
    this.capacity = capacity;
    currentCapacity = 0;
    linkedBlockingQueue = new LinkedBlockingQueue<Runnable>();
    e = new Execution(isShutDOwn);
  }

  @Override
  public void submit(Runnable r) {
    linkedBlockingQueue.add(r);
    e.executeMyMethod();
  }

  @Override
  public void shutDown() {
    isShutDOwn = true;
    e.shutDown(isShutDOwn);
  }

  @Override
  public void awaitTermination(long millis) throws InterruptedException {
    Thread.sleep(millis);
  }

}