package threads.runnables;

import java.time.LocalDateTime;

public class DateCommand implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(LocalDateTime.now());
		}
	}
	
}
