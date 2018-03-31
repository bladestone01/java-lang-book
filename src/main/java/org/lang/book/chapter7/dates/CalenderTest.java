package org.lang.book.chapter7.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar 测试用例
 * @author chenjunfeng1
 *
 */
public class CalenderTest {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		 
		//设置时间为2018年4月9日，这里的月份从0开始，故需要-1
		cal.set(2018, 4-1, 9);
		//基于Calendar获取Date实例
		Date date1 = cal.getTime();
        System.out.println("Set DateTime:" + date1);
        
        //Date Formatter: yyyy/mm/dd HH:MM:ss，格式化输出日期信息
        DateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("Formatted Date:" + dateFormatter.format(date1));
        
        //Set Month from 4 to 5, 日期从9设置为20
        cal.set(Calendar.MONTH, 5-1);
        cal.set(Calendar.DATE, 20);
        System.out.println("Set Date:" + dateFormatter.format(cal.getTime()));
        
        ///获取Calendar的日期具体信息
        int year = cal.get(Calendar.YEAR); //月份
        int month = cal.get(Calendar.MONTH) + 1; //日期
        int date = cal.get(Calendar.DATE);
        //小时
        int hour = cal.get(Calendar.HOUR_OF_DAY); //分钟
        int minute = cal.get(Calendar.MINUTE); //秒
        int second = cal.get(Calendar.SECOND); //星期几
        int day = cal.get(Calendar.DAY_OF_WEEK); 
        System.out.println("年份:" + year); 
        System.out.println("月份:" + month); 
        System.out.println("日期:" + date); 
        System.out.println("小时:" + hour); 
        System.out.println("分钟:" + minute); 
        System.out.println("秒:" + second); 
        System.out.println("星期:" + day);
        
        //Calendar之add()使用示例
        Calendar cal2= Calendar.getInstance();
        cal2.set(2018, 1-1, 1);
        cal2.add(Calendar.DATE, 100);
        
        int month2 = cal2.get(Calendar.MONTH) + 1; //月份
        int date2 = cal2.get(Calendar.DATE);//日期
        System.out.println("Added Method Date:" +" 2018年" + month2 + "月" + date2 + "日");

        //after()方法示例      
        Calendar cal4 = Calendar.getInstance(); 
        cal4.set(2018, 1 - 1, 10);
        Calendar cal5 = Calendar.getInstance(); 
        cal5.set(2016, 1 - 1, 10);
        DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd");
        boolean isAfter = cal5.after(cal4);
        boolean isBefore = cal5.before(cal4);
        System.out.println(df1.format(cal5.getTime()) + " is after " + df1.format(cal4.getTime()) + "?,Answer:" + isAfter);
        System.out.println(df1.format(cal5.getTime()) + " is before " + df1.format(cal4.getTime()) + "?,Answer:" + isBefore);
        
        
        //Calendar在不同的时间类型之间的转换
        long timeMilis = System.currentTimeMillis();
        Calendar cal6 = Calendar.getInstance();
        cal6.setTimeInMillis(timeMilis);
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date3 = cal6.getTime();
        System.out.println("Current Date:" + df2.format(date3));
        
        Calendar cal7 = Calendar.getInstance();
        cal7.setTime(date3);
        long timeMilis2 = cal7.getTimeInMillis();
	}
}
