package org.lang.book.chapter7.objects;

public class CloneCaseV2 {
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneCaseV2 obj1 = new CloneCaseV2();
		CloneCaseV2 clone = (CloneCaseV2)obj1.clone();
	}
}
