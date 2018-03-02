package org.lang.book.chapter6;

public class TryCatchDemo {
	public static void main(String[] args) {
		try {
			TryCatchDemo demo = new TryCatchDemo();
			demo.testDivideZero();
		} catch (ArithmeticException ae) {
			System.out.println("处理异常");
			ae.printStackTrace();
		}
		finally {
			System.out.println("Finally cleanup...");
		}
	}

	public void testDivideZero() {
		System.out.println("I am in the divideZero method.....");
		int num = 10 / 0; // 异常抛出点
		System.out.println("I will never be called, right ?"); // 不会执行
	}
}
