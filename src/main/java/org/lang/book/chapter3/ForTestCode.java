package org.lang.book.chapter3;

public class ForTestCode {
	public static void main(String[] args) {
		int sumVal = 0;
		for (int index=1; index<=10; index++) {
			sumVal += index;
		}
		System.out.println("最终的结果值为：" + sumVal);
	}
}
