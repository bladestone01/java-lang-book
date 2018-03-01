package org.lang.book.chapter5.inner;

public class Out {
	private static int a;
	private int b;

	public static class Inner {
		public void print() {
			System.out.println(a);
		}
	}
	
	
	public static void main(String[] args) {
		Out.Inner inner = new Out.Inner();
		inner.print();
	}
}
