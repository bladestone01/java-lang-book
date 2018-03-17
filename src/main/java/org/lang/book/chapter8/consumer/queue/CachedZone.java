package org.lang.book.chapter8.consumer.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.lang.book.chapter8.consumer.Zone;

/**
 * 基于阻塞队列的缓冲区.
 * 
 * @author tonychen
 *
 */
public class CachedZone implements Zone {
	// 缓存最大存储空间
	private final int MAX_SIZE = 10;

	// 缓存的存储区域
	private BlockingQueue<Object> storage = new LinkedBlockingQueue<Object>(MAX_SIZE);

	@Override
	public void consume(String consumer) {
        //判断缓存区是否有数据
		if (storage.size() == 0) {
			System.out.println("缓冲区已空, [Consumer]:暂无数据可以消费");
		}
		
		try {
			storage.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("[Consumer]:消费了一个产品，[现在缓冲区数据量]:" + storage.size() + ", [可用空间]:" + (MAX_SIZE - storage.size()));
	}

	@Override
	public void produce(String producer) {
		//判断缓冲区是否已满
		if (storage.size() == MAX_SIZE) {
			System.out.println("缓冲区已满，[Producer]:暂无放入更多数据");
		}
		
		try {
			storage.put(new Object());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"[Producer]:生产了一个数据，[现在的缓冲区数据量]:" + storage.size() + ", [可用空间]:" + (MAX_SIZE - storage.size()));
	}

	public static void main(String[] args) {

	}

}
