package org.lang.book.chapter7.dates.java8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/**
 * Date Range Test Code. Class: Period, Duration, ChronoUnit
 * 
 * @author chenjunfeng1
 *
 */
public class DateRangeTest {
	public static void main(String[] args) {
		LocalDateTime from = LocalDateTime.of(2017, Month.APRIL, 16, 0, 0, 0);// 年月日时分秒
		LocalDateTime to = LocalDateTime.of(2018, Month.APRIL, 16, 23, 59, 59);
		Duration duration = Duration.between(from, to);
		System.out.println("Duration in days: " + duration.toDays()); //365
		System.out.println("Duration in hours: " + duration.toHours()); //8783
		
		Period period = Period.between(from.toLocalDate(), to.toLocalDate());
		System.out.println("Period in months:" + period.toTotalMonths());
		System.out.println("Period in year/month/days:" +  period.getYears() + "/" + period.getMonths() + "/" +period.getDays());
		
		//ChronoUnit
		ZoneId zone1 = ZoneId.of("America/Chicago");  
        ZoneId zone2 = ZoneId.of("Asia/Shanghai");  
        LocalTime now1 = LocalTime.now(zone1);  
        LocalTime now2 = LocalTime.now(zone2);  
        long hoursBetween = ChronoUnit.HOURS.between(now1, now2);  
        long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);  
        System.out.println("Total Hours in Gap:" + hoursBetween); // 1  
        System.out.println("Total Minutes in Gap:" + minutesBetween); // 60  
        
        long daysBetween = ChronoUnit.DAYS.between(from, to);
        long monthsBetween = ChronoUnit.MONTHS.between(from, to);
        System.out.println("ChronoUnit in days: " + daysBetween); //365
		System.out.println("ChronoUnit in months: " + monthsBetween); //12
	}
}
