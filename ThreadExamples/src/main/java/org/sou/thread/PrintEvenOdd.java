package org.sou.thread;

public class PrintEvenOdd {
   int odd = 1;
   int even = 2;
   boolean isNextOdd = true;
   boolean isNextEven = false;
  Object monitor ;
  PrintEvenOdd(Object obj){
    monitor = obj;
  }
  public void callThreads(){
    Thread t1 = new Thread(()-> {
      try {
        printEven(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    Thread t2 = new Thread(()-> {
      try {
        printOdd(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    t1.start();
    t2.start();
  }
  public static void main(String[] args) throws InterruptedException {
   PrintEvenOdd obj = new PrintEvenOdd(new Object());
   obj.callThreads();
   Thread.sleep(5000);
  }
  public  void printOdd(int limit) throws InterruptedException {
    if(odd>limit) {
     // Thread.currentThread().stop();
      return;
    }
    synchronized (monitor) {
      while (!isNextOdd)
        monitor.wait();
      System.out.println(Thread.currentThread().getName() + " " + odd);
      odd = odd + 2;
      isNextOdd = false;
      isNextEven = true;
      monitor.notifyAll();
    }
    printOdd(limit);
  }
  public  void printEven(int limit) throws InterruptedException {
    if(even>limit) {
     // Thread.currentThread().stop();
      return;
    }
    synchronized (monitor) {

      while (!isNextEven)
        monitor.wait();
      System.out.println(Thread.currentThread().getName() + " " + even);
      even = even + 2;
      isNextOdd = true;
      isNextEven = false;
      monitor.notifyAll();
    }
    printEven(limit);
  }
}
