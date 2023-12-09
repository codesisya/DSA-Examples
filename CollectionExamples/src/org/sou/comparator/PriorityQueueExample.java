package org.sou.comparator;
import java.util.PriorityQueue;

class Pair{
  int x;
  int y;

  public Pair(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}
public class PriorityQueueExample {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>((p,q)->(q-p));
    pq.add(5);
    pq.add(7);
    pq.add(3);
    pq.add(9);
    System.out.println(pq.poll());
    Pair p1 = new Pair(2,3);
    int k = 3;
    int[][] sol = {{1,2},{1,3},{-2,2},{1,1}};
    int[][] sol1 = kClosest(sol, k);
    for(int i=0;i<k;i++){
      System.out.println(sol1[i][0]+" "+sol1[i][1]);
    }
  }

  public static int[][] kClosest(int[][] points, int k) {
    PriorityQueue<Pair> pq = new PriorityQueue<Pair>((p,q)->
            ((p.getX()*p.getX()+p.getY()*p.getY())- (q.getX()*q.getX()+q.getY()*q.getY())));

    for(int i=0;i<points.length;i++){
      pq.add(new Pair(points[i][0], points[i][1]));
    }
    int[][] sol = new int[k][2];
    for(int i = 0;i<k;i++){
      Pair p = pq.poll();
      sol[i][0] = p.getX();
      sol[i][1] = p.getY();
    }
    return sol;
  }




}
