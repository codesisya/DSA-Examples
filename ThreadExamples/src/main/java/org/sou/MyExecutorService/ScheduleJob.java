package org.sou.MyExecutorService;

public class ScheduleJob {
  Runnable command;
  long delay;
  public ScheduleJob(Runnable cmd, long delay){
    this.command = cmd;
    this.delay = delay;
  }
  public long getDelay(){
    return delay;
  }
}
