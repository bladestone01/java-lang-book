package org.lang.book.chapter8.create;

/**
 * 基于继承创建线程
 * 
 * @author tonychen
 *
 */
public class MyThread extends Thread {
	/**
	 * 为线程指定名称.
	 * 
	 * @param name
	 */
	public MyThread(String name) {
		super(name);
	}
	
    @Override
	public void run() {
		System.out.println("Hello, MyThread");
	}
	
	public static void main(String[] args) {
		Thread thread = new MyThread("mythread");
		thread.start();
	}

}
