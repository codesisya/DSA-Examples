package org.sou.sort;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListSort {
  public static void main(String[] args) {
    Integer[] arr = {1,5,3,4, 12, 9};
    List<Integer> l = Arrays.asList(new Integer[]{1,5,7,2, 10, 13});
    List<Integer> l1 = Arrays.asList(arr);
    l.sort(Collections.reverseOrder());
    l1.sort((a,b)->a-b);
    System.out.println(l);
    System.out.println("--------");
    System.out.println(l1);
    Collections.sort(l);
    System.out.println("--------");
    System.out.println(l);
    l.removeAll(l1);
    TreeMap<Integer, Integer> tm = new TreeMap<>();
    tm.subMap(1,true,3,false);
  }
}
