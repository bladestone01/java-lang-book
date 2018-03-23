package org.lang.book.chapter7.system;

import java.util.Scanner;

/**
 * System类的使用示例.
 * 
 * @author tonychen
 *
 */
public class SystemTest {
	public static void main(String[] args) {
		System.out.println("This is a demo string");
		System.err.println("This is an error message");

		Scanner scanner = new Scanner(System.in);
		String input = "";
		System.out.print("Please input:");
		while (!(input = scanner.nextLine()).equalsIgnoreCase("bye")) {
			System.out.println("You have typed:" + input);
			System.out.print("Please input:");
		}
		System.out.println("We have exited the code");
	}
}
