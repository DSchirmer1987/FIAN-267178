package demoKlassen;

public class App {

	public static void main(String[] args) {
		Schwein schwein1 = new Schwein();
		Schwein schwein2 = new Schwein("Horst", 5);
		Schwein schwein3 = new Schwein(schwein2);

		
		schwein3.setName("Gandalf");
		
		System.out.println("Schwein1 - Name:" + schwein1.getName());
		System.out.println("Schwein2 - Name:" + schwein2.getName());
		System.out.println("Schwein3 - Name:" + schwein3.getName());
		
		schwein1.oink();
		
		// Programmieren mit Objekten
		System.out.println(schwein1.getName() + " macht " + schwein1.tonAusgeben());
		
		// Objektorientiertes Programmieren
		System.out.println(schwein1.tonAusgeben2());
		
		System.out.println(schwein1);

	}

}
