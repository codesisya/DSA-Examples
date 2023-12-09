package org.sou.comb;

import java.util.ArrayList;
import java.util.List;

public class CombinationOfSum {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    int num = 5;
    int[] arr = new int[num];
    breakNum(1, num, arr, 0);
  }

  public static void breakNum(int i, int n, int[] arr, int idx) {
   // System.out.println("called with= " + i+" "+ (n)+" " + "," + (idx));
   // print(arr,5);
    if (n == 0) {
      //System.out.println("answer::::");
      print(arr, idx);

    }
    for (int j = i; j <= n; j++) {
      arr[idx] = j;
      //System.out.println("calling= " + j +" "+ (n-j)+" " + "," + (idx+1));
      //print(arr,5);
      breakNum(j, n - j, arr, idx + 1);
    }

  }

  static void print(int[] arr, int n) {
    for (int i = 0; i < n; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
}

