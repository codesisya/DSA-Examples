package org.sou.comb;

import java.util.ArrayList;
import java.util.List;

public class DistinceCombination {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<>();
    l.add(3);
    l.add(4);
    l.add(5);
    List<Integer> l1 = new ArrayList<>();
    //l1.add(l.get(0));
    comb(l,0,l1,2);
  }

   static void comb(List<Integer> l, int p, List<Integer> ans, int k){
    if(k==0) {
      System.out.println(ans);
      return;
    }
     k--;
    for(int i=p;i<l.size();i++){

      //List<Integer> ans1 = new ArrayList<>(ans);
      ans.add(l.get(i));
      comb(l,i+1,ans,k);
    }
  }

}
