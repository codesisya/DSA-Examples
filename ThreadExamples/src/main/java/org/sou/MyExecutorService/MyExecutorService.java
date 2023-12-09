package org.sou.MyExecutorService;

public interface MyExecutorService {
  void submit(Runnable r);
  void shutDown();
  void awaitTermination(long millis) throws InterruptedException;
}
