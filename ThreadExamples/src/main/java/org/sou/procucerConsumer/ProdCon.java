package org.sou.procucerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdCon {
  static BlockingQueue<Integer> bq = new ArrayBlockingQueue(10);

  public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread(()->produce());
    Thread t1 = new Thread(()->consume());
    t.start();
    t1.start();
    t.join();
    t1.join();
  }
  public static void produce(){
    Random r = new Random();
    while(true){
      try {
        bq.put(r.nextInt(100));
        Thread.sleep(200);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
  public static void consume(){
    Random r = new Random();
    while (true){
      if(r.nextInt(1000)%10 ==0){
        try {
          Integer i = bq.take();
          System.out.println("taken="+i+"size = "+bq.size());
          Thread.sleep(500);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
