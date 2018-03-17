package org.lang.book.chapter8.consumer;

import org.lang.book.chapter8.consumer.waitnotify.CachedZone;

/**
 * 消费者.
 * 
 * @author tonychen
 *
 */
public class Consumer extends Thread {
	//缓冲区
    private CachedZone cachedZone;
    
    /**
     * 消费者名称构造方法.
     * 
     * @param name  名称
     * @param cachedZone  缓冲区
     */
    public Consumer(String name, CachedZone cachedZone) {
    	    this.setName(name);
    	    this.cachedZone = cachedZone; 
    }
    
    /**
     * 线程执行方法
     */
    @Override
    public void run() {
    	    this.cachedZone.consume(this.getName());
    }
}
