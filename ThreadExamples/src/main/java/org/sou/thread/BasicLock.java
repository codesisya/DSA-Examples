package org.sou.thread;

public class BasicLock {
  public Object moniTor = new Object();
  private boolean isLocked = false;
  public void lock(){
    synchronized (moniTor){
      while(isLocked) {
        try {
          moniTor.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        isLocked = true;
        moniTor.notify();
      }
    }
  }
  public  void unlock(){
    isLocked = false;
    moniTor.notify();
  }
}
