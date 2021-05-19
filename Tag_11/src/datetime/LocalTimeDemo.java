package datetime;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime jetzt = LocalTime.now();
		
		System.out.println(jetzt);
		
		LocalTime zeit = LocalTime.of(12, 30);
		System.out.println(zeit);
		
		System.out.println(LocalTime.of(12, 30, 45));
		System.out.println(LocalTime.of(12, 30, 45, 2546));
		
		LocalTime pausenstart = LocalTime.of(11, 30);
		System.out.println("Pause von: " + pausenstart + " bis " + pausenstart.plusMinutes(30));
		
		Clock clock = Clock.system(ZoneId.systemDefault());
		System.out.println(LocalTime.now(clock));
	}

}
