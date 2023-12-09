package org.sou;

import java.util.TreeMap;

public class TreeMapExample {
  public static void main(String[] args) {
    TreeMap<Integer, Integer> tm = new TreeMap<>();
    tm.put(1,1);
    tm.put(2,2);
    tm.put(3,3);
    tm.put(4,4);
    tm.put(0,0);
    tm.put(10,10);
    tm.put(20,20);
    for(Integer i :tm.keySet())
      System.out.println(i+","+tm.get(i));
    System.out.println(tm.lowerKey(15));
    System.out.println(tm.lowerKey(0));
  }
}
