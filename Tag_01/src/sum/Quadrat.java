package sum;

import java.util.Scanner;

public class Quadrat {
	public static void main(String[] args) {
		// Deklaration von Variablen
		int number, square, counter;
		
		// Initialisieren der Variablen
		number = 11;
		square = 0;
		counter = 1;
		
		// Wert von number festlegen durch Start-Argumente
		number = Integer.parseInt(args[0]);
		
		// Wert von number festlegen durch Eingabe des Benutzers.
		System.out.println("Bitte eine Zahl eingeben:");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		
		// Berechnung des Quadrated durch number-maliges Addieren von number
		while (counter <= number) {
			square = square + number;
			counter = counter + 1;
		}
		
		System.out.println("Das Quadrat von " + number + " ist: ");
		System.out.println("Durch " + number + "-maliges Addieren von " + number + " : " + square);
		
		// Reset der Variablen
		square = 0;
		counter = 1;
		int uneven = 1;
		
		// Berechnung des Quadrates durch addieren der n positiven ungeraden zahlen.
		while (counter <= number) {
			square = square + uneven;
			uneven = uneven + 2;
			counter = counter + 1;
		}
		System.out.println("Durch " + number + "-maliges Addieren von positiven ungeraden Zahlen: " + square);
		
		// Berechnung über die Multiplikation
		square = number * number;
		System.out.println("Durch Multiplikation: " + square);
	}
}
