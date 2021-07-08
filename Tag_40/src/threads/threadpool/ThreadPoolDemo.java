package threads.threadpool;

public class ThreadPoolDemo {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			System.out.println("r1.1 " + Thread.currentThread().getName());
			System.out.println("r1.2 " + Thread.currentThread().getName());
		};
		
		Runnable r2 = () -> {
			System.out.println("r2.1 " + Thread.currentThread().getName());
			System.out.println("r2.2 " + Thread.currentThread().getName());
		};

	}

}
