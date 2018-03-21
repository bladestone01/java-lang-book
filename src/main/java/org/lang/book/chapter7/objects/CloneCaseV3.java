package org.lang.book.chapter7.objects;

/**
 * 正确的Clone方法的示例。
 * 
 * @author chenjunfeng1
 *
 */
public class CloneCaseV3 implements Cloneable {
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneCaseV3 obj1 = new CloneCaseV3();
		CloneCaseV3 clone = (CloneCaseV3)obj1.clone();
		
		System.out.println("Clone Object Equal:" + (obj1 == clone) + "/" + obj1.equals(clone));
	}
}
