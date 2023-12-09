package org.sou;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
  int first ;
  int second;
  public Pair(int i , int j){
    first = i;
    second = j;
  }
}
public class Mines {
  private static boolean isValid(int i,int j, int m , int n, int[][] board){
    if(i<0||j<0||i>=m||j>=n||board[i][j] ==-1)
      return false;
    return true;
  }
  public  static int[][] solve(int[][] board){
    int m = board.length;
    int n = board[0].length;
    int[][] soln = new int[m][n];
    int[] dirX = {-1,-1,-1,0,0,1,1,1};
    int[] dirY = {-1,0,1,-1,1,1,0,-1};
    for(int i = 0;i<m;i++)
      Arrays.fill(soln[i],0);
    LinkedList<Pair> q = new LinkedList<>();
    for(int i = 0;i<m;i++){
      for(int j = 0;j<n;j++){
        if(board[i][j] == -1) {
          q.add(new Pair(i, j));
          soln[i][j] = -1;
        }
      }
    }
    while (!q.isEmpty()){
      Pair box = q.poll();
      for(int i = 0;i<8;i++){
          int newI = box.first+dirX[i];
          int newJ = box.second+dirY[i];
          if(isValid(newI,newJ,m,n,board))
            soln[newI][newJ] = soln[newI][newJ]+1;

      }
    }
    return soln;
  }
  public static void main(String[] args) {
    int[][] b = {{0,0,0,-1},
            {0,0,0,0},
            {0,0,0,-1},
            {0,-1,0,0}
    };
    int[][] soln = solve(b);
    for(int i = 0;i<soln.length;i++){
      for(int j:soln[i])
        System.out.print(j+",");
      System.out.println();
    }

  }
}
