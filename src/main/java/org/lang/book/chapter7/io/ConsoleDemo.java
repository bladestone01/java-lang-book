package org.lang.book.chapter7.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 控制台的输入输出示例。
 * 
 * @author chenjunfeng1
 *
 */
public class ConsoleDemo {
	/**
	 * 基于Scanner的控制台输入和输出示例。 注意这里并未强制申明Exception的捕获，其中是有发生异常的可能性的。
	 * 
	 */
	public void testScannerConsole() {
		System.out.print("请输入您的名字:");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.print("请输入您考试的分数(1~~100):");
		int score = input.nextInt();
		System.out.println("您在测试中的成绩如下,姓名:" + name + ",成绩:" + score);
	}

	/**
	 * 基于输入输出流的测试示例。
	 * 
	 * @throws IOException
	 */
	public void testStreamConsole() throws IOException, NumberFormatException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("请输入您的名字:");
		String name = input.readLine();
		System.out.print("请输入您考试的分数(1~~100):");
		int score = Integer.parseInt(input.readLine());

		System.out.println("您在测试中的成绩如下,姓名:" + name + ",成绩:" + score);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		ConsoleDemo console = new ConsoleDemo();
        //console.testScannerConsole();
        console.testStreamConsole();
	}
}
