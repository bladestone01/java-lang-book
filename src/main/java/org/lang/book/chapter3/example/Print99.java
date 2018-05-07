package org.lang.book.chapter3.example;

public class Print99 {

	public static void main(String[] args) {
		print1();
        print2();
	}

	public static void print1() {
		for (int row = 1; row <= 9; row++) { // 循环行
			for (int col = 1; col <= row; col++) { // 循环列
				System.out.print(row * col); // 输出数值
				System.out.print(' ');// 输出数字之间的间隔空格
			}
			System.out.println();// 一行输出结束，换行
		}
	}

	public static void print2() {
		for (int row = 1; row <= 9; row++) { // 循环行的间隔空格
			for (int col = 1; col <= row; col++) { // 循环列
				if (row * col < 10) { // 一位数
					System.out.print(' ');
				}
				System.out.print(row * col); // 输出数值
				System.out.print(' '); //输出数字之间
			}
			System.out.println(); // 一行输出结束，换行
		}
	}

}
