package musterloesungen.interfacePizzastoreGK;

import java.util.Arrays;
import java.util.Scanner;

public class PizzaMargherita implements IPizza {
	String[] zutaten = new String[] { "Hefeteigboden", "Tomatensauce", "Tomaten", "Mozzarella", "Basilikumblätter" };
	double preis;
	String groesse;

	public PizzaMargherita() {
		System.out.println(
				"Bitte geben Sie die Größe der Pizza Margherita an (klein/mittel/gross - Schreibweise beachten!):");
		Scanner scanner = new Scanner(System.in);
		setGroesse(scanner.nextLine());
		setPreis();
		
	}

	public String[] getZutaten() {
		return zutaten;
	}

	public void setZutaten(String[] zutaten) {
		this.zutaten = zutaten;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis() {
		if (groesse.equals("klein")) {
			this.preis = 2.90;
		} else if (groesse.equals("mittel")) {
			this.preis = 3.90;
		} else if (groesse.equals("gross")) {
			this.preis = 4.90;
		}

	}

	public String getGroesse() {
		return groesse;
	}

	public void setGroesse(String groesse) {
		this.groesse = groesse;
	}

	@Override
	public String toString() {
		return "PizzaMargherita [zutaten=" + Arrays.toString(zutaten) + ", preis=" + preis + ", groesse=" + groesse
				+ ", getZutaten()=" + Arrays.toString(getZutaten()) + ", getPreis()=" + getPreis() + ", getGroesse()="
				+ getGroesse() + "]";
	}

}
