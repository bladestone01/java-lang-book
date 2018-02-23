package org.lang.book.chapter5.method;

/**
 * 动物类.
 * 
 * @author tonychen
 *
 */
public abstract class Animal {
	public int type = 0;
	protected int protectedAttr = 12;
	
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return this.sayPrivateHello("Hello, ");
	}
	
	private String sayPrivateHello(String msg) {
		return msg + this.name;
	}
	
	public abstract void run();
	public abstract void voice();
}
