package bhs.fauna;

import bhs.IFressbar;

/**
 * 
 * @author Berliner
 * An abstract version of an animal
 */
public abstract class ATier implements IFressbar{
	private String name;
	private String farbe;
	private double gewicht;
	
	
	public ATier() {
		this("Freddy", "Blau", 30.5);
	}

	public ATier(String name, String farbe, double gewicht) {
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
	
	public void fressen(IFressbar nahrung){
		if(nahrung != this) {
			System.out.println("Ja");
			nahrung.wirdGefressen();
		}
	}
	
	public abstract void machGeraeusch();
}
