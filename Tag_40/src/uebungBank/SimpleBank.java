package uebungBank;

import java.util.Arrays;

public class SimpleBank {
	private double[] konten;

	public double[] getKonten() {
		return konten;
	}

	public void setKonten(double[] konten) {
		this.konten = konten;
	}

	public SimpleBank(double[] konten) {
		super();
		this.konten = konten;
	}
	
	@Override
	public String toString() {
		return "SimpleBank [konten=" + Arrays.toString(konten) + "]";
	}
	
	// synchronized sperrt die Methode für andere Threads, so lange ein Thread damit arbeitet.
	public synchronized void ueberweisung(int kontoA, int kontoB, double betrag) {
		double tmpA = this.konten[kontoA] - betrag;
		double tmpB = this.konten[kontoB] + betrag;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.konten[kontoA] = tmpA;
		this.konten[kontoB] = tmpB;
	}
}
