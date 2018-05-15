package org.lang.book.chapter7.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/**
 * 演示演示装饰模式的应用场景.
 * 
 * @author chenjunfeng1
 *
 */
public class FileStreamBufferDemo {
	/**
	 * 测试读入文件内容.
	 * 
	 * @throws IOException
	 * @throws UnsupportedEncodingException
	 */
	public void testFileInputStream() throws UnsupportedEncodingException, IOException {
		// 读取文件(字节流)
		InputStream in = new FileInputStream("1.txt");

		BufferedInputStream bufferedStream = new BufferedInputStream(in);
		
		// 读取数据
		// 一次性取多少字节
		byte[] bytes = new byte[2048];
		// 接受读取的内容(n就代表的相关数据，只不过是数字的形式)
		int n = -1;
		// 循环取出数据
		while ((n = bufferedStream.read(bytes, 0, bytes.length)) != -1) {
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
		BufferedOutputStream bufferedOutStream = new BufferedOutputStream(out);

		byte[] bytes = new byte[2048];
		int n = -1;
		// 循环取出数据
		while ((n = in.read(bytes, 0, bytes.length)) != -1) {
			// 转换成字符串
			String str = new String(bytes, 0, n, "GBK"); // 这里可以实现字节到字符串的转换，比较实用
			System.out.println(str);
			bufferedOutStream.write(bytes, 0, n);
		}
		// 关闭流
		in.close();
		out.close();
	}

	/**
	 * 基于装饰模式的缓存机制。
	 * 
	 * @throws IOException
	 */
	public void testFileReader() throws IOException {
		FileReader reader = new FileReader("1.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String tempStr = null;
		while ((tempStr = bufferedReader.readLine()) != null) {
			System.out.println(tempStr);
		}

		reader.close();
	}

	/**
	 * 基于装饰模式下的Writer缓存机制的测试用例.
	 * 
	 * @throws IOException
	 */
	public void testFileWriter() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("1.txt"));
		FileWriter writer = new FileWriter("3.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		
		String tempStr = null;
		while ((tempStr = reader.readLine()) != null) {
			System.out.print(tempStr);
			bufferedWriter.append(tempStr);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}
		reader.close();
		writer.close();
	}

	public static void main(String[] args) throws UnsupportedEncodingException, IOException {
		FileStreamBufferDemo fsdemo = new FileStreamBufferDemo();
		// fsdemo.testFileInputStream();
		// fsdemo.testFileOutputStream();
		fsdemo.testFileReader();
		//fsdemo.testFileWriter();
	}
}
