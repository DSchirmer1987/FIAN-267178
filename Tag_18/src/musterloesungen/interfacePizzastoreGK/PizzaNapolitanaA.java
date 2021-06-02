package musterloesungen.interfacePizzastoreGK;

import java.util.Arrays;

public class PizzaNapolitanaA extends APizza {
	String[] zutaten = new String[] { "Hefeteigboden", "Tomatensauce", "Tomaten", "Mozzarella", "Chili",
			"schwarze Oliven", "Sardellen", "Kapern", "Petersilienblätter" };;
//	double preis = 100.00;
	
	public PizzaNapolitanaA() {
		this.setPreis(100);
		this.setZutaten(zutaten);
	}

//	@Override
//	public void setZutaten(String[] zutaten) {
//		this.zutaten = zutaten;
//
//	}
//
//	@Override
//	public void setPreis(double preis) {
//		this.preis = preis;
//
//	}

//	@Override
//	public String[] getZutaten() {
//		return zutaten;
//	}
//
//	@Override
//	public double getPreis() {
//		return preis;
//	}

	@Override
	public String toString() {
		return "PizzaNapolitanaA [zutaten=" + Arrays.toString(zutaten) + ", preis=" + preis + ", getZutaten()="
				+ Arrays.toString(getZutaten()) + ", getPreis()=" + getPreis() + "]";
	}
}
