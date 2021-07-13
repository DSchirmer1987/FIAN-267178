package pizzeriaGK;

import java.util.Random;

public class Pizzaiolo extends Thread {
	private PizzaSync ps;
	Random rand = new Random(); // Erzeugt Zufallszahlengenerator

	public Pizzaiolo(PizzaSync ps) {
		this.ps = ps;
	}

	public void run() {
		int nummer = 0;
		while (true) {
			
			/**
			 * nicht ganz sauber mit synchronized, da er "Anschlie�end" auf den n�chsten
			 * Telefonanruf warten soll...
			 * hier wartet er mit der Bereitstellung der Pizza
			 * so gel�st wg. der vorgegebenen Bausteine und Kommentare
			 */			
			ps.setPizzaioloBereitetPizzaZu(true);

			// Auf Telefonanruf warten und Bestellung entgegennehmen
			try {
				// nextInt gibt hier die nächste ganzzahlige Zufallszahl
				// zwischen 0 und 10000
				// zurück
				Thread.sleep(3000 + rand.nextInt(10001));
			} catch (InterruptedException e) {
				System.err.println("Exception");
			}
			++nummer;
			System.out.println("Pizza " + nummer + " bestellt");

			// Pizza zubereiten und ausliefern
			
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				System.err.println("Exception");
			}
			System.out.println("Pizza " + nummer + " zubereitet");
			ps.setPizzaioloBereitetPizzaZu(false);
			synchronized (Pizzeria.getPizzaiolo()) {
				System.err.println("Pizzaiolo m�chte Pizza " + nummer + " ausliefern\t\t\t\tPizzaiolo-Thread aktiv geschaltet...");
				Pizzeria.getPizzaiolo().notifyAll();
			}
			try {
				ps.lieferePizza(nummer);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			


		}
	}
}
