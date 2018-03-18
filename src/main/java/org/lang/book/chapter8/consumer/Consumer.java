package org.lang.book.chapter8.consumer;

import java.util.Random;

/**
 * 消费者.
 * 
 * @author tonychen
 *
 */
public class Consumer extends Thread {
	// 缓冲区
	private Zone cachedZone;
	private Random random = new Random();

	/**
	 * 消费者名称构造方法.
	 * 
	 * @param name
	 *            名称
	 * @param cachedZone
	 *            缓冲区
	 */
	public Consumer(String name, Zone cachedZone) {
		this.setName(name);
		this.cachedZone = cachedZone;
	}

	/**
	 * 线程执行方法: 循环：100次
	 */
	@Override
	public void run() {
		int count = 0;
		while ((count++)<100) {
			this.cachedZone.consume(this.getName());
			try {
				Thread.currentThread().sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
