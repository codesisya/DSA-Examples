package org.sou.backtrack;

public class AllPerm {
  public static void main(String[] args) {
    String s = "abc";
    perm(s,0,2);
  }
  static void perm (String s, int l, int h){
    if(l==h) {
      System.out.println(s);
      return;
    }
    for(int j =l; j<=h;j++){
      s = swap(s,l,j);
      perm(s,l+1,h);
      s = swap(s,l,j);
    }
  }
  public static String swap(String s, int i, int j){
    char[] carray = s.toCharArray();
    Character t = carray[i];
    carray[i] = carray[j];
    carray[j] = t;
    return String.valueOf(carray);
  }
}
