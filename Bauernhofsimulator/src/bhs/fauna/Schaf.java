package bhs.fauna;

public class Schaf {
	private String name;
	private String farbe;
	private double gewicht;
	
	/*
	 * Init-Block
	 * Wird bei jeder Erzeugung ausgeführt
	 * Name wird doppelt gesetzt.
	{
		this.name = "Freddy";
	}
	*/
		
	public Schaf() {
		// Konstruktor-Aufruf im Konstruktor
		this("Freddy", "Blau", 30.5);
	}
	
	/**
	 * @param name
	 * @param farbe
	 * @param gewicht
	 */
	public Schaf(String name, String farbe, double gewicht) {
		super();
		this.name = name;
		this.farbe = farbe;
		this.gewicht = gewicht;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}

	@Override
	public String toString() {
		return "Schaf [name=" + name + ", farbe=" + farbe + ", gewicht=" + gewicht + "]";
	}
	


	
	
	
	
}
