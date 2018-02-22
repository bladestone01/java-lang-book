package org.lang.book.chapter;

/**
 * 哺乳动物。
 * 
 * @author tonychen
 *
 */
public class Mammal extends Animal {
	@Override
	public void run() {
		System.out.println(this.getName() + " is running");
	}

	public static void main(String[] args) {
		Mammal mammal = new Mammal();
		mammal.run();
	}
}
