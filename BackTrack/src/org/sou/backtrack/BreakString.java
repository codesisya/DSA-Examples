package org.sou.backtrack;

import java.util.ArrayList;
import java.util.List;

public class BreakString {
  public static void main(String[] args) {
    String s = "abcd";
    breakStr(s,0, new ArrayList<>());
  }
  static void breakStr(String s, int p, List<String> l){
    if(p==s.length())
      System.out.println(l);
    for(int i=p;i<s.length();i++){
      l.add(s.charAt(i)+"");
      breakStr(s,i+1,l);
    }
  }
}
