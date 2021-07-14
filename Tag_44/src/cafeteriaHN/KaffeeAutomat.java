package cafeteriaHN;


import java.time.LocalTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class KaffeeAutomat extends Thread{
	
	LocalTime time;
	private int waterTank;	//Fassungsverm�gen in ml
	private int randConsumer = (int)  (Math.random() * 10001); // zufallzeit bis kunde kommt
	private int randSize = (int) (Math.random() * 3);	// zufallswert um tassengr��e zu bestimmen
	private int automatNr;
	private int cupSize; // gew�hlte tassengr��e ml
	private String cup;	// gew�hlte gr��e als String
	private static int kaffeeJunkie = 1; // zum z�hlen der kunden
	
	/*
	 * Konstruktor
	 */
	public KaffeeAutomat(int automatNr, int wasserstand) {
		this.automatNr = automatNr;
		this.waterTank = wasserstand;
	}

	@Override
	public void run() {
		// automat l�uft an
		System.out.println("Automat " + automatNr + " gestartet\n");
		
		while(true) {
			
		try {
			System.out.println("Automat " + automatNr + " wartet auf Kaffees�chtigen (" + (randConsumer/1000) + " sek)\n");
			sleep(randConsumer);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * nach der random Wartezeit zuf�llige auswahl der tassengr��e
		 * und �berpr�fung ob f�llmenge ausreicht
		 * im falle der neige, auff�llen, thread wird schlafen gelegt
		 * nach auff�llen des wasser, bekommt der mitarbeiter seine tasse
		 * (geteilte f�llmenge noch nicht implementiert)
		 */
		cupSize = chooseSize();
		
		System.out.println("Kaffeejunkie " + kaffeeJunkie + " verlangt nach einem " + cup + " Kaffee(" + cupSize +  "ml) an Automat " + automatNr +
				" ---- " + LocalTime.now());
		
		
		makeCoffeeOrNot();
		
		++kaffeeJunkie;
	}
	}
	
	/*
	 * zuf�llige auswahl der tassengr��e
	 */
	public int chooseSize() {
		int tmp = 0;
		
		switch(randSize) {
		
		case 0: tmp = CupSize.KLEIN.ml;
				cup = "kleinen";

					break;
		case 1: tmp = CupSize.MITTEL.ml;
				cup = "mittleren";
					break;
					
		case 2: tmp = CupSize.GROSS.ml;
				cup = "grossen";
					break;
		}
		
		return tmp;
	}
	/*
	 * methode zur kaffeeausgabe und pr�fung wg nachf�llen, falls kunde keinen ganzen kaffee bekam.
	 * sonst einfache kaffeeausgabe, mit anschlie�ender �berpr�fung ob wasser leer ist
	 */
	public void makeCoffeeOrNot() {
		if(waterTank < cupSize) {
			int tmp = waterTank;
			notEnoughWater();
			System.out.println("Automat " + automatNr + " aufgef�llt - Wasserstand " + waterTank + " ml.");
			System.out.println("Der nach dem warten sehr m�de Kunde " + kaffeeJunkie + " bekommt den Rest vom " + cup + " Kaffee.");
			waterTank -= (cupSize - tmp);
			System.out.println("Neuer Wasserstand Automat " + automatNr + " - " + waterTank + " ml\n");
	
		}
		else {
			waterTank -= cupSize;
			System.out.println("Einen " + cup + " Kaffee ausgegeben.");
			System.out.println("Neuer Wasserstand Automat " + automatNr + " - " + waterTank + " ml.\n");
			if(waterTank == 0)
				try {
					refill();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	/*
	 * methode falls wasser nicht reicht,
	 * 
	 */
	public void notEnoughWater() {
			System.out.println("Kaffee wird zubereitet.");
			System.out.println("Nicht genug Wasser f�r einen " + cup + " Kaffee. Erstmal kommen " + waterTank + " ml, Rest nach dem auff�llen.");
			
			try {
				refill();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		
	}
	/*
	 * methode, falls wasser nach dem zubereiten genau 0 ist 
	 * oder die menge f�r die angeforderte tassengr��e nicht ausreicht
	 */
	
	public void refill() throws InterruptedException {
		System.out.println("Automat " + automatNr + " wird aufgef�llt. Bitte 15 Sekunden warten, Danke!\n");
		sleep(15000); // 
		waterTank = 5000;
	}
	
	
	/*
	 * getter/setter
	 */

	public int getWaterTank() {
		return waterTank;
	}

	public void setWaterTank(int waterTank) {
		this.waterTank = waterTank;
	}

	public int getRandConsumer() {
		return randConsumer;
	}

	public void setRandConsumer(int randConsumer) {
		this.randConsumer = randConsumer;
	}

	public int getRandSize() {
		return randSize;
	}

	public void setRandSize(int randSize) {
		this.randSize = randSize;
	}

	public int getAutomatNr() {
		return automatNr;
	}

	public void setAutomatNr(int automatNr) {
		this.automatNr = automatNr;
	}

	public int getCupSize() {
		return cupSize;
	}

	public void setCupSize(int cupSize) {
		this.cupSize = cupSize;
	}

	public String getCup() {
		return cup;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}
	

}
