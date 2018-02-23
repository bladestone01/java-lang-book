package org.lang.book.chapter5.method;

/**
 * 哺乳动物。
 * 
 * @author tonychen
 *
 */
public class Mammal extends Animal {
	public Mammal(String name) {
		this.setName(name);
	}
	
	//父类的抽象方法被覆写
	@Override
	public void run() {
		System.out.println(this.getName() + " is running");
	}

	//父类的抽象方法，在子类中提供空实现
	@Override
	public void voice() {	
	}
	
	@Override
	public String sayHello() {
		return "Hello World, " + this.getName();
	}
	
	public static void main(String[] args) {
		Mammal mammal = new Mammal("Mammal");
		mammal.run();
		
		System.out.println("public attribute:" + mammal.type);
		System.out.println("protected attribute:" + mammal.protectedAttr);
		System.out.println("sayHello:" + mammal.sayHello());
	}
}
