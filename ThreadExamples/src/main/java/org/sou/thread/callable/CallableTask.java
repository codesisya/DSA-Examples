package org.sou.thread.callable;

import java.util.concurrent.Callable;

public class CallableTask<V> implements Callable<V> {
	V i;
	public CallableTask(V i){
		this.i = i;
		Example.numOfThreads = 10;
	}
	@Override
	public V call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(i);
		Example.al.add((Integer)i);
		return i;
	}

}
