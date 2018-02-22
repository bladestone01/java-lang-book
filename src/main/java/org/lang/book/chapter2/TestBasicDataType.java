package org.lang.book.chapter2;

/**
 * 展示基本数据类型的使用。
 * 
 * @author chenjunfeng1
 *
 */
public class TestBasicDataType {
	public static void main(String[] args) {
		int intNum = 16; // 整型
		int intNum08 = 020; // 8进制，
		int intNum16 = 0x10; // 16进制，16
		int intNum02 = 0b10000; // 2进制，4

		//展示int类型数据的输出
		System.out.println("16在10进制的值为:" + intNum);
		System.out.println("16在8进制的值为:" + intNum08);
		System.out.println("16在16进制的值为:" + intNum16);
		System.out.println("16在2进制的值为:" + intNum02);
		System.out.println("int占用的字节数:" + Integer.SIZE / 8);

		
		short shortNum = 123;  //short类型的数值：123
		//展示short类型数据的输出
		System.out.println("short数据的值为:" + shortNum);
		System.out.println("Short占用的字节数为:" + Short.SIZE/8);
		
		long longNum = 123l;   //长整型的数据123,使用后缀l
		long longNum2 = 123;   //长整型的数据123
		//展示使用long的数据内容
		System.out.println("long数据的值:" + longNum);
		System.out.println("long数据的值2:" + longNum2);
		System.out.println("long占用的字节数:" + Long.SIZE/8);

		byte byteNum = 115;  //设置byte类型值
		//byte byteOverNum = 137; //超出数据类型范围，编译器提示错误
		System.out.println("byte数据的内容:" + byteNum);
		System.out.println("byte占用的字节数:" + Byte.SIZE/8);
		

		float floatNum = 1.234f;  //单精度浮点数的数值
		//声明为浮点数，但是未使用后缀f,编译器报错
		//错误信息: Type mismatch: cannot convert from double to float
	    //float floatNum1 = 1.234; 
		System.out.println("float的数值为:" + floatNum);
		System.out.println("float占用的字节数:" + Float.SIZE/8);
		
		
		double doubleNum = 123.3332;  //双精度浮点数的数值
		System.out.println("double的数值为:" + doubleNum);
		System.out.println("double占据的字节数:" + Double.SIZE/8);

		char charVariable = 'a';  //声明字符变量
		char charVariable2 = 97;  //使用字符的位置码来设置字符
		System.out.println("char的字符值为:" + charVariable);
		System.out.println("char的位置码设置展示位:" + charVariable2);
		System.out.println("char占据的字节数为:" + Character.SIZE/8);
		
		boolean isValid = true;  //布尔的true值
		boolean isWorking = false; //布尔的false值
		System.out.println("boolean的true值:" + isValid);
		System.out.println("boolean的false值:" + isWorking);
	}

}
