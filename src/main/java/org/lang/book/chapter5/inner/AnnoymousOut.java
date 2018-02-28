package org.lang.book.chapter5.inner;

/**
 * 匿名类.
 * 
 * @author tonychen
 *
 */

public class AnnoymousOut {
    private static int a;
    private int b;

    private Object obj = new Object() {
        private String name = "匿名内部类";
        @Override
        public String toString() {
            return name;
        }
    };

    public void test() {
        Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello world!");
			}   	
        });
        
       thread.start();
    }
    
    public static void main(String[] args) {
		AnnoymousOut out = new AnnoymousOut();
		out.test();
	}
}