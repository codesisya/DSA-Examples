package org.sou.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurHashMap {
  public static void main(String[] args) {
    ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap<>();
    hm.put("x",1);
    System.out.println(hm);
    Map<String, Integer> m = new HashMap<>();
    m.put("x",1);
  }
}
