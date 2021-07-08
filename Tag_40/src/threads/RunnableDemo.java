package threads;

import java.time.LocalDateTime;
import java.util.stream.Stream;

public class RunnableDemo {

	public static void main(String[] args) {
		/*
		 * Deklarieren der Threads mit einem Runnable-Object.
		 */
		Thread t1 = new Thread(new DateCommand());
		t1.start();
		
		Thread t2 = new Thread(new CounterCommand());
		t2.start();
		
	}

}



