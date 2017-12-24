package org.lang.book.chapter3;

public class IfTestRangeCode {

	public static void main(String[] args) {
		int score = 85;
		
		if (score >= 90) {
		    System.out.println("成绩优秀！");	
		} else if (score >= 80) {
			System.out.println("成绩良好！");
		} else if (score > 60) {
			System.out.println("成绩及格！");
		} else {
			System.out.println("成绩不及格，下次继续努力!");
		}

	}

}
