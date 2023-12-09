import java.util.PriorityQueue;

public class MexImpl {

  static int SIZE = 10000;
  static int mex = 0;
  int getMex(int[] a){
    int n = a.length;
    if(a[n-1]!=mex)
      return mex;
     mex = 0;
    for(int i = 0;i<n;i++){
      if(a[i]<0) {
        mex = Math.abs(a[i]);
        return mex;
      }
    }


    return -1;
  }

  int getMexPQ(int[] a){
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    for(int x: a)
      pq.add(x);
    if(mex==a[a.length-1]){
      int nextel = pq.poll();
      if(nextel-mex>1) {
        mex = mex+1;
        return mex ;
      }
      while(pq.peek()==mex+1){
        pq.poll();
      }
      mex = pq.poll()+1;
      return mex ;
    }
    return -1;
  }
}
