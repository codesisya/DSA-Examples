package org.sou.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPool {
	static int numOfThreads = 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 50;
		ExecutorService ex = Executors.newFixedThreadPool(numOfThreads);
		ExecutorService ex1 = Executors.newScheduledThreadPool(1);
		for(int i = 0 ;i< n ; i++){
			ex.submit(new MyTask(i));
		}

	}

}
