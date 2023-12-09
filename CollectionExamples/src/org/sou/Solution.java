package org.sou;

import java.util.*;

public class Solution {

  public HashMap<Integer, HashSet<Integer>> comparison;
  public int nbCallsForCompare;

  public Solution() {
    comparison = new HashMap<>();
    nbCallsForCompare = 0;
  }

  int[] compare(int[] integers) {
    nbCallsForCompare++;
    if (integers.length == 1) {
      return integers;
    } else {
      if (integers[0] > integers[1]) {
        return integers;
      } else {
        return new int[]{integers[1], integers[0]};
      }
    }
  }

  int[] slice(int[] integers, int start) {
    if (start == integers.length - 1) {
      return new int[]{integers[start]};
    } else {
      return new int[]{integers[start], integers[start + 1]};
    }
  }

  int max(int[] integers) {
    if (integers.length == 1) {
      return integers[0];
    }
    if (integers.length == 2) {
      int[] r = compare(integers);
      if (comparison.get(r[0]) == null) {
        HashSet<Integer> set = new HashSet<>();
        set.add(r[1]);
        comparison.put(r[0], set);
      } else {
        HashSet<Integer> l = new HashSet<>(comparison.get(r[0]));
        l.add(r[1]);
        comparison.put(r[0], l);
      }

      return r[0];
    }
    int p = integers.length % 2 == 0 ? integers.length / 2 : integers.length / 2 + 1;
    int[] t = new int[p];

    for (int i = 0; i < p; i++) {
      int[] cmp = compare(slice(integers, i * 2));
      t[i] = cmp[0];
      if (cmp.length > 1) {
        if (comparison.get(t[i]) == null) {
          HashSet<Integer> set = new HashSet<>();
          set.add(cmp[1]);
          comparison.put(t[i], set);
        } else {
          HashSet<Integer> l = new HashSet<>(comparison.get(t[i]));
          l.add(cmp[1]);
          comparison.put(t[i], l);
        }
      }
    }
    return max(t);
  }


  int secondMax(int[] integers) {
    int max = max(integers);
    HashSet<Integer> set = comparison.get(max);
    return set.stream().skip(set.size() - 1).findFirst().orElse(Integer.MIN_VALUE);
  }

  public static void main(String[] args) {
    Solution s = new Solution();
    int[] input = new int[]{1, 13, 45, 18, 33, 22, 26, 12, 34, 67, 89, 55, 9, 12, 17, 66, 87};
    int secondMax = s.secondMax(input);
    System.out.println(String.format("Data set length : %d", input.length));
    System.out.println(String.format("Result : %d", secondMax));
    System.out.println(String.format("Compare was called : %d", s.nbCallsForCompare));
    System.out.println(String.format("N + Log(N) is ~ %d", (int) (input.length + (Math.log(input.length) / Math.log(2)))));
  }
}
