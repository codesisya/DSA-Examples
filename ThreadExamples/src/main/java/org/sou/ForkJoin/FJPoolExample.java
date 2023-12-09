package org.sou.ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class FJPoolExample {
  public static void main(String[] args) {
    ForkJoinPool forkJoinPool = new ForkJoinPool(4);
    FJTask task = new FJTask(100);
    forkJoinPool.execute(task);
    while (!task.isDone());
    forkJoinPool.shutdown();


  }
}
