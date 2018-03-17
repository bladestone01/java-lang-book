package org.lang.book.chapter8.consumer;

/**
 * 缓冲区接口定义.
 * 
 * @author tonychen
 *
 */
public interface Zone {
	/**
	 *  从缓冲区中消费数据.
	 */
    public void consume(String consumer);
    
    /**
     * 向缓冲区写入数据.
     */
    public void produce(String producer);
}
