package org.lang.book.chapter4.modifier;

/**
 * 尝试覆盖声明为final的方法，会报出编译错误.
 * 
 * @author chenjunfeng1
 *
 */
public class Goods extends BaseGoods {
	public void testFinalMethod() {
		System.out.println("Child class in testFinalMethod....");
	}
}
