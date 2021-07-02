package oop;

public class OOPDemo {

	public static void main(String[] args) {
		/**
		 * Programmieren mit Objekten
		 * 
		 * Es muss das wie bestimmt werden im Programmtext
		 * Es wird angeben, wie das Objekt etwas machen soll.
		 * 
		 */
		Rechteck r1 = new Rechteck(4,2);
		System.out.println("Mein Rechteck hat eine Fläche von: " +  r1.getSeiteA() * r1.getSeiteB() + " cm²");
		
		/**
		 * Objektorientieres Programmieren
		 * 
		 * Das WIE ist schon in der Klasse definiert.
		 * Es wird nur angegeben, was man von dem Objekt haben möchte.
		 * 
		 */
		Rechteck r2 = new Rechteck(4,2);
		System.out.println("Mein Rechteck hat eine Fläche von " + r2.berechneFlaeche() + " cm²");
		System.out.println(r2);
		
		/**
		 * Aufruf über eine weitere Methode
		 */
		ausgabe(r2);
	}
	
	public static void ausgabe(Rechteck r) {
		System.out.println("Mein Rechteck hat eine Fläche von " + r.berechneFlaeche() + " cm²");
	}

}
