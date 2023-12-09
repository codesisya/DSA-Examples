package org.sou.bankTransferDeadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProcessorAquireLock {
  Account a1 = new Account();
  Account a2 = new Account();
  private Lock l1 = new ReentrantLock();
  private Lock l2 = new ReentrantLock();

  private void acquireLock(Lock l1, Lock l2){
    while (true){
      boolean gotLock1 = false;
      boolean gotLock2 = false;
      // AcquireLock
      try {
         acquireLock(l1,l2);

      } catch (Exception e) {
        e.printStackTrace();
      }
      finally {
        if(gotLock1&&gotLock2)
          return;
        if(gotLock1)
          l1.unlock();
        if(gotLock2)
          l2.unlock();
      }

      // Locks not acquired
    }
  }
  public void firstThread()throws  InterruptedException{
    Random r = new Random();
    for(int i = 0;i<1000;i++){
      acquireLock(l1,l2);
      try {
        Account.transfer(a1, a2, r.nextInt(100));
      }
      finally {
        l1.unlock();
        l2.unlock();
      }
    }
  }
  public void secondThread(){
    Random r = new Random();
    for(int i = 0;i<1000;i++){
      l1.lock();
      l2.lock();
      try {
        Account.transfer(a2, a1, r.nextInt(100));
      }
      finally {
        l1.unlock();
        l2.unlock();
      }
    }
  }
  public void finished(){
    System.out.println("acc1 bal="+a1.getBalance());
    System.out.println("acc2 bal="+a2.getBalance());
    System.out.println("final bal="+(a1.getBalance()+
            a2.getBalance()));
  }
}
