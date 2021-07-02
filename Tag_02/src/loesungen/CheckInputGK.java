package loesungen�sungen;

import java.util.Scanner;

public class CheckInputGK {

	public static void main(String[] args) {
		// Deklaration
		String eingabe;
		
		Scanner scanner = new Scanner(System.in);
		
		// Eingabe
		System.out.println("Antworten Sie mit Ja (j oder J) oder Nein (n oder N):");
		eingabe = scanner.next();
		
		// Verarbeitung // Ausgabe

		if(eingabe.equalsIgnoreCase("j")) {
			System.out.println("Sie haben mit ja geantwortet.");
			return;
		};
		if(eingabe.equalsIgnoreCase("n")) {
			System.out.println("Sie haben mit nein geantwortet.");
			return;
		};
		System.out.println("Sie haben eine falsche Eingabe gemacht.");
	}
}