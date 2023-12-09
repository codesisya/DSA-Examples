package org.sou.concurrent;

import org.apache.commons.collections4.trie.PatriciaTrie;

public class ConcurTrieTest {
  public static void main(String[] args) {
    PatriciaTrie<String> pt = new PatriciaTrie<>();
    pt.put("xyz","123");
    pt.put("sdf","123");
    pt.put("sd","123");
    pt.put("rt","123");
    Thread tr = new Thread(new TrieReader(pt));
    Thread  tw = new Thread(new TrieWriter((pt)));
    tr.start();
    tw.start();
  }
}
