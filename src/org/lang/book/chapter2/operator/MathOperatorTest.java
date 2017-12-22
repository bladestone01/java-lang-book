package org.lang.book.chapter2.operator;

/**
 * 算数运算符的测试代码。
 * 
 * @author chenjunfeng1
 *
 */
public class MathOperatorTest {
	public static void main(String[] args) {
		int num1 = 40;
		int num2 = 5;
		
		int sumResult = num1 + num2;
        int minusResult = num2 - num1;
        int multiplyResult = num1 * num2;
        int divisionResult = num1 / num2;
        
        System.out.println("Num1 = " + num1 + ", Num2 = " + num2);
        System.out.println("==================================");
        System.out.println("Num1 + Num2 = " + sumResult);
        System.out.println("Num2 - Num1 = " + minusResult);
        System.out.println("Num1 * Num2 = " + multiplyResult);
        System.out.println("Num1 / Num2 = " + divisionResult);
        
        int divisionInt = 5/3;
        double caseResult = num2 * 3.14;
        //int intResult = num2 * 3.14;  //系统提示类型错误信息
        
        System.out.println("5/3 = " + divisionInt);
        System.out.println("num * 3.14 = " + caseResult);
	}
}
