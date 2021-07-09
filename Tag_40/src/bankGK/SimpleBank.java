package bankGK;

import java.util.Arrays;

/**
 * 
 * In der folgend dargestellten Implementierung wird die Bank durch eine Klasse SimpleBank realisiert.
 *
 */
public class SimpleBank implements Runnable{

	/**
	 * Diese Bank besitzt das Array konten, das die St�nde der einzelnen Konten enth�lt. Der Array-Index soll als Kontonummer dienen.
	 */
	private double[] konten = new double[] {0.0, 1000.0, 2000.0, 3000.0, 4000.0, 5000.0 };

	/**
	 * F�r Transaktionen zwischen zwei Konten stellt SimpleBank die Methode �berweisung() zur Verf�gung.
	 * Ihr werden die beiden beteiligten Kontonummern sowie der Betrag der �berweisung �bergeben.
	 * @param konto1
	 * @param konto2
	 * @param betrag
	 */
	public void ueberweisung(int konto1, int konto2, double betrag) {
		double tmpKontostand1  = konten[konto1] - betrag;
		double tmpKontostand2  = konten[konto2] + betrag;
		
		/**
		 * Zu Demonstrationszwecken wird die Ausf�hrung der �berweisung zwischen der Berechnung des neuen Kontostands
		 * und dessen Zur�ckschreiben unterbrochen. Hierzu wird auf die bekannte Methode sleep() zur�ckgegriffen.
		 */
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		konten[konto1] = tmpKontostand1;
		konten[konto2] = tmpKontostand2;
	}

	/**
	 * Als letztes verf�gt SimpleBank �ber die Methode kontostand(), mit der die aktuellen St�nde aller Konten angezeigt werden k�nnen.
	 */
	public void kontostand() {
		int i = 0;
		System.out.println("Kontonummer\tKontostand");
		for (double tmp : konten) {
			System.out.println(i + "\t\t" + tmp);
			i++;
		}
	}
	
	@Override
	public void run() {
		kontostand();
		
	}

	public double[] getKonten() {
		return konten;
	}

	public void setKonten(double[] konten) {
		this.konten = konten;
	}

	@Override
	public String toString() {
		return "SimpleBank [konten=" + Arrays.toString(konten) + ", getKonten()=" + Arrays.toString(getKonten()) + "]";
	}


}
