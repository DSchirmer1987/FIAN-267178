package bankHN;

public class BankApp {
	
	
	
	public static void main(String[] args) {
		SimpleBank b1 = new SimpleBank();
		b1.setFirstAccount(0);
		b1.setSecondAccount(1);
		b1.setTransactionAmount(1000);
		
		SimpleBank b2 = new SimpleBank();
		b2.setFirstAccount(3);
		b2.setSecondAccount(4);
		b2.setTransactionAmount(1000);
		
		SimpleBank b3 = new SimpleBank();
		b3.setFirstAccount(4);
		b3.setSecondAccount(1);
		b3.setTransactionAmount(2000);
		
		Thread t1 = new Angestellter(b1);
		t1.setName("Erster Thread");
		Thread t2 = new Angestellter(b2);
		t2.setName("Zweiter Thread");
		Thread t3 = new Angestellter(b3);
		t3.setName("Dritter Thread");
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
