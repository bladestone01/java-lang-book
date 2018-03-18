package org.lang.book.chapter8.consumer.waitnotify;

import java.util.LinkedList;
import java.util.List;

import org.lang.book.chapter8.consumer.Consumer;
import org.lang.book.chapter8.consumer.Producer;
import org.lang.book.chapter8.consumer.Zone;

public class CachedZone implements Zone {
	private final int MAX_SIZE = 10; // 缓冲区大小
	private List<Object> storage = new LinkedList<Object>();

	/**
	 * 将生产的数据放入缓冲区.
	 * 
	 * @param producer
	 */
	public void produce(String producer) {
		// 对象锁
		synchronized (storage) {
			// 判断缓冲区是否已经达到最大数量量
			while (storage.size() == MAX_SIZE) {
				System.out.println("缓冲区已满，[" + Thread.currentThread().getName() + "]:暂无放入更多数据");
				try {
					// 由于缓冲区已满，生产者阻塞
					storage.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			// 生产的数据放入缓冲区
			storage.add(new Object());
			System.out.println("[" + Thread.currentThread().getName() + "]:生产了一个数据，[现在的缓冲区数据量]:" + storage.size()
					+ ", [可用空间]:" + (MAX_SIZE - storage.size()));

			// 唤醒所有等待的线程
			storage.notifyAll();
		}
	}

	public void consume(String consumer) {
		synchronized (storage) {
			while (storage.size() == 0) {
				System.out.println("缓冲区已空, [" + Thread.currentThread().getName() +"]:暂无数据可以消费");
				try {
					storage.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			storage.remove(storage.size() - 1);
			System.out.println("[" + Thread.currentThread().getName() + "]:消费了一个产品，[现在缓冲区数据量]:" + storage.size()
					+ ", [可用空间]:" + (MAX_SIZE - storage.size()));

			// 唤醒所有等待的线程
			storage.notifyAll();
		}
	}

	public static void main(String[] args) {
		Zone zone = new CachedZone();

		Producer producer1 = new Producer("producer1", zone);
		Producer producer2 = new Producer("producer2", zone);
		Consumer consumer1 = new Consumer("consumer1", zone);
		Consumer consumer2 = new Consumer("consumer2", zone);

		producer1.start();
		producer2.start();
		consumer1.start();
		consumer2.start();
	}

}
