package org.sou.comb;

import java.util.ArrayList;
import java.util.List;

public class AllComb {
  public static void main(String[] args) {
    int n = 5;
    allComb(n, new ArrayList<>(),1);
  }

  public static void allComb(int n, ArrayList<Integer> l, int k) {
    if (n == 0) {
      for (int x : l)
        System.out.print(x + ",");
      System.out.println();
      return;
    }
    for (int i = k; i <= n; i++) {
      l.add(i);
      allComb(n - i, l,i);
      l.remove(l.size() - 1);
    }
  }
}
