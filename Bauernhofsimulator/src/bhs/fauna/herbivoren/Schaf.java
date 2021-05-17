package bhs.fauna.herbivoren;

import bhs.fauna.ATier;

public class Schaf extends ATier{
	/*
	 * Init-Block
	 * Wird bei jeder Erzeugung ausgef�hrt
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
		super(name, farbe, gewicht);

	}

	@Override
	public String toString() {
		return "Schaf [getName()=" + getName() + ", getFarbe()=" + getFarbe() + ", getGewicht()=" + getGewicht() + "]";
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
