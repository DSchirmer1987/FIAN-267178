package bankHN;

public class SimpleBank extends Thread{

	private double[] accounts = new double[] {1000, 2000, 3000, 4000, 5000};
	private int firstAccount, secondAccount;
	private double transactionAmount;
	private Angestellter angestellter;
	
	public SimpleBank() {
		
	}
	
	public void doTransaction(int firstAccount, int secondAccount, double transactionAmount) {
		
		try {
			this.firstAccount = firstAccount;
			this.secondAccount = secondAccount;
			this.transactionAmount = transactionAmount;
			
			takeMoney(firstAccount, transactionAmount);
			sleep(5000);
			depositMoney(secondAccount, transactionAmount);
			
		} catch (Exception e) {
			System.out.println("Kontonummer nicht vorhanden");
		}
		
	}
	
	public void takeMoney(int account, double amount) {
		System.out.println("Abbuchung - " + getName());
		accounts[account] -= amount;
	}
	public void depositMoney(int account, double amount) {
		System.out.println("Gutschrift - " + getName());
		accounts[account] -= amount;
	}
	
	public void showBalances() {
		for(int i = 0; i < accounts.length; i++) {
			System.out.println("Kto-Nr " + i + "\t" + accounts[i] + "\tNR_" + i + "\t" + getName());
		}
		System.out.println();
		
	}
	public double[] getAccounts() {
		return accounts;
	}
	public void setAccounts(double[] accounts) {
		this.accounts = accounts;
	}
	public int getFirstAccount() {
		return firstAccount;
	}
	public void setFirstAccount(int firstAccount) {
		this.firstAccount = firstAccount;
	}
	public int getSecondAccount() {
		return secondAccount;
	}
	public void setSecondAccount(int secondAccount) {
		this.secondAccount = secondAccount;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Angestellter getAngestellter() {
		return angestellter;
	}

	public void setAngestellter(Angestellter angestellter) {
		this.angestellter = angestellter;
	}
	
}
