package threads.threadExtends;

public class ThreadExtendsDemo {

	public static void main(String[] args) {
		Thread t1 = new DateCommand();
		t1.start();
		t1.setName("DatumsThread");
		
		Thread t2 = new CounterCommand();
		t2.setName("ZählerThread");
		try {
			t2.sleep(5000);
			System.out.println("T2 Schläft");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		
		new Auto();
	}

}
