package org.lang.book.chapter4;

/**
 * 静态代码块.
 * 
 * @author chenjunfeng1
 *
 */
public class StaticBlock {
	public static StaticBlock instance;
	
	static {
		if (instance == null)
			instance = new StaticBlock();
	}
	
	public void testMsg() {
	    System.out.println("Hello, Static Block!");	
	}
	
	public static void main(String[] args) {
		StaticBlock.instance.testMsg();
	}
}
