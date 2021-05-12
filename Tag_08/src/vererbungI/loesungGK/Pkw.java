package vererbungI.loesungGK;

//Datei: Pkw.java
class Pkw extends Fahrzeug {
	private String fahrzeugtyp = "Pkw";
	private String modellBezeichnung;

	public Pkw() {
		super();// Aufruf des Konstruktors der Basisklasse
		System.out.print("Geben Sie die Modellbezeichnung ein: ");
		modellBezeichnung = scanner.next();
	}

	public void print() {
		System.out.println("\nFahrzeugtyp : " + fahrzeugtyp);
		super.print();
		System.out.println("Modellbezeichnung : " + modellBezeichnung);
	}
}