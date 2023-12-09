package org.sou.sotting;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
  public static void main(String[] args) {

    int[] nums = {1,2,34,5};
    //Arrays.sort(nums,(a,b)-> Comparator.comparingInt(a,b));
    int[] sortedNums = Arrays.stream(nums)
            .boxed()
            .sorted((a,b)->a-b)
            .mapToInt(i->i)
            .toArray();
    int[] arr = Arrays.stream(nums)
            .boxed()
            .mapToInt(i->i)
            .toArray();
  }
}
