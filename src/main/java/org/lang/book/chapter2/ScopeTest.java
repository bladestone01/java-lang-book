package org.lang.book.chapter2;

/**
 * ������Ĳ��Դ��롣
 * 
 * @author chenjunfeng1
 *
 */
public class ScopeTest {
	public static void main(String[] args) {
		int outerNum = 123;
		{  //�ڲ������
			int innerNum = 234;
			System.out.println("Outer Block, outerNum:" + outerNum);
	        System.out.println("Outer Block, innerNum:" + innerNum);		
		}
        System.out.println("Outer Block, outerNum:" + outerNum);
        //����������ʾ������Ϣ��innerNum cannot be resolved to a variable
        //System.out.println("Outer Block, innerNum:" + innerNum); 
	}
}
