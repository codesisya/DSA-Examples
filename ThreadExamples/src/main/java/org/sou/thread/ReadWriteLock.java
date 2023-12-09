package org.sou.thread;

public class ReadWriteLock {
  int readers = 0;
  int writers = 0;
  int writeReqs = 0;
  public synchronized void readLock() throws InterruptedException {
    while (writeReqs>0||writers>0)
      wait();
    readers ++;
  }
  public synchronized void readUnlock(){
    readers--;
    notifyAll();
  }
  public synchronized void writeLock() throws InterruptedException {
    writeReqs++;
    while (readers>0||writers>0)
      wait();
    writeReqs--;
    writers++;
  }
}
