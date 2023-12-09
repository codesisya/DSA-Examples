package org.sou.string;

import java.util.*;

public class StringSort {
  public static void main(String[] args) {
    String s = "abnde";
    //Collections.sort(s.toCharArray());
    char[] cs = s.toCharArray();
    Arrays.sort(cs);
    String sorted = new String(cs);
    System.out.println(sorted);
    String s1 = "bhj";
    System.out.println(s.compareTo(s1));
    PriorityQueue<String> pq1 = new PriorityQueue<>((a,b)->a.compareTo(b));
    Map<String, Integer> m = new HashMap();
    PriorityQueue<String> pq = new PriorityQueue<String>(( a,  b)->{
       if(m.get(a) == m.get(b))
         return ( a.compareTo( b));
      return m.get(b) -m.get(a);
    }) ;

    String[] logs ={"abcd xyz","ghjk iol"};
    Arrays.sort(logs, (a,b)->{
      String a1 = (String) a;
      String[] as = a1.split(" ");
      String b1 = (String) b;
      String[] bs = b1.split(" ");

      if(Character.isDigit(bs[1].charAt(0)) && !Character.isDigit(as[1].charAt(0)))
        return -1;
      if(Character.isDigit(as[1].charAt(0)) && !Character.isDigit(bs[1].charAt(0)))
        return 1;
      //Math.max()
      return 0;
    });
    for(String log:logs)
    System.out.println(log);
    String s2 = s.substring(logs[1].length()).compareTo((s.substring(logs[1].length()));
  }
}
