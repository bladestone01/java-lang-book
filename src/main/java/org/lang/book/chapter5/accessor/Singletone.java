package org.lang.book.chapter5.accessor;

/**
 * 构造方法私有的单例模式。
 * 
 * @author chenjunfeng1
 *
 */
public class Singletone {
	private static Singletone instance;
	
	private Singletone() {
	}

	public static Singletone getInstance() {
		if (instance == null) {
			instance = new Singletone();
		}
		return instance;
	}
}
