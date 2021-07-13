package pizzeriaHN;

import java.util.Random;

public class Pizzaiolo extends Thread {
	private PizzaSync ps;
	
	Random rand = new Random(); // Erzeugt Zufallszahlengenerator

	public Pizzaiolo(PizzaSync ps) {
		this.ps = ps;
	}

	public void run() {
		int nummer = 0;
		int zeitZubereitung = 7000;
		while (true) {

			// Auf Telefonanruf warten und Bestellung entgegennehmen
			try {
				// nextInt gibt hier die nächste ganzzahlige Zufallszahl 
				// zwischen 0 und 10000
				// zurück
				int randZeit  = 3000 + rand.nextInt(10001);
				System.out.println("Kein Schwein ruft an - " + (randZeit/1000) + " Sekunden lang...\n");
				Thread.sleep(randZeit);
			} catch (InterruptedException e) {
				System.err.println("Exception");
			}
			++nummer;
			ps.setPizzaNr(nummer);
			System.out.println("Pizza " + nummer + " bestellt");
			System.out.println("(Zubereitung dauert " + (zeitZubereitung/1000) + " Sekunden)");

			// Pizza zubereiten und ausliefern
			try {
				Thread.sleep(zeitZubereitung);
				System.out.println("Pizza " + nummer + " zubereitet");
				
				
			} catch (InterruptedException e) {
				System.err.println("Exception");
			}
			
			try {
				ps.lieferePizza(nummer);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public PizzaSync getPs() {
		return ps;
	}

	public void setPs(PizzaSync ps) {
		this.ps = ps;
	}

	
}
