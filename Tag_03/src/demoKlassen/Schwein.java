package demoKlassen;

public class Schwein {
	public String name;
	public int alter;
	
	// Default Konstruktor
	public Schwein() {
		this.name = "Rudi";
		this.alter = 3;
	}
	
	// Parameter-Konstruktor
	public Schwein(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}
	
	// Kopier-Konstruktor
	public Schwein(Schwein schwein) {
		this.name = schwein.name;
		this.alter = schwein.alter;
	}
	
	public void oink() {
		System.out.println(this.name + " macht Oink!");
	}
	
	public String tonAusgeben() {
		return "Oink";
	}
	
	public String tonAusgeben2() {
		return this.name + " macht Oink";
	}
}
