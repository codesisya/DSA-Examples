package org.sou.comparator;

import java.util.Arrays;

public class TwoDArraySort {
  public static void main(String[] args) {
    int n =3;
    int m = 2;
    int[][] arr = {{5,6},{3,4},{4,6},{1,2}};
   // Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
    Arrays.sort(arr,(a,b)->a[0]-b[0]);
    for(int i =0;i<arr.length;i++)
    System.out.println(arr[i][0]+" "+arr[i][1]);
  }
}
