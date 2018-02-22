package org.lang.book.chapter1;

public class MainHelloWorld {

	public static void main(String[] args) {
		Robot robot = new Robot();
        String msg = robot.sayHello("Java Language");
        
        System.out.println(msg);
	}

}
