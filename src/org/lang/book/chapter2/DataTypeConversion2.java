package org.lang.book.chapter2;

/**
 * ǿ������ת���Ĳ��Դ��롣
 * 
 * @author chenjunfeng1
 *
 */
public class DataTypeConversion2 {
    public static void main(String[] args) {
    	double doubleNum = 3100.134;
    	int intNum = (int)doubleNum; //ǿ��ת��Ϊ����
    	
    	byte byteNum = (byte)intNum; //ǿ��ת��Ϊbyte����
    	
    	System.out.println("Double Number:" + doubleNum);
    	System.out.println("int Number:" + intNum);
    	System.out.println("Byte Number:" + byteNum);
    }
}
