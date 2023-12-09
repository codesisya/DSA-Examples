package org.sou.MyExecutorService;

public class ScheduleExecution extends Execution {
  public ScheduleExecution(Boolean xyz) {
    super(xyz);
  }

  @Override
  void executeMyMethod() {
    if (MyScheduledThreadPool.currentCapacity < MyScheduledThreadPool.capacity) {
      MyScheduledThreadPool.currentCapacity++;
      Thread t = new Thread(this);
      t.start();
    }
  }
  @Override
  public void run() {
    while (!isShutDown) {
      ScheduleJob job = MyScheduledThreadPool.queue.peek();
      long delay = System.currentTimeMillis() - job.delay;
      if (delay < 0) {
        try {
          MyScheduledThreadPool.queue.take().command.run();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }
}
