package flugzeugGK;

public class Verkehrsflugzeug extends Flugzeug{
	// point 1 exercise: additional variable for number of passengers
	private int anzahlPassagiere;

	// point 3 exercise: constructor as mentioned
	public Verkehrsflugzeug(String hersteller, int maxSpeed, String immatNummer, int anzahlPassagiere) {
		// point 1 exercise: exact 1 pair of wings
		super(hersteller, maxSpeed, 1);
		this.anzahlPassagiere = anzahlPassagiere;
		this.setImmatNummer(immatNummer);
		
	}

	// point 2 exercise: always no "Loopings", even in child classes
	// look at CVerkehrsflugzeug for further information
	@Override
	public final boolean getLooping() {
		return false;
	}

	// point 4 exercise: getter/setter for number of passengers
	public int getAnzahlPassagiere() {
		return anzahlPassagiere;
	}

	// point 4 exercise: getter/setter for number of passengers
	public void setAnzahlPassagiere(int anzahlPassagiere) {
		this.anzahlPassagiere = anzahlPassagiere;
	}

	@Override
	public String toString() {
		return "Verkehrsflugzeug [anzahlPassagiere=" + anzahlPassagiere + ", getLooping()=" + getLooping()
				+ ", getAnzahlPassagiere()=" + getAnzahlPassagiere() + ", getImmatNummer()=" + getImmatNummer()
				+ ", getMaxSpeed()=" + getMaxSpeed() + "]";
	}

}
