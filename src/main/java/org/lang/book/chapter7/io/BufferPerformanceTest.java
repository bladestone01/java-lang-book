package org.lang.book.chapter7.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 基于Buffered的性能测试对比分析。
 * 
 * @author tonychen
 *
 */
public class BufferPerformanceTest {
	private static final String FILENAME = "E:\\fashion-1.1.3.apk";

	public static void main(String[] args) throws IOException {
		int bufferSize = 1024;
		long l1 = readByBufferedInputStream(bufferSize);
		long l2 = readByInputStream(bufferSize);
		System.out
				.println("BufferSize:" + bufferSize + ", 通过BufferedInputStream读取用时：" + l1 + ";通过InputStream读取用时：" + l2);
		
		 bufferSize = 500;
		 l1 = readByBufferedInputStream(bufferSize);
		 l2 = readByInputStream(bufferSize);
		System.out
				.println("BufferSize:" + bufferSize + ", 通过BufferedInputStream读取用时：" + l1 + ";通过InputStream读取用时：" + l2);
		
		bufferSize = 128;
		l1 = readByBufferedInputStream(bufferSize);
		l2 = readByInputStream(bufferSize);
		System.out
				.println("BufferSize:" + bufferSize + ", 通过BufferedInputStream读取用时：" + l1 + ";通过InputStream读取用时：" + l2);
		
		bufferSize = 40;
		l1 = readByBufferedInputStream(bufferSize);
		l2 = readByInputStream(bufferSize);
		System.out
				.println("BufferSize:" + bufferSize + ", 通过BufferedInputStream读取用时：" + l1 + ";通过InputStream读取用时：" + l2);
	}

	public static long readByInputStream(int bufferSize) throws IOException {
		InputStream in = new FileInputStream(FILENAME);
		byte[] b = new byte[bufferSize];
		long start = System.currentTimeMillis();
		while (in.read(b, 0, bufferSize) != -1) {
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	public static long readByBufferedInputStream(int bufferSize) throws IOException {
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(FILENAME));
		byte[] b = new byte[bufferSize];
		long start = System.currentTimeMillis();
		while (in.read(b, 0, bufferSize) != -1) {
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
}
