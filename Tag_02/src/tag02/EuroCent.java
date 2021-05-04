package tag02;

import java.util.Scanner;

public class EuroCent {

	public static void main(String[] args) {
		// Deklaration von Variablen
		int eingabe, cent, euro;
		
		// Den Scanner zum einlesen einbinden
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte eine Cent-Anzahl eingeben: ");
		
		// Eingabe des Users lesen und speichern
		eingabe = scanner.nextInt();
		
		// Berechnen der ganzen Euros
		euro = eingabe / 100;
		
		//Berechnen der Cents.
		cent = eingabe % 100;
		
		// Ausgabe
		System.out.println(eingabe + " Cent sind " + euro + " Euros und " + cent + " Cents");
	}

}
