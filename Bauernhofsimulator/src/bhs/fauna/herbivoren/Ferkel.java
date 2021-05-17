package bhs.fauna.herbivoren;

public class Ferkel extends Schwein {
	private String ohrengroesse;
	
	public Ferkel() {
		this("Peter", "Violett", 89, "Mittel");
	}

	public Ferkel(String name, String farbe, double gewicht, String ohrengroesse) {
		super(name, farbe, gewicht);
		this.ohrengroesse = ohrengroesse;
	}

	public String getOhrengroesse() {
		return ohrengroesse;
	}

	public void setOhrengroesse(String ohrengroesse) {
		this.ohrengroesse = ohrengroesse;
	}

	@Override
	public String toString() {
		return "Ferkel [ohrengroesse=" + ohrengroesse + ", getName()=" + getName() + ", getFarbe()=" + getFarbe()
				+ ", getGewicht()=" + getGewicht() + "]";
	}
	
	
	
	
}
