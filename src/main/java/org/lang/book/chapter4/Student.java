package org.lang.book.chapter4;

/**
 * 展示this在Java语言中的应用.
 * 
 * @author chenjunfeng
 *
 */
public class Student {
    private String name;
    private int age;
	public Student() {
		this("张三", 15);
	}
	public Student(String curName, int curAge) {
		this.name = curName;
		age = curAge;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.getName() + "," + this.age;
	}
}
