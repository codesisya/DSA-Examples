package org.sou.concurrent;

import org.apache.commons.collections4.trie.PatriciaTrie;

import java.util.List;

public class TrieWriter implements Runnable {

  PatriciaTrie<String> myList;

  public TrieWriter(PatriciaTrie s) {
    myList = s;
  }

  public void addToSet(String s) {
    synchronized (myList) {
      for (int i = 0; i < 10; i++) {
        myList.put(s + i, "abc");
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
      System.out.println("added:" + s + Thread.currentThread());
    }
  }


  @Override
  public void run() {
    addToSet("abn");
  }
}
