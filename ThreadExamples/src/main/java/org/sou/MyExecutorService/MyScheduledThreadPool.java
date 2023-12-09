package org.sou.MyExecutorService;

import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class MyScheduledThreadPool extends MyThreadPool{
  static int capacity;
  static int max_capacity;
  static PriorityBlockingQueue<ScheduleJob> queue = new PriorityBlockingQueue<>
          (5,(a,b)->(int) (a.getDelay()-b.getDelay()));
  PriorityQueue<ScheduleJob> pq = new PriorityQueue<>((a,b)->(int)(a.getDelay()-b.getDelay()));
  ScheduleExecution e;
  public MyScheduledThreadPool(int capacity) {
    super(capacity);
    e = new ScheduleExecution(false);
  }

  public void schedule(Runnable r , long delay){
    ScheduleJob job = new ScheduleJob(r,delay);
    queue.add(job);
    e.executeMyMethod();
  }

}
