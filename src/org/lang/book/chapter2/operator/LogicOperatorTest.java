package org.lang.book.chapter2.operator;

public class LogicOperatorTest {

	public static void main(String[] args) {
		boolean leftOpt = true;
		boolean rightOpt = false;
		
		boolean andStatus = leftOpt && rightOpt;
		boolean orStatus = leftOpt || rightOpt;
		boolean notStatus = !rightOpt;
		
		System.out.println("Left Operator:" + leftOpt + ", Right Operator:" + rightOpt);
		System.out.println("=============================================");
		System.out.println("LeftOperator && Right Operator:" + andStatus);
		System.out.println("LeftOperator || Right Operator:" + orStatus);
		System.out.println("! Right Operator:" + notStatus);
	}

}
