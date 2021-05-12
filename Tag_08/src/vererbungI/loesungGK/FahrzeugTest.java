package vererbungI.loesungGK;

//Datei: FahrzeugTest.java
public class FahrzeugTest {
	public static void main(String args[]) {
		System.out.println("Start des Programms");

//Anlegen eines Arrays aus 6 Fahrzeugen
		// variable to test easier
		int anzFahrzeuge = 2;
		Fahrzeug[] fahrzeug = new Fahrzeug[anzFahrzeuge];
//Die ersten 3 Elemente des Arrays sollen mit Pkws gefüllt werden
		System.out.println();
		System.out.println("3 Pkws");
		for (int i = 0; i < anzFahrzeuge / 2; i++) {
			fahrzeug[i] = new Pkw();
		}
//Die drei letzten Elemente mit Motorrädern füllen
		System.out.println();
		System.out.println("3 Motorräder");
		for (int i = anzFahrzeuge / 2; i < anzFahrzeuge; i++) {
			fahrzeug[i] = new Motorrad();
		}

//Geben Sie in einer Schleife für alle Array-Elemente die
//entsprechenden Datenfelder aus
		float summe = 0;
// Ermittlung des Gesamtwerts aller Fahrzeuge
		for (Fahrzeug tmpfahrzeug : fahrzeug) {
			summe += tmpfahrzeug.getPreis();
			
			// special for print
			tmpfahrzeug.print();
			
		}
		// due to effects on decimal places -> 100 = 10^2 -> 2 decimal places
		// caution! if not /100.0 (!.0! is relevant -> float!), it will not output 2 decimal places,
		// means will calculate with int and output will be wrong!
		summe = (float) (((int)(summe * 100)) / 100.0);
		System.out.println("\n\nGesamtwert aller Fahrzeuge: " + summe);
	}
}