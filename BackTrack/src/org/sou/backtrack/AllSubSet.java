package org.sou.backtrack;

import java.util.ArrayList;
import java.util.List;

public class AllSubSet {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    List<Integer> l1 = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    int p = 0;
    subSet(l,p, l1);
   // subSet1(l,p, l1);
  }

  static void subSet(List<Integer> l, int p, List<Integer> ans){
    System.out.println(ans);
    for(int i=p;i<l.size();i++){
      ans.add(l.get(i));
      subSet(l,i+1,ans);
      ans.remove(l.get(i));
    }
    return;
  }
  static void subSet1(List<Integer> l, int p, List<Integer> ans){
    if(p>l.size())
      return;
    System.out.println(ans);
    for(int i=p;i<l.size();i++){
      subSet1(l,i+1,ans);
      ans.add(l.get(i));
      subSet1(l,i+1,ans);
    }
    return;
  }
}
