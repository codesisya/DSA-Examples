package org.sou.thread.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Example<V> {
	static int numOfThreads = 10;
	public static ArrayList<Integer> al  = new ArrayList<Integer>();
	/**
	 * @param <V>
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static <V> void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService ex = Executors.newFixedThreadPool(numOfThreads);
		List<Callable<Integer>> callables = new ArrayList<>();
		for(int i = 0;i<50;i++){
			callables.add(new CallableTask<Integer>(i));
		}
		List<Future<Integer>> f = ex.invokeAll(callables);
		ex.shutdown();
		/*while (!ex.isTerminated()) {
        }*/
		for(Integer i :al){
			System.out.println("al "+i);
		}
		System.out.println(f.get(0).get());
		System.out.println(f.get(1).get());
	}

}
