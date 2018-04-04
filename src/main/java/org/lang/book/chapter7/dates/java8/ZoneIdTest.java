package org.lang.book.chapter7.dates.java8;

/**
 * 关于时区ZoneId的信息.
 * 
 */
import java.time.ZoneId;

public class ZoneIdTest {

	public static void main(String[] args) {
		// 输出所有可见的时区ID，eg：Asia/Aden, America/Cuiaba, Etc/GMT+9等  
		System.out.println(ZoneId.getAvailableZoneIds());  
		  
		ZoneId zone1 = ZoneId.of("Europe/Berlin");  
		ZoneId zone2 = ZoneId.of("Asia/Shanghai");  
		System.out.println(zone1.getRules());  
		System.out.println(zone2.getRules());  
	}

}
