package org.lang.book.chapter5.grammer;

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
	
	@Override
	public void run() {
		System.out.println(this.getName() + " is running");
	}

	public static void main(String[] args) {
		Mammal mammal = new Mammal("Mammal");
		mammal.run();
	}
}
