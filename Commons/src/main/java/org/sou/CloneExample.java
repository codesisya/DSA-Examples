package org.sou;


import java.util.Arrays;

class MyPair implements Cloneable {
  int i;
  int j;

  public MyPair(int a, int b) {
    i = a;
    j = b;
  }

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}

public class CloneExample implements Cloneable {


  public static void main(String[] args) throws CloneNotSupportedException {
    int [] a = {1,3,5,7,9,11};
    System.out.println(Arrays.binarySearch(a, 2));
    MyPair p = new MyPair(2, 3);
    MyPair p1 = (MyPair) p.clone();
    System.out.println(Math.random());

  }

}
