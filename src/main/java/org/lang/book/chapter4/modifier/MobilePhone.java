package org.lang.book.chapter4.modifier;

/**
 * 传统的移动电话，Phone的一个具体子类实现。
 * @author chenjunfeng1
 *
 */
public class MobilePhone extends Phone {
	@Override
	public void call() {
		System.out.println("Mobile Phone Call");
	}

	@Override
	public void message(String msg) {
		System.out.println("Mobile Phone Message");
	}
}
