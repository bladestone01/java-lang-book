package org.lang.book.chapter4.modifier;

public class SyncCounter {
	private int count = 0;
	private static int times = 0;
	
	/**
	 * 实现自增操作并将结果返回。
	 * 
	 * @return
	 */
	public synchronized int countAdd() {
		//业务逻辑操作
		count++;
		return count;
	}
	
	public int countInBlock() {
		synchronized(this) {
			count++; //业务逻辑操作
		}
		return count;
	}
	
	public synchronized static void printTimes() {
		times++;
		System.out.println("current times:" + times);
	}
}
