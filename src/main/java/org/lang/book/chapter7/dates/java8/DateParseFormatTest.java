package org.lang.book.chapter7.dates.java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateParseFormatTest {
	public static void main(String[] args) {
		//America/Chicago
		ZoneId zoneId = ZoneId.of("America/Chicago");
		//Format examples
        LocalDate date = LocalDate.now(zoneId);
        //default format
        System.out.println("Default format of LocalDate="+date);
        //specific format
        System.out.println("用户自定义格式:" +date.format(DateTimeFormatter.ofPattern("dd::MMM::uuuu")));
        System.out.println("数字类型格式:" + date.format(DateTimeFormatter.BASIC_ISO_DATE));
 
        LocalDateTime dateTime = LocalDateTime.now();
        //default format
        System.out.println("Default format of LocalDateTime="+dateTime);
        //specific format
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd::MMM::uuuu HH::mm::ss")));
        System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
  
        //Parse examples
        LocalDateTime dt = LocalDateTime.parse("27::四月::2017 21::39::48",
                DateTimeFormatter.ofPattern("dd::MMM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing = "+dt);
	}
}
