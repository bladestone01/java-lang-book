package org.lang.book.chapter2;

/**
 * 作用域的测试代码。
 * 
 * @author chenjunfeng1
 *
 */
public class ScopeTest {
	public static void main(String[] args) {
		int outerNum = 123;
		{  //内部代码块
			int innerNum = 234;
			System.out.println("Outer Block, outerNum:" + outerNum);
	        System.out.println("Outer Block, innerNum:" + innerNum);		
		}
        System.out.println("Outer Block, outerNum:" + outerNum);
        //编译器将提示错误信息：innerNum cannot be resolved to a variable
        //System.out.println("Outer Block, innerNum:" + innerNum); 
	}
}
