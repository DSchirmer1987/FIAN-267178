package bankGK;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		SimpleBank bank = new SimpleBank();
		
		int n = 2;
		Thread[] t = new Thread[n];
		
		for(int i = 0; i < t.length;i++) {
			t[i] = new Thread(new Angestellter(bank, 0, 0, 0.0));
		}
		
		/**
		 * lifo working threads
		 */
		for(int i = t.length - 1; i > -1;i--) {
			t[i].start();
			t[i].join();
		}
	}
}
