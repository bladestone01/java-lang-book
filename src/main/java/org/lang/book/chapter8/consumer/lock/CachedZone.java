package org.lang.book.chapter8.consumer.lock;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.lang.book.chapter8.consumer.Consumer;
import org.lang.book.chapter8.consumer.Producer;
import org.lang.book.chapter8.consumer.Zone;

/**
 * 基于Lock的缓冲区.
 * 
 * @author tonychen
 *
 */
public class CachedZone implements Zone {
	// 缓存最大存储空间
	private final int MAX_SIZE = 10;

	// 缓存的存储区域
	private List<Object> storage = new LinkedList<Object>();

	// 线程安全的锁机制
	private final Lock lock = new ReentrantLock();

	// 缓存满的条件变量
	private final Condition full = lock.newCondition();
	// 缓存空的条件变量
	private final Condition empty = lock.newCondition();

	/**
	 * 数据消费
	 */
	@Override
	public void produce(String producer) {
		// 线程加锁
		lock.lock();

		// 缓存满的情况
		while (storage.size() == this.MAX_SIZE) {
			System.out.println("缓冲区已满，[Producer]:暂无放入更多数据");

			try {
				full.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		storage.add(new Object());
		System.out.println("[" + Thread.currentThread().getName() + "]:生产了一个数据，[现在的缓冲区数据量]:" + storage.size()
				+ ", [可用空间]:" + (MAX_SIZE - storage.size()));

		// 唤醒所有等待的消费者线程
		empty.signalAll();

		// 线程释放锁
		lock.unlock();
	}

	@Override
	public void consume(String consumer) {
		// 线程加锁
		lock.lock();

		// 检查缓存区域是否有数据
		while (storage.size() == 0) {
			System.out.println("缓冲区已空, [Consumer]:暂无数据可以消费");
			try {
				empty.await();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		storage.remove(storage.size() - 1);
		System.out.println("[" + Thread.currentThread().getName() + "]:消费了一个产品，[现在缓冲区数据量]:" + storage.size()
				+ ", [可用空间]:" + (MAX_SIZE - storage.size()));

		// 唤醒所有等待中的生产者线程
		full.signalAll();

		// 线程释放锁
		lock.unlock();
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
