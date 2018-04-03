package org.lang.book.chapter7.dates;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * Java 8 New API.
 * 
 * http://www.importnew.com/14140.html
 * https://blog.csdn.net/sun_promise/article/details/51383618
 * @author chenjunfeng1
 *
 */
public class LocalDateTest {
	public static void main(String[] args) {
		//创建LocalDate时间
		LocalDate today = LocalDate.now();
		System.out.println("Current Day:" + today);

		//创建指定时日期的实际
		LocalDate specificDate = LocalDate.of(2018,  Month.JANUARY, 1);
		System.out.println("Specific Date:" + specificDate);
		
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Current Date in Tokyo="+todayKolkata);
 
        //java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
        //LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));
 
        //Getting date from the base date i.e 01/01/1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date= "+dateFromBase);
 
        LocalDate hundredDay2014 = LocalDate.ofYearDay(2017, 100);
        System.out.println("100th day of 2017="+hundredDay2014);
	}

}
