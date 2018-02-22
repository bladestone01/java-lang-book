package org.lang.book.chapter4.modifier;

/**
 * 智能手机的具体实现子类.
 * 
 * @author chenjunfeng1
 *
 */
public class SmartPhone extends Phone {
	@Override
	public void call() {
		System.out.println("Smart Phone Call");
	}

	@Override
	public void message(String msg) {
		System.out.println("Smart Phone Message");
	}
	
	public static void main(String[] args) {
		Phone phone = new SmartPhone();
		phone.call();
	}
}
