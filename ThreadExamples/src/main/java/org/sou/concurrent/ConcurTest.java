package org.sou.concurrent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcurTest {

  public static void main(String[] args) {
    List<String> s = new ArrayList<>();
    s.add("abc");
    s.add("olp");
    Thread t1 = new Thread(new HolderReader(s));
    Thread t2 = new Thread(new HolderWriter(s));
    t1.start();
    t2.start();
  }
}
