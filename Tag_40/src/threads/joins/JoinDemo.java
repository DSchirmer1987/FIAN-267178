package threads.joins;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		JoinRunnable runnable = new JoinRunnable();
		JoinRunnable runnable2 = new JoinRunnable();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable2);
		t1.start();
		t2.start();
//		Thread.sleep(500);
		t1.join();
		t2.join();
		System.out.println(runnable.result);
		System.out.println(runnable2.result);
	}

}
