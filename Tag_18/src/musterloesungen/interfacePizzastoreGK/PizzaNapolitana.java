package musterloesungen.interfacePizzastoreGK;

import java.util.Arrays;

public class PizzaNapolitana implements IPizza {
	String[] zutaten = new String[] { "Hefeteigboden", "Tomatensauce", "Tomaten", "Mozzarella", "Chili",
			"schwarze Oliven", "Sardellen", "Kapern", "Petersilienblätter" };;
	double preis = 100.00;

	public PizzaNapolitana() {

	}

	public String[] getZutaten() {
		return zutaten;
	}

	public void setZutaten(String[] zutaten) {
		this.zutaten = zutaten;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	@Override
	public String toString() {
		return "PizzaNapolitana [zutaten=" + Arrays.toString(zutaten) + ", preis=" + preis + ", getZutaten()="
				+ Arrays.toString(getZutaten()) + ", getPreis()=" + getPreis() + "]";
	}

}
