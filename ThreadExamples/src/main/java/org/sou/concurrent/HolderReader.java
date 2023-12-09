package org.sou.concurrent;

import java.util.List;
import java.util.Set;

public class HolderReader implements Runnable{
  List<String> mySet;

  public HolderReader(List s) {
    mySet = s;

  }

  public void printSet() {

    synchronized (mySet) {
      for (String s : mySet)
        System.out.println("data=" + s+Thread.currentThread());
    }
  }


  @Override
  public void run() {
    printSet();
  }
}
