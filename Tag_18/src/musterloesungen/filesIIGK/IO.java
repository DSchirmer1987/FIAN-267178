package musterloesungen.filesIIGK;

import java.util.Scanner;

public class IO {
	
	public static void startOutput() {
		System.out.println("\nDieses Programm pr�ft eine Datei zeilenweise auf Zeilen mit mehr als n Zeichen.");
		IO.Spacer1();
		System.out.println("Eingabe erforderlich mit zwei Parametern (n,Dateiname inkl. vollst�ndigem Pfad).");
		IO.Example();
		IO.Spacer1();
		
		
		System.out.println("\nBitte geben Sie zwei Parameter - kommagetrennt - ein (n,vollst�ndiger Pfad mit dem Dateinamen): ");
	}
	
	public static void Spacer1() {
		System.out.println("=========================================================================================================");
	}
	public static void Example() {
		System.out.println("Beispiel f�r eine korrekte Eingabe: 19,C:\\Daten\\Musterdatei.txt");
	}

	public static String userInput() {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		return input;
	}
	
}
