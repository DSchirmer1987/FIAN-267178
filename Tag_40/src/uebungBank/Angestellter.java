package uebungBank;

public class Angestellter extends Thread {
	private SimpleBank bank;
	private int kontoA, kontoB;
	private double betrag;
	private static int counter;
	
	
	public Angestellter(SimpleBank bank, int kontoA, int kontoB, double betrag) {
		super();
		this.bank = bank;
		this.kontoA = kontoA;
		this.kontoB = kontoB;
		this.betrag = betrag;
		counter++;
		setName("Angestellter " + counter);
	}
	
	public SimpleBank getBank() {
		return bank;
	}
	public void setBank(SimpleBank bank) {
		this.bank = bank;
	}
	public int getKontoA() {
		return kontoA;
	}
	public void setKontoA(int kontoA) {
		this.kontoA = kontoA;
	}
	public int getKontoB() {
		return kontoB;
	}
	public void setKontoB(int kontoB) {
		this.kontoB = kontoB;
	}
	public double getBetrag() {
		return betrag;
	}
	public void setBetrag(double betrag) {
		this.betrag = betrag;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " übeweist von Konto: " + kontoA + " zu Konto: " + kontoB + " den Betrag: " + betrag);
		this.bank.ueberweisung(kontoA, kontoB, betrag);
		System.out.println(Thread.currentThread().getName() + " " + this.getBank());
	}
	
	
	
}
