package org.sou.MyExecutorService;


public class Execution implements Runnable {
  Boolean isShutDown;
  public Execution(Boolean xyz){
    isShutDown = xyz;
  }
  void executeMyMethod() {
    if (MyThreadPool.currentCapacity < MyThreadPool.capacity) {
      MyThreadPool.currentCapacity++;
      Thread t = new Thread(this);
      t.start();
    }
  }

  @Override
  public void run() {
    while (!isShutDown) {
      if (MyThreadPool.linkedBlockingQueue.size() != 0) {
        MyThreadPool.linkedBlockingQueue.poll().run();
      }
    }
    Thread.currentThread().stop();
  }
  void shutDown(Boolean xyz){
    System.out.println("shutdown called");
    this.isShutDown = xyz;
  }
}