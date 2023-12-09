package org.sou.concurrent;

import org.apache.commons.collections4.trie.PatriciaTrie;

import java.util.List;

public class TrieReader implements Runnable{
  PatriciaTrie<String> mySet;

  public TrieReader(PatriciaTrie s) {
    mySet = s;

  }

  public void printSet() throws InterruptedException {

   // synchronized (mySet) {
      for (String s : mySet.keySet()) {
        Thread.sleep(1000);
        System.out.println("data=" + s + ":" + mySet.get(s)+Thread.currentThread());
      }
   // }
  }


  @Override
  public void run() {
    try {
      printSet();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
