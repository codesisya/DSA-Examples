package org.sou.testing;

public class RecursionTest {
  public static void main(String[] args) {
    RecursionTest rt = new RecursionTest();
    Integer i = new Integer(5);
    Integer i1 = 5;//new Integer(5);
    rt.recur(i);
    int in = 5;
    rt.recuInt(in);
  }
  public void recur(Integer i){
    if(i==0)
      return;
    i = i-1;
    System.out.println(i);
    recur(i);
  }
  public void recuInt(int i){
    if(i==0)
      return;
    i = i-1;
    System.out.println(i);
    recur(i);
  }
}
