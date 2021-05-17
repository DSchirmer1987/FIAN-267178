package bhs.fauna;

public class Schwein extends ATier{
	/*
	 * Init-Block
	 * Wird bei jeder Erzeugung ausgeführt
	 * Name wird doppelt gesetzt.
	{
		this.name = "Freddy";
	}
	*/
		
	public Schwein() {
		// Konstruktor-Aufruf im Konstruktor
		this("Freddy", "Blau", 30.5);
	}
	
	/**
	 * @param name
	 * @param farbe
	 * @param gewicht
	 */
	public Schwein(String name, String farbe, double gewicht) {
		super(name, farbe, gewicht);
	}

	@Override
	public String toString() {
		return "Schwein [getName()=" + getName() + ", getFarbe()=" + getFarbe() + ", getGewicht()=" + getGewicht()
				+ "]";
	}

	@Override
	public void machGeraeusch() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
