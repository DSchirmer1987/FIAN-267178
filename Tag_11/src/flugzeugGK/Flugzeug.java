package flugzeugGK;

abstract class Flugzeug {
	private String hersteller; // Herstellername
	private int maxSpeed; // Max. Geschwindigkeit
	private String immatNummer; // Immatrikulationsnummer
	private int anzahlFluegel = 1; // Anzahl Flügelpaare

	public Flugzeug(String hersteller, int maxSpeed, int anzahlFluegel) {
		this.hersteller = hersteller;
		this.maxSpeed = maxSpeed;
		this.anzahlFluegel = anzahlFluegel;
	}

	public String getImmatNummer() {
		return immatNummer;
	}

	protected void setImmatNummer(String immatNummer) {
		this.immatNummer = immatNummer;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public String getHersteller() {
		return hersteller;
	}


	public int getAnzahlFluegel() {
		return anzahlFluegel;
	}


	abstract public boolean getLooping();
// weitere Methoden

	@Override
	public String toString() {
		return "Flugzeug [hersteller=" + hersteller + ", maxSpeed=" + maxSpeed + ", immatNummer=" + immatNummer
				+ ", anzahlFluegel=" + anzahlFluegel + ", getImmatNummer()=" + getImmatNummer() + ", getMaxSpeed()="
				+ getMaxSpeed() + ", getLooping()=" + getLooping() + "]";
	}

	
}