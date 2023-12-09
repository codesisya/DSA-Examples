//https://www.techiedelight.com/print-combinations-integers-sum-given-number/
package org.sou.bit;

import java.util.ArrayList;
import java.util.List;

public class BreakNum {
  public static void main(String[] args) {
    int n = 5;
    List<Integer> l = new ArrayList<>();
    breaks(n, l);
  }

  public void newBreaak(int n, List<Integer> l) {
    if (n == 0)
      System.out.println(l);
    for (int i = 0; i < n; i++) {
      newBreaak(n-i, );
    }
  }


  public static void breaks(int n, List<Integer> l) {
    if (n == 0) {
      System.out.println(l);
      return;
    }
    for (int i = 1; i <= n; i++) {
      if (l.size() > 0 && l.get(l.size() - 1) > i)
        continue;
      l.add(i);
      breaks(n - i, l);
      l.remove(l.size() - 1);
    }
  }
}
