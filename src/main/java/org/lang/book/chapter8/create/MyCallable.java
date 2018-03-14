package org.lang.book.chapter8.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer> {
	@Override
	public Integer call() throws Exception {
		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}

		//Thread.sleep(3000);
		return i;
	}
	
	public static void main(String[] args) {
		MyCallable calltask = new MyCallable();
		FutureTask<Integer> fTask = new FutureTask<Integer>(calltask);

		System.out.println(Thread.currentThread().getName() + "线程工作中");
		new Thread(fTask, "有返回值的Callable子线程").start();

		System.out.println("ready to sleep 5 seconds in main thread");
		try {
			Thread.sleep(5000);
			System.out.println("Callable子线程的返回值：" + fTask.get());
			System.out.println("end of main thread");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}	
}
