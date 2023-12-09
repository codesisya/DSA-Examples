package org.sou.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basic {
  public static void main(String[] args) {
    String s ="abcd";
    System.out.println(s.charAt(1));
    char[] cs = s.toCharArray();
    System.out.println(cs);
   // System.out.println(s.substring(1));
    System.out.println("printing permut");
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<s.length();i++){
      sb = new StringBuilder();
      for(int j=i;j<s.length();j++){
        sb.append(s.charAt(j));
        System.out.println(sb.toString());
      }

    }
    String ss ="abcid";
    char[] chars = ss.toCharArray();
    Arrays.sort(chars);
    String sorted = String.valueOf(chars);
    System.out.println(sorted);
    Map<String, List<String>> m = new HashMap();
    String lee ="leetcode";
    int i = 0;
    int j = 8;

    for(Character c: ss.toCharArray()){
      System.out.println(c);
    }

    String ans = lee.substring(4,j);
    System.out.println(ans);
  }
}
