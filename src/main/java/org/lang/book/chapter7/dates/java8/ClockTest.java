package org.lang.book.chapter7.dates.java8;

import java.time.Clock;

public class ClockTest {
	public static void main(String[] args) {
		// Clock 时钟
		Clock clock1 = Clock.systemDefaultZone();// 获取系统默认时区 (当前瞬时时间 )
		System.out.println("系统时间日期：" + clock1.instant());
		System.out.println("时间毫秒：" + clock1.millis());

		final Clock clock = Clock.systemUTC();// 获取系统时钟，并将其转换成使用UTC时区的日期和时间
		System.out.println("时间日期：" + clock.instant());
		System.out.println("时间毫秒值：" + clock.millis());
	}
}
