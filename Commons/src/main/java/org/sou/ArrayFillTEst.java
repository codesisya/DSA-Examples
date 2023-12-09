package org.sou;

import java.util.Arrays;

public class ArrayFillTEst {
  public static void main(String[] args) {
    int[][] ans = new int[4][4];
    for(int i =0;i<4;i++)
    Arrays.fill(ans[i],-1);
    for(int i =0;i<4;i++){
      for(int j:ans[i])
        System.out.print(j+",");
      System.out.println();
    }

  }
}
