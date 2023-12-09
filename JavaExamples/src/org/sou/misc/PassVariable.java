package org.sou.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassVariable {
  static class INT{
    int data;
  }
  public static void main(String[] args) {
    int ii = 5;
    System.out.println("before call"+ii);

    changeVal(ii);
    System.out.println("after call"+ii);
    Integer ii1 = 5;
    changeIntVal(ii1);
    System.out.println("after call"+ii1);
    Integer i1 = new Integer(5);
    System.out.println("before call"+i1);
    changeIntVal(i1);
    System.out.println("after call"+i1);
    INT i2 = new INT();
    i2.data = 5;
    changeIntValNew(i2);
    System.out.println("after call"+i2.data);
    Integer i = new Integer(10);
    Integer j = new Integer(20);
    swap(i, j);
    System.out.println("i = " + i + ", j = " + j);
    int[] a= {1,2,3};
    ArrayList<Integer> l = new ArrayList<Integer>();
    l.add(5);
    l.add(5);
    l.add(5);
    System.out.println("before l size = "+l.size());
    changeListValue(l);
    System.out.println("after l size = "+l.size());
    for(int x: a)
      System.out.print(x+",");
    changeArray(a);
    System.out.println("---,after change ");
    for(int x: a)
      System.out.print(x+",");
  }
  public static void changeVal(int i){
    i=i+5;
    System.out.println("i in fn="+i);
  }
  public static void changeIntVal(Integer i){
    i=i+5;
    System.out.println("i in fn="+i);

  }
  public static void changeIntValNew(INT i){
    i.data=i.data+5;
    System.out.println("i in fn="+i.data);

  }

  public static void swap(Integer i, Integer j)
  {
    Integer temp = new Integer(i);
    i = j;
    j = temp;
  }
  public static void changeListValue(ArrayList<Integer> l){
    l.add(5);
    System.out.println("size in fn ="+l.size());
  }
  public static void changeArray(int p[ ]){
    p[0] = -1;
  }
}

