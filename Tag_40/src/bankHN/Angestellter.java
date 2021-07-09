package bankHN;

public class Angestellter extends Thread {
	
	private SimpleBank bank;
	
	
	public Angestellter(SimpleBank bank) {
		this.bank = bank;
	
	}
	

	@Override
	public void run() {
		
		this.bank.doTransaction(this.bank.getFirstAccount(), this.bank.getSecondAccount(), this.bank.getTransactionAmount());
		this.bank.showBalances();
	}


	public SimpleBank getBank() {
		return bank;
	}

	public void setBank(SimpleBank bank) {
		this.bank = bank;
	}

}
