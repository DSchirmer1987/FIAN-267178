package threads.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = () -> {
			System.out.println("r1.1 " + Thread.currentThread().getName());
			System.out.println("r1.2 " + Thread.currentThread().getName());
		};
		
		Runnable r2 = () -> {
			System.out.println("r2.1 " + Thread.currentThread().getName());
			System.out.println("r2.2 " + Thread.currentThread().getName());
		};
		
		ExecutorService executor = Executors.newCachedThreadPool();
		ExecutorService executor2 = Executors.newCachedThreadPool();
		
		executor.execute(r1);
		executor.execute(r2);
		
		Thread.sleep(5000);
		
		executor2.execute(r1);
		executor2.execute(r2);
		
		executor.shutdown();

	}

}
