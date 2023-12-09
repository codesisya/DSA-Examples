package org.sou.comparator;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapReverse {
  public static void main(String[] args) {
    Map<Integer, Integer> m1 = new TreeMap<>();
    Map<Integer,Integer> m2 = new TreeMap<>(Collections.reverseOrder());
    m1.putIfAbsent(2,5);
    m2.putIfAbsent(2,5);
    m1.putIfAbsent(5,6);
    m2.putIfAbsent(5,6);
    m1.putIfAbsent(1,9);
    m2.putIfAbsent(1,9);
    m1.putIfAbsent(4,9);
    m2.putIfAbsent(4,9);
    m1.putIfAbsent(19,5);
    m2.putIfAbsent(19,5);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(((TreeMap<Integer, Integer>) m1).floorEntry(25));
    String s = "abcdef";
    s.startsWith()
  }
}
