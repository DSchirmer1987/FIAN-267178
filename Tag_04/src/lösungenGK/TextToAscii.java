package lösungenGK;

import java.util.Scanner;

public class TextToAscii {

////////////////////////////////
//start Aufgabe 3, 06.05.2021
////////////////////////////////

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String eingabe;

		System.out.println("\nBitte geben Sie einen Text ein, zu dem Sie die ASCII-Werte erhalten möchten: ");

		eingabe = scanner.nextLine();
		scanner.close();
			
		for(int i = 0; i < eingabe.length(); i++) {
			
			System.out.println(eingabe.charAt(i) + ": " + (int) eingabe.charAt(i));
			
		}	

	}

////////////////////////////////
//end Aufgabe 3, 06.05.2021
////////////////////////////////

}