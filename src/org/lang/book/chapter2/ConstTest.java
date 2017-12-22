package org.lang.book.chapter2;

public class ConstTest {

	public static void main(String[] args) {
		 final double PI = 3.141516;
		 final double PI2;
		 PI2 = 3.1415;
		 //PI2 = 3.14; //常量二次赋值，编译器提示错误信息:无法重新赋值
	}
}
