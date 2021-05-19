package datetime;

import java.time.Clock;
import java.time.ZonedDateTime;

public class DateTimeDemo {

	public static void main(String[] args) {
		Clock systemClock = Clock.systemDefaultZone();
		ZonedDateTime time = ZonedDateTime.now();
		System.out.println(systemClock);
		System.out.println(time);

	}

}
