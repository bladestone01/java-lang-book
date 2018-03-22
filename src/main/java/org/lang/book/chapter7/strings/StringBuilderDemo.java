package org.lang.book.chapter7.strings;

/**
 * StringBuilder的使用示例。
 * 
 * @author chenjunfeng1
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "Hello World";
		StringBuilder builder = new StringBuilder(str);
		StringBuilder builder2 = new StringBuilder(120);
		
		builder.append(", Right?");
		System.out.println("appended string:" + builder.toString());
		
		builder.deleteCharAt(6);
		System.out.println("deleted char:" + builder.toString());
		
		builder.insert(6, 'Z');
		System.out.println("inserted char:" + builder.toString());
		System.out.println("index R:" + builder.indexOf("R"));
	}

}
