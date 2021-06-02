package musterloesungen.interfacePizzastoreGK;

import java.util.Arrays;
import java.util.Scanner;

public class PizzaMargheritaA extends APizza {
	String[] zutaten = new String[] { "Hefeteigboden", "Tomatensauce", "Tomaten", "Mozzarella", "Basilikumblätter" };
//	double preis;
	String groesse;
	
	public PizzaMargheritaA() {
		System.out.println(
				"Bitte geben Sie die Größe der Pizza Margherita an (klein/mittel/gross - Schreibweise beachten!):");
		Scanner scanner = new Scanner(System.in);
		setGroesse(scanner.nextLine());
		setPreis();
		setZutaten(zutaten);
		
	}
	
	public void setGroesse(String groesse) {
		this.groesse = groesse;
	}

//	@Override
//	public void setZutaten(String[] zutaten) {
//		this.zutaten = zutaten;
//
//	}


	public void setPreis() {
		if (groesse.equals("klein")) {
			this.preis = 2.90;
		} else if (groesse.equals("mittel")) {
			this.preis = 3.90;
		} else if (groesse.equals("gross")) {
			this.preis = 4.90;
		}

	}

//	@Override
//	public String[] getZutaten() {
//		return zutaten;
//	}
//
//	@Override
//	public double getPreis() {
//		return preis;
//	}

	@Override
	public String toString() {
		return "PizzaMargheritaA [zutaten=" + Arrays.toString(zutaten) + ", preis=" + preis + ", groesse=" + groesse
				+ ", getZutaten()=" + Arrays.toString(getZutaten()) + ", getPreis()=" + getPreis() + "]";
	}


//	@Override
//	public void setPreis(double preis) {
//		// TODO Auto-generated method stub
//		
//	}

}
