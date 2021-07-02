package loesungen�sungen;

import java.util.Scanner;

public class TemperatureGK {

	public static void main(String[] args) {
		// Deklaration
		int temperature;
		
		Scanner scanner = new Scanner(System.in);
		
		// Eingabe
		System.out.println("Bitte geben Sie die Temperatur ein:");
//		temperature = Integer.parseInt(args[0]);
		temperature = scanner.nextInt();
	
		System.out.println("Bitte geben Sie ein, ob aktuell Niederschl�ge vorliegen (true, false):");
		
		// Einlesen eines Wahrheitswertes von der Konsole
//		 boolean precipitation = Boolean.parseBoolean(args[1]);
		
		boolean precipitation = scanner.nextBoolean();
		
		
		
		// System.out.println(precipitation + " -- " + precipitation == true);
		
		// ohne Niederschl�ge
		if(precipitation == false) {
			
			if(temperature >= 20) {
				System.out.println("Gehen wir schwimmen?");
				}
			if(temperature < 0) {
				System.out.println("Lass uns am Lagerfeuer Gl�hwein trinken.");
				}
			if(temperature >= 0 && temperature <= 19) {
				System.out.println("Gehen wir spazieren?");
				}
		}
		// mit Niederschl�gen
		else {
			
			if(temperature >= 0) {
				System.out.println("Sauwetter");
				}
			if(temperature < 0) {
				System.out.println("Komm, geh'n wir Schlittenfahren!");
				}
		}
		
	}
}
			

