package org.lang.book.chapter5.grammer;

/**
 * 动物类.
 * 
 * @author tonychen
 *
 */
public abstract class Animal {
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void run();
}
