package demoKlassen;

public class Schwein {
	private String name;
	private int alter;
	
	// Getter + Setter für jedes Attribut
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
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
	
	@Override
	public String toString() {
		return "Schwein [name=" + name + ", alter=" + alter + "]";
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
