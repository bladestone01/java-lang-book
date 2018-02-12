package org.lang.book.chapter4.method;

public class ChildAgeChecker {

	public static void main(String[] args) {
		int age1 = 5;
		int age2 = 15;
		int age3 = 19;
		int age4 = 6;
		
		ChildAgeChecker mdObj = new ChildAgeChecker();
		boolean isValid1 = mdObj.isVaidAge(age1);
		System.out.println("age1:" + isValid1);
		
		boolean isValid2 = mdObj.isVaidAge(age2);
		System.out.println("age2:" + isValid2);
		
		boolean isValid3 = mdObj.isVaidAge(age3);
		System.out.println("age3:" + isValid3);
		
		boolean isValid4 = mdObj.isVaidAge(age4);
		System.out.println("age4:" + isValid4);
	}
	
	public boolean isVaidAge(int age) {
		boolean isValid = false;
		
		if (age>=6 && age<15) {
			isValid = true;
		}
		
		return isValid;
	}

}
