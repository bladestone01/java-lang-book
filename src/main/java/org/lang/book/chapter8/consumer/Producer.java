package org.lang.book.chapter8.consumer;

import java.util.Random;

/**
 * 生产者类.
 * 
 * @author tonychen
 *
 */
public class Producer extends Thread {
	// 缓冲区
	private Zone cachedZone;
	private Random random = new Random();

	/**
	 * 消费者构造方法.
	 * 
	 * @param name
	 *            名称
	 * @param cachedZone
	 *            缓冲区
	 */
	public Producer(String name, Zone cachedZone) {
		this.setName(name);
		this.cachedZone = cachedZone;
	}

	/**
	 * 线程执行方法.循环次数：100
	 */
	@Override
	public void run() {
		int count = 0;
		while ((count++)<100) {
			this.cachedZone.produce(this.getName());
			try {
				Thread.currentThread().sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
