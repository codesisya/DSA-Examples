package org.sou.bit;

public class LastSetBit {
  public static void main(String[] args) {
    int n = 50;
    System.out.println(Integer.toBinaryString(n));
   System.out.println(Integer.toBinaryString(n-1));
    //System.out.println(Integer.toBinaryString(n-2));
    int m = n & (n-1);
    System.out.println(Integer.toBinaryString(m));
    System.out.println(Integer.toBinaryString(m&(m-1)));
    System.out.println(Integer.toBinaryString(n & (-n)));
  }

}
