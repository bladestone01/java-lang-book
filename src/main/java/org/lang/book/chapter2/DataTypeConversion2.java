package org.lang.book.chapter2;

/**
 * 强制类型转换的测试代码。
 * 
 * @author chenjunfeng1
 *
 */
public class DataTypeConversion2 {
    public static void main(String[] args) {
    	double doubleNum = 3100.134;
    	int intNum = (int)doubleNum; //强制转化为整型
    	
    	byte byteNum = (byte)intNum; //强制转换为byte类型
    	
    	System.out.println("Double Number:" + doubleNum);
    	System.out.println("int Number:" + intNum);
    	System.out.println("Byte Number:" + byteNum);
    }
}
