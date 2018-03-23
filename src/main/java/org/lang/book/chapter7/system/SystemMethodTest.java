package org.lang.book.chapter7.system;

import java.util.Arrays;

/**
 * 展示System中定义的方法使用.
 * 
 * @author tonychen
 *
 */
public class SystemMethodTest {
	public static void main(String[] args) {
		int[] source = { 1, 2, 3, 4 };
		int[] dest = new int[5];
		System.arraycopy(source, 1, dest, 3, 2);
		// dest array:[0, 0, 0, 2, 3]
		System.out.println("dest array:" + Arrays.toString(dest));

		// currentTimeMilis（）使用方法
		long count = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			// 业务逻辑操作代码
			count++;
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("100000 times auto-add time consumed:" + time);

		// 当前程序直接退出了
		// System.exit(0);
		System.out.println("System is alive");

		String osName = System.getProperty("os.name");
		String user = System.getProperty("user.name");
		System.out.println("当前操作系统是:" + osName);
		System.out.println("当前用户是:" + user);
	}
}
