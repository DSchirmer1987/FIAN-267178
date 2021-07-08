package threads.joins;

import java.time.LocalDateTime;

public class JoinRunnable implements Runnable{
	public int result;
	@Override
	public void run() {
		for(int i = 0; i< 100000000; i++) {
			int a = 50000000 * 50000 / 5050;
		}
		result = LocalDateTime.now().getYear();
	}

}
