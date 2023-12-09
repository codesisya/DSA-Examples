package org.sou.ForkJoin;

import java.util.concurrent.RecursiveAction;

public class FJTask extends RecursiveAction {
  int i ;
  public FJTask(int i){
    this.i = i;
  }

  @Override
  protected void compute() {
    if(i<10){
      System.out.println("i = "+i+" "+Thread.currentThread());
    }
    else {
      FJTask t1 = new FJTask(i / 2);
      FJTask t2 = new FJTask(i / 2);
      invokeAll(t1, t2);
    }
  }
}
