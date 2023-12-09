package org.sou.bit;

public class CountSetBits {
  public static void main(String[] args) {
    int n = 50;
    System.out.println(Integer.toBinaryString(n));
    int count = 0;
    while(n!=0){
      n = n&(n-1);
      count++;
    }
    System.out.println(count);
  }
}
