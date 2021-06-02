package musterloesungen.interfacePizzastoreGK;

public abstract class APizza {
	public String[] zutaten;
	public double preis;
	
	public String[] getZutaten() {
		return this.zutaten;
	}
	
	public void setZutaten(String[] zutaten) {
		this.zutaten = zutaten;
	}
	
	public double getPreis() {
		return this.preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}

}
