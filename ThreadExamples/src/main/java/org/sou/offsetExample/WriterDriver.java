package org.sou.offsetExample;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WriterDriver {
  static int nThreads = 5;
  static int numTasks = 50;
  public static void main(String[] args) throws InterruptedException {
    BlockingDeque<String> filesToProcess = collectPaths(numTasks);
    ExecutorService service = Executors.newFixedThreadPool(nThreads);
    AtomicInteger totalRecordsRead = new AtomicInteger();
    Lock checkForEmptyLock = new ReentrantLock();
    CountDownLatch allTaskFinished = new CountDownLatch(nThreads);
    for(int i =0;i<nThreads;i++){
      WriterThread wt = new WriterThread(filesToProcess);
      wt.setCheckQueueAndTakeLock(checkForEmptyLock);
      wt.setSignalEndOfWork(allTaskFinished);
      service.submit(wt);
    }
    allTaskFinished.await();
    service.shutdownNow();
  }
  public static BlockingDeque<String> collectPaths(int numTasks){
    BlockingDeque<String > dq = new LinkedBlockingDeque();
    for(int i=0;i<numTasks;i++){
      dq.add("File--"+i);
    }
    return  dq;
  }
}

