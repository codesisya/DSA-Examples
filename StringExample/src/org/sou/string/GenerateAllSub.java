package org.sou.string;

public class GenerateAllSub {
  public static void main(String[] args) {
    String s = "1234";
    String t = "";
    gen(s,0,t);
  }
  public static  void gen(String s, int i , String t){
    if(i==s.length()) {
      System.out.println(t);
      return;
    }
    gen(s,i+1,t+s.charAt(i));
    gen(s,i+1,t);

  }
}
