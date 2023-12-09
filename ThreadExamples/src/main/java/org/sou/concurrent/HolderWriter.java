package org.sou.concurrent;

import java.util.List;
import java.util.Set;

public class HolderWriter implements Runnable {

  List<String> myList;

  public HolderWriter(List s) {
    myList = s;
  }
  public void addToSet(String s) {
    synchronized (myList) {
      myList.add(s);
    }
    System.out.println("added:" + s);
  }



  @Override
  public void run() {
    addToSet("abn");
  }
}
