package org.sou.strings;

public class more1sthan0s {

  public static void moreZero(String res, int n, int zeroes, int ones){
    System.out.println("string="+res+"address= "+res.hashCode());
    if (n==0){
      System.out.println(res);
      return;
    }
    //if( ones<zeroes)
      //return;
    moreZero(res+"1", n-1, zeroes, ones+1);
    moreZero(res+"0", n-1, zeroes+1, ones);
  }

  public static void main(String[] args) {
    moreZero("",2,0,0);
  }
}
