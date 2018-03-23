package org.lang.book.chapter7.wrapper;

/**
 * int与Integer之间的互相转换.
 * 
 * @author chenjunfeng1
 *
 */
public class IntegerWrapper {

	public static void main(String[] args) {
		int n = 10;
		Integer numInt = 10;
		Integer in = new Integer(100);
		//将 int 类型转换为 Integer 类型
		Integer in1 = new Integer(n);
		//将 Integer 类型的对象转换为 int 类型
		int m = in.intValue();
        
		//parseInt()解析
		String s = "123";
		int num = Integer.parseInt(s);

		//将字符串”120”按照十进制转换为 int,则结果为 120
		int n1 = Integer.parseInt("120",10);
		//将字符串”12”按照十六进制转换为 int,则结果为 18
		int n2 = Integer.parseInt("12",16);
		//将字符串”ff”按照十六进制转换为 int,则结果为 255
		int n3 = Integer.parseInt("ff",16);
		
		System.out.println("120 in radix10:" + n1 + ", radix8:" + n2 + ", radix16:" +n3);
	}

}
