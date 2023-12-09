package org.sou.streams;

import java.security.cert.CollectionCertStoreParameters;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayStream {
  public static void main(String[] args) {
    int[] num = {1,2,3,4,7,8,5};
    IntStream.of(num)
            .min()
            .ifPresent(System.out::println);
    int min = IntStream.of(num)
            .min()
            .getAsInt();
    List<Integer> l = IntStream.of(num)
            .sorted()
            .limit(3)
            .map((i)->myMap(i))
            .boxed()
            .collect(Collectors.toList());
    System.out.println(l);
    IntStream.range(1,100)
            .boxed()
            .collect(Collectors.toList());
  }
  public static int myMap(int x){
    System.out.println(Thread.currentThread());
    System.out.println("received="+x);
    return x;
  }
}
