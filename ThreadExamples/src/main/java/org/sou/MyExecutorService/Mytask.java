package org.sou.MyExecutorService;

public class Mytask implements Runnable {
  @Override
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("hii" + Thread.currentThread().getName());
  }
}