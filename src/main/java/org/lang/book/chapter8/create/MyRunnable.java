package org.lang.book.chapter8.create;

import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import java.lang.System;
import java.lang.Thread;

/**
 * 基于Runnable接口来实现线程.
 * 
 * @author tonychen
 *
 */
public class MyRunnable implements Runnable {
	/**
	 * 业务逻辑方法定义
	 */
	@Override
	public void run() {
		System.out.println("Hello, MyRunnable");
	}

	public static void main(String[] args) {
		Runnable myrun = new MyRunnable();
		Thread thread = new Thread(myrun, "myrunnable");
		thread.start();
	}
}
