package org.lang.book.chapter2.operator;

/**
 * �Ƚ�������Ĳ��Դ��롣
 * 
 * @author chenjunfeng1
 *
 */
public class CompareOperatorTest {
	public static void main(String[] args) {
		int num1 = 30;
		boolean isBool = num1 > 10;
		boolean isLighter = num1 <= 4;
		boolean isEqual = (num1 == 4); //()��ʾ���ȼ����ߣ�����ִ��
		boolean isNotEqual = (num1 != 4); //()��ʾ���ȼ����ߣ�����ִ��
		
		System.out.println("num1 = " + num1);
		System.out.println("========================");
		System.out.println("num1 > 10:" + isBool);
		System.out.println("num1 <= 4:" + isLighter);
		System.out.println("num1 == 4:" + isEqual);
		System.out.println("num1 != 4:" + isNotEqual);
	}
}
