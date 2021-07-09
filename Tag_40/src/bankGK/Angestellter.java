package bankGK;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * Die �berweisungen sollen durch Bankangestellte erfolgen. Diese werden durch die Klasse Angestellter implementiert.
 *
 */
/**
 * 
 * Damit mehrere Angestellte gleichzeitig Transaktionen vornehmen k�nnen, werden sie von Thread abgeleitet.
 * TODO teacher: von Thread abgeleitet = "extends"?
 */
public class Angestellter extends Thread{
	
	private SimpleBank bank;
	
	private int[] kontoUeberweisung = new int[2];
	private double betragUeberweisung;

	/**
	 * Jeder Angestellte geh�rt zu einer Bank. Deshalb wird dem Konstruktor ein Verweis auf SimpleBank �bergeben.
	 * ... Die beiden beteiligten Kontonummern sowie der Betrag werden
	 * dem Konstruktor �bergeben und in entsprechenden Datenelementen der Klasse gespeichert.
	 * @param bank
	 * @param konto1
	 * @param konto2
	 * @param betrag
	 */
	public Angestellter(SimpleBank bank, int konto1, int konto2, double betrag) {	
		this.bank = bank;
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < kontoUeberweisung.length; i++) {
			System.out.println("Bitte geben Sie die Kontonummer des " + (i + 1) + ". Kontos ein: ");
			kontoUeberweisung[i] = sc.nextInt();
		}
		System.out.println("Bitte geben Sie den zu �berweisenden Betrag ein: ");
		betragUeberweisung = sc.nextDouble();
	}
	
	/**
	 * �ber diesen Verweis wird die Methode �berweisung() aufgerufen.
	 * ... Diese Datenelemente werden dann in run() benutzt, um die Methode �berweisung() der Bank aufzurufen.
	 */
	@Override
	public void run() {
		this.bank.ueberweisung(kontoUeberweisung[0], kontoUeberweisung[1], betragUeberweisung);
		this.bank.kontostand();
	}

	public SimpleBank getBank() {
		return bank;
	}

	public void setBank(SimpleBank bank) {
		this.bank = bank;
	}

	public int[] getKontoUeberweisung() {
		return kontoUeberweisung;
	}

	public void setKontoUeberweisung(int[] kontoUeberweisung) {
		this.kontoUeberweisung = kontoUeberweisung;
	}

	public double getBetragUeberweisung() {
		return betragUeberweisung;
	}

	public void setBetragUeberweisung(double betragUeberweisung) {
		this.betragUeberweisung = betragUeberweisung;
	}

	@Override
	public String toString() {
		return "Angestellter [bank=" + bank + ", kontoUeberweisung=" + Arrays.toString(kontoUeberweisung)
				+ ", betragUeberweisung=" + betragUeberweisung + ", getBank()=" + getBank()
				+ ", getKontoUeberweisung()=" + Arrays.toString(getKontoUeberweisung()) + ", getBetragUeberweisung()="
				+ getBetragUeberweisung() + "]";
	}

}
