package org.sou;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapCreation {
  public static void main(String[] args) {
    Map<String, String> m = Map.of("a", "b", "c", "d");
    Map<String, Integer> m1 = Map.of("a", 2, "d", 0, "c", 5, "b", 3);
    Map<String, Integer> map = new HashMap<>();
    IntStream.range(1, 5)
            .forEach(System.out::println);
    List<Map.Entry<String, Integer>> list
            = new LinkedList<Map.Entry<String, Integer>>(
            map.entrySet());

    // Sort the list using lambda expression
    Collections.sort(
            list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));

    // put data from sorted list to hashmap
    HashMap<String, Integer> temp
            = new LinkedHashMap<String, Integer>();
    for (Map.Entry<String, Integer> aa : list) {
      temp.put(aa.getKey(), aa.getValue());
    }
    System.out.println(m);
    System.out.println(m1);
  }
}
