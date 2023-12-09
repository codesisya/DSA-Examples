package org.sou.sotting;

import java.util.Arrays;

public class Sort2DArray {
  public static void main(String[] args) {
    int[][] arr = {{1, 5}, {2, 3}, {1, 3}, {1, 4}};
    Arrays.sort(arr, (int[] a, int[] b) -> {
      if (a[0] == b[0])
        return a[1] - b[1];
      return a[0] - b[0];
    });
    for (int[] x : arr) {
      System.out.println(x[0] + "," + x[1]);
    }
  }
}
