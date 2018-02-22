package org.lang.book.chapter3;

public class SwitchTestRangeCode {

	public static void main(String[] args) {
	    int score = 85;
		
	    switch(score/10) {
	       case 10:
	       case 9:
	    	       System.out.println("成绩优秀！");
	    	       break;
	       case 8:
			   System.out.println("成绩良好！");
			   break;
	       case 7:
	       case 6:
			   System.out.println("成绩及格！");
			   break;
		   default:
			   System.out.println("成绩不及格，下次继续努力!");
			   break;
		}
	    
	}

}
