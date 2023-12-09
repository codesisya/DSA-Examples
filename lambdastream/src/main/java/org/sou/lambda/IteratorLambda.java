package org.sou.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorLambda {
  public static void main(String[] args) {
    List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);
    l.forEach(integer -> System.out.println(integer));
    l.forEach(System.out::println);
    l.stream()
            .map(String::valueOf) //static method
            .forEach(System.out::println); //instance method
    System.out.println(l.stream()
            .reduce(0, (total, e) -> Integer.sum(total, e)));
    System.out.println(l.stream()
            .reduce(0, Integer::sum));
    System.out.println(l.stream()
            .filter(e -> e % 2 == 0)
            .mapToInt(e -> 2 * e)
            .sum());
    l.stream()
            .filter(e->e%2==0)
            .map(e->e*2)
            .collect(Collectors.toList()); //dont do shared mutability, it is thread safe
  }
}
