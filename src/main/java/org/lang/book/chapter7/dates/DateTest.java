package org.lang.book.chapter7.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Date 日期操作类。
 * 
 * @author tonychen
 *
 */
public class DateTest {

	public static void main(String[] args) {
		System.out.println("time:" + System.currentTimeMillis());
		Date date1 = new Date();
		System.out.println("Current Date:" + date1);

		// 基于入口参数的构造方法
		Date d1 = new Date(2018 - 1900, 4 - 1, 10);
		System.out.println(d1);

		// 年份
		int year = date1.getYear() + 1900;
		// 月份
		int month = date1.getMonth() + 1;
		// 日期
		int date = date1.getDate();
		// 小时
		int hour = date1.getHours();
		// 分钟
		int minute = date1.getMinutes();
		// 秒
		int second = date1.getSeconds();
		// 星期几
		int day = date1.getDay();
		System.out.println("年份:" + year);
		System.out.println("月份:" + month);
		System.out.println("日期:" + date);
		System.out.println("小时:" + hour);
		System.out.println("分钟:" + minute);
		System.out.println("秒:" + second);
		System.out.println("星期:" + day);
		
		//DateFormat 日期格式
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		System.out.println("现在时间:" + df.format(date1));
		
		DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//设置日期格式
		String dateStr = "2018/03/29 07:48:15";
		try {
			Date curDate = df1.parse(dateStr);
			System.out.println("CurDate:" + curDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
