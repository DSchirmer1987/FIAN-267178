package vererbungII.aufgabeFahrzeugKB;

public class Krankenwagen extends Auto {

	private boolean blaulichtEin;

	static {
		setMAX_GESCHWINDIGKEIT(140);

	}

	{
		super.setAktPositionY(270);
		super.setAktPositionX(0);
		super.setAnzahlRaeder(4);
	}

	public Krankenwagen() {

	}

	public Krankenwagen(int aktPosition, int aktGeschwindigkeit) {
		super(aktPosition, aktGeschwindigkeit);

	}
	
	public Krankenwagen(int aktGeschwindigkeit) {
		super(aktGeschwindigkeit);
		
	}

	public Krankenwagen(int aktPosition, int aktGeschwindigkeit, boolean blaulichtEin) {
		this(aktPosition, aktGeschwindigkeit);
		this.blaulichtEin = blaulichtEin;

	}

	@Override
	public String toString() {
		return "Krankenwagen extends Auto [MAX_GESCHWINDIGKEIT=" + super.getMaxGeschwindigkeit() + ", aktPosition="
				+ super.getAktPositionX() + ", aktGeschwindigkeit=" + super.getAktGeschwindigkeit() + ", anzahlRaeder="
				+ super.getAnzahlRaeder() + ", blaulichtEin=" + blaulichtEin + "]";
	}

	public boolean isBlaulichtEin() {
		return blaulichtEin;
	}

	public void setBlaulichtEin(boolean blaulichtEin) {
		this.blaulichtEin = blaulichtEin;
	}

}
