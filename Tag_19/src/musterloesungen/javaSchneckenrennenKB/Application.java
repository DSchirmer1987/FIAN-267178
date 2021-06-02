package musterloesungen.javaSchneckenrennenKB;

public class Application {

	public static void main(String[] args) {
		
		Rennschnecke speedy = new Rennschnecke("Speedy","Schleimling");
		Rennschnecke lucky = new Rennschnecke("Lucky","Naked Bike");
		Rennschnecke romeo = new Rennschnecke("Romeo", "Tiny House");
		Rennschnecke nicki = new Rennschnecke("Nicki", "÷sling");
		Rennschnecke michael = new Rennschnecke("Michael", "Weinberghang");
		
		Rennen race = new Rennen("Der groﬂe Preis von Kopfsalat",5,40);
		race.addRennschnecke(speedy);
		race.addRennschnecke(lucky);
		race.addRennschnecke(romeo);
		race.addRennschnecke(nicki);
		race.addRennschnecke(michael);
//		System.out.println(speedy.toString()); //for testing
//		System.out.println(race.getSnails().size()); // for testing
//		race.addRennschnecke(lucky);
//		race.addRennschnecke(speedy);
//		speedy.krieche();//for testing
//		System.out.println(speedy.toString());
//		System.out.println(race.toString());
		
//		race.removeRennschnecke("Speedy");// for testing
//		race.durchfuehren();
		
		Wettbuero buero = new Wettbuero(race);
		buero.wetteAnnehmen("Mayer",  speedy, 100);
		buero.wetteAnnehmen("Schulz", lucky, 100);
		buero.wetteAnnehmen("Knut", nicki, 100);
		buero.wetteAnnehmen("Peter", michael, 100);
		buero.wetteAnnehmen("Juergen", romeo, 100);
		
		buero.rennenDurchfuehren();

	}

}
