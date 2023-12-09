package org.sou.bit;

public class XORBits {
  public static void main(String[] args) {
    /* Get the rightmost set bit in set_bit_no */
    Integer a = 16;
    int set_bit_no = (a & ~(a - 1));
    System.out.println(a.toBinaryString(a));
    //System.out.println(a.toBinaryString(a-1));
    System.out.println(set_bit_no);
  }
}
