package lösungenGK;

import java.util.Scanner;

public class ConvertCharToAscii {

////////////////////////////////
//start Aufgabe 2, 06.05.2021
////////////////////////////////

	
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		String eingabe;
		
		System.out.println("\nBitte geben Sie einen Buchstaben ein, zu dem Sie den ASCII-Wert erhalten möchten: ");

		eingabe = scanner.next();

		System.out.println("\nDer ASCII-Wert für " + eingabe + " lautet: " + (int) eingabe.charAt(0));
		
		scanner.close();

	}
	
////////////////////////////////
//end Aufgabe 2, 06.05.2021
////////////////////////////////

}
