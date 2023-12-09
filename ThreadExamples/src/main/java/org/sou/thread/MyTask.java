package org.sou.thread;

public class MyTask implements Runnable{
	int tracker;
	public MyTask(int i){
		tracker = i;
	}
	@Override
	public void run() {
		System.out.println("tracked "+tracker);
		
	}

	
}
