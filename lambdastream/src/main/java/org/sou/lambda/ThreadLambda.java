package org.sou.lambda;

public class ThreadLambda {
  public static void main(String[] args) {
    Thread th = new Thread(()->
      System.out.println("im in a thread"));
    th.start();

  }
}
