package org.sou.MyExecutorService;

public class MyExecutors {
  int capacity;

  static MyExecutorService myNewFixedThreadPool(int capacity) {
    return new MyThreadPool(capacity);
  }
  static MyExecutorService myScheduledThreadPool(int capacity){

    return new MyScheduledThreadPool(capacity);
  }
}
