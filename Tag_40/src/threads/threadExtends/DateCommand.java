package threads.threadExtends;

import java.time.LocalDateTime;

public class DateCommand extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(LocalDateTime.now());
		}
	}
	
}
