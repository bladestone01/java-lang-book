package org.lang.book.chapter4.modifier;

/**
 * 定义了手机的抽象类，在类中定义了call和message两个抽象方法.
 * 
 * @author chenjunfeng1
 *
 */
public abstract class Phone {
	public abstract void call();
	public abstract void message(String msg);
	
	public String toString() {
		return "This is an abstract class.";
	}
}
