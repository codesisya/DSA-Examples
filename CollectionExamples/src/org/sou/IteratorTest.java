package org.sou;

import java.util.*;
import java.util.stream.Collectors;

public class IteratorTest {
  public static void main(String[] args) {
    List<Integer> l = Arrays.asList(new Integer[]{1, 4, 6, 2, 3});
    l.sort(Collections.reverseOrder());
    l.sort((a,b) ->a-b);
    Iterator it = l.iterator();
    while(it.hasNext())
      System.out.println(it.next());

  }
}
