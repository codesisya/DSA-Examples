package org.sou.offsetExample;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;

public class WriterThread implements Runnable{
  BlockingDeque<String> filesToProcess;
  Lock checkQueueAndTakeLock;
  CountDownLatch signalEndOfWork;

  public WriterThread(BlockingDeque<String> filesToProcess){
    this.filesToProcess = filesToProcess;
  }

  public void setCheckQueueAndTakeLock(Lock checkQueueAndTakeLock) {
    this.checkQueueAndTakeLock = checkQueueAndTakeLock;
  }

  public void setSignalEndOfWork(CountDownLatch signalEndOfWork) {
    this.signalEndOfWork = signalEndOfWork;
  }

  @Override
  public void run() {
    String tName = Thread.currentThread().getName();
    String path;
    while ( (path = getNextInput())!=null){
      System.out.println("processing path "+path+" thread="+tName);
    }
    this.signalEndOfWork.countDown();
  }

  private String getNextInput(){
    String file = null;
    this.checkQueueAndTakeLock.lock();
    if(!filesToProcess.isEmpty()) {
      try {
        file = filesToProcess.take();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      finally {
        this.checkQueueAndTakeLock.unlock();
      }
    }
    return file;
  }
}
