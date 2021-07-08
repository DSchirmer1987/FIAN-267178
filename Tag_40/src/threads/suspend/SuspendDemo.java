package threads.suspend;

import threads.threadExtends.CounterCommand;
import threads.threadExtends.DateCommand;

public class SuspendDemo {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new CounterCommand();
		Thread t2 = new DateCommand();
		t2.start();
		
		/*
		 * Suspend + Resume = Unschön
		 */
		t1.suspend();
		Thread.sleep(5000);
		t1.resume();

	}

}
