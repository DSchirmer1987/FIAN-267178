package musterloesungen.schneckenrennenGK;

public class Main {

	public static void main(String[] args) {
		
		
		// number of "Schnecken"
		int n = 20;

		// test "Rennschnecke" exercise 6
		System.out.println("Test Rennschnecke Aufgabe 6");
		Rennschnecke[] rs = new Rennschnecke[n];
		for (int i = 0; i < n; i++) {
			rs[i] = new Rennschnecke(i);
			// only for initial testing
			// rs[i].krieche();
			System.out.println(rs[i]);
		}

		// test "Rennen" exercise 7
		System.out.println("============================================================");
		System.out.println("Test Rennen Aufgabe 7");
		Rennen r = new Rennen();
		for (int i = 0; i < n; i++) {
			r.addRennschnecke(rs[i]);
		}
		System.out.println(r);

		r.removeRennschnecke("TurboSchnecki_3");

		System.out.println(r);

		r.durchfuehren();
		

		// test "Wettbuero" exercise 5
		System.out.println("============================================================");
		System.out.println("Test Wettbüro Aufgabe 5");
		
		Wettbuero wettbuero = new Wettbuero();
		
		for(int i = 1; i < 6; i++) {
			wettbuero.wetteAnnehmen("TurboSchnecki_" + (i*2), i * 3, "Spieler_" + i);
		}
		
		wettbuero.rennenDurchfuehren();
		
		System.out.println(wettbuero);

	}

}
