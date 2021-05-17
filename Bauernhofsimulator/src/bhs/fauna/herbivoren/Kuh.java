package bhs.fauna.herbivoren;

import bhs.fauna.ATier;

public class Kuh extends ATier{
	/*
	 * Init-Block
	 * Wird bei jeder Erzeugung ausgeführt
	 * Name wird doppelt gesetzt.
	{
		this.name = "Freddy";
	}
	*/
		
	public Kuh() {
		// Konstruktor-Aufruf im Konstruktor
		this("Freddy", "Blau", 30.5);
	}
	
	/**
	 * @param name
	 * @param farbe
	 * @param gewicht
	 */
	public Kuh(String name, String farbe, double gewicht) {
		super(name, farbe, gewicht);
	}

	@Override
	public String toString() {
		return "Kuh [name=" + super.getName() + ", farbe=" + super.getFarbe() + ", gewicht=" + super.getGewicht() + "]";
	}

	@Override
	public void machGeraeusch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wirdGefressen() {
		// TODO Auto-generated method stub
		
	}
	
}
