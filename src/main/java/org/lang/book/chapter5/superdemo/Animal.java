package org.lang.book.chapter5.superdemo;

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
    
    //默认的构造方法
    public Animal() {
    }
    
    public Animal(String name) {
    	this.name = name;
    }
    
    public Animal(String name, int type) {
    	this.name = name;
    	this.type = type;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String sayHello() {
		return "Animal.sayHello:" + this.getName();
	}
	
	 
	
	public abstract void run();
	public abstract void voice();
}
