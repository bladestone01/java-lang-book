package org.lang.book.chapter4.modifier;

/**
 * 展示Final修饰符的用法.
 * 
 * @author chenjunfeng1
 *
 */
public class Person {
    private int gender;  //人的性别信息
    
    public static final int MALE = 0; //男性
    public static final int FEMALE = 1; //女性
    
    public Person(int gender) {
    	this.gender = gender;
    }
    
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
    
    public static void main(String[] args) {
       Person person1 = new Person(Person.MALE); 	
    }
}
