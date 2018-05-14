package org.lang.book.chapter7.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileStreamDemo {

	/**
	 * 测试读入文件内容.
	 * 
	 * @throws IOException
	 * @throws UnsupportedEncodingException
	 */
	public void testFileInputStream() throws UnsupportedEncodingException, IOException {
		// 读取文件(字节流)
		InputStream in = new FileInputStream("1.txt");

		// 读取数据
		// 一次性取多少字节
		byte[] bytes = new byte[2048];
		// 接受读取的内容(n就代表的相关数据，只不过是数字的形式)
		int n = -1;
		// 循环取出数据
		while ((n = in.read(bytes, 0, bytes.length)) != -1) {
			// 转换成字符串
			String str = new String(bytes, 0, n, "GBK"); // 这里可以实现字节到字符串的转换，比较实用
			System.out.println(str);
		}
		// 关闭流
		in.close();
	}

	public void testFileOutputStream() throws UnsupportedEncodingException, IOException {
		InputStream in = new FileInputStream("1.txt");
		OutputStream out = new FileOutputStream(new File("2.txt"));

		byte[] bytes = new byte[2048];
		int n = -1;
		// 循环取出数据
		while ((n = in.read(bytes, 0, bytes.length)) != -1) {
			// 转换成字符串
			String str = new String(bytes, 0, n, "GBK"); // 这里可以实现字节到字符串的转换，比较实用
			System.out.println(str);
			out.write(bytes, 0, n);
		}
		// 关闭流
		in.close();
		out.close();
	}

	public void testFileReader() throws IOException {
		FileReader reader = new FileReader("1.txt");
		char[] buffer = new char[1024];
		int ch = 0;
		while ((ch = reader.read()) != -1) {
			System.out.print((char) ch);
		}

		reader.close();
	}

	/**
	 * 基于Writer的测试用例.
	 * 
	 * @throws IOException
	 */
	public void testFileWriter() throws IOException {
		FileReader reader = new FileReader("1.txt");
		FileWriter writer = new FileWriter("3.txt");
		
		char[] buffer = new char[40];  //设置适当的buffer大小
		int len = 0;
		while ((len = reader.read(buffer)) != -1) {
			System.out.println("write data length:" + len);
			writer.write(buffer, 0, len);
		}
		reader.close();
		writer.close();
	}

	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		FileStreamDemo fsdemo = new FileStreamDemo();
		// fsdemo.testFileInputStream();
		// fsdemo.testFileOutputStream();
		//fsdemo.testFileReader();
		fsdemo.testFileWriter();
	}

}
