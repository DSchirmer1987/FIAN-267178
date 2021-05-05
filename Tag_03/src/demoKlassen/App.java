package demoKlassen;

public class App {

	public static void main(String[] args) {
		Schwein schwein1 = new Schwein();
		Schwein schwein2 = new Schwein("Horst", 5);
		Schwein schwein3 = new Schwein(schwein2);
		
		System.out.println("Schwein1 - Name:" + schwein1.name);
		System.out.println("Schwein2 - Name:" + schwein2.name);
		System.out.println("Schwein3 - Name:" + schwein3.name);
		
		schwein1.oink();
		
		// Programmieren mit Objekten
		System.out.println(schwein1.name + " macht " + schwein1.tonAusgeben());
		
		// Objektorientiertes Programmieren
		System.out.println(schwein1.tonAusgeben2());

	}

}
