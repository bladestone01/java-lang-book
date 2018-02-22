package org.lang.book.chapter2;

/**
 * 数据类型转换的测试代码。
 * 
 * @author chenjunfeng1
 *
 */
public class DataTypeConversion1 {
	public static void main(String[] args) {
		byte bNum = 100;
		int intNum = bNum;
		long longNum = intNum;

		System.out.println("bNum:" + bNum);
		System.out.println("intNum:" + intNum);
		System.out.println("longNum:" + longNum);
	}
}
