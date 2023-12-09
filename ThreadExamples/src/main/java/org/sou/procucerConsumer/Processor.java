package org.sou.procucerConsumer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Processor {
  private LinkedList<Integer> l = new LinkedList<>();
  private final int LIMIT = 10;
  private Object lock = new Object();
  public void produce() throws InterruptedException{
    int val = 0;
    while (true){
      synchronized (lock) {
        while (l.size() == LIMIT)
          lock.wait();
        l.add(val++);
        lock.notify();
      }
    }
  }

  public void consume() throws InterruptedException{
    while (true){
      synchronized (lock){
        while (l.size() == 0)
          lock.wait();
        System.out.println("list size = "+l.size());
        int val = l.removeFirst();
        System.out.println("removed val ="+val);
        lock.notify();
      }
      Thread.sleep(500);
    }
  }

}
