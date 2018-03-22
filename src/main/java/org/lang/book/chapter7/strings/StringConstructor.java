package org.lang.book.chapter7.strings;

/**
 * String 使用Demo.
 * 
 * @author chenjunfeng1
 *
 */
public class StringConstructor {

	public static void main(String[] args) {
		//基于字符串来创建String对象
		String str1 = "this is a string";
		
		//无参数构造方法
		String strc = new String();
		
		//有参构造函数
		String str2 = new String("asdf"); 
		String str3 = new String(str2); 
		
		//用字符数组value创建一个String对象。
        char[] value = {'a','b','c','d'};
        String str4 = new String(value);  //相当于String str4 = new String("abcd");

        //基于字节数组创建String对象:65:A, 66:B
        byte[] strb = new byte[]{65,66};
        String str6 = new String(strb);//相当于String str6 = new String("AB");
        
        
        
	} 

}
