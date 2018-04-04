package org.lang.book.chapter7.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantTest {

	public static void main(String[] args) {
		// Current timestamp
		Instant timestamp = Instant.now();
		System.out.println("Current Timestamp = " + timestamp);

		// Instant from timestamp
		Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
		System.out.println("Specific Time = " + specificTime);
	}
}
