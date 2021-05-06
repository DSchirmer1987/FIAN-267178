package lösungen.dreieckGK;

//import tag03.DreieckGK.Punkt;

//Datei: Dreieck.java
public class Dreieck {
	private Punkt p1;
	private Punkt p2;
	private Punkt p3;

	public Dreieck() {
		System.out.println("Dreieck wird erzeugt aus 3 Eckpunkten");
		p1 = new Punkt();
		p2 = new Punkt();
		p3 = new Punkt();
	}
	
	/**
	 * 
	 * @param q1 Ein Punkt Anfang
	 * @param q2 Ein Punkt Ende
	 * @return Entfernung zwischen 2 Punkten
	 */
	public double entfernung(Punkt q1, Punkt q2) {
		return Math.sqrt(
				(q1.getX() - q2.getX()) * (q1.getX() - q2.getX()) + (q1.getY() - q2.getY()) * (q1.getY() - q2.getY()));

	}
	
	/**
	 * 
	 * @return Umfang des Dreiecks
	 */
	public double umfang() {
		return entfernung(p1, p2) + entfernung(p2, p3) + entfernung(p3, p1);
	}
}