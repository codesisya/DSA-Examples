package org.sou.string;

public class StringPool {
  public static void main(String[] args) {
    String s1 = "abcd";
    String s2 = "abcd";
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    s1 = s1+"xyz";
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s1);
    System.out.println(s2);
  }

}
