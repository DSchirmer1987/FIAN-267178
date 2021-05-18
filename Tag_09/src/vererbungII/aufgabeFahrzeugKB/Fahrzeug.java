package vererbungII.aufgabeFahrzeugKB;

public abstract class Fahrzeug {

	private double aktPositionX; // in km
	private double aktPositionY; // in km
	private double aktGeschwindigkeit; // in km/h
	private static double MAX_GESCHWINDIGKEIT = 0; // in km/h
	private int anzahlRaeder = 0;

	
	public Fahrzeug() {
		super();

	}
	
	public Fahrzeug(int aktGeschwindigkeit) {
		super();
		this.aktGeschwindigkeit = aktGeschwindigkeit;
	}

	public Fahrzeug(int aktPosition, int aktGeschwindigkeit) {
		super();
		this.aktPositionX = aktPosition;
		this.aktGeschwindigkeit = aktGeschwindigkeit;
	}

	@Override
	public String toString() {
		return "Fahrzeug [MAX_GESCHWINDIGKEIT="+getMaxGeschwindigkeit() +", aktPosition=" + aktPositionX + ", aktGeschwindigkeit=" + aktGeschwindigkeit + ", anzahlRaeder="
				+ anzahlRaeder + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fahrzeug other = (Fahrzeug) obj;
		if (Double.doubleToLongBits(aktGeschwindigkeit) != Double.doubleToLongBits(other.aktGeschwindigkeit))
			return false;
		if (Double.doubleToLongBits(aktPositionX) != Double.doubleToLongBits(other.aktPositionX))
			return false;
		if (anzahlRaeder != other.anzahlRaeder)
			return false;
		return true;
	}

	public double getAktPositionY() {
		return aktPositionY;
	}

	public void setAktPositionY(double aktPositionY) {
		this.aktPositionY = aktPositionY;
	}

	public double getAktPositionX() {
		return aktPositionX;
	}

	public void setAktPositionX(double aktPosition) {
		this.aktPositionX = aktPosition;
	}

	public double getAktGeschwindigkeit() {
		return aktGeschwindigkeit;
	}

	public void setAktGeschwindigkeit(double aktGeschwindigkeit) {
		if (aktGeschwindigkeit <= MAX_GESCHWINDIGKEIT) {
			this.aktGeschwindigkeit = aktGeschwindigkeit;
		} else {
			this.aktGeschwindigkeit = MAX_GESCHWINDIGKEIT;
		}
	}

	public double getMaxGeschwindigkeit() {
		return MAX_GESCHWINDIGKEIT;
	}

	public static void setMAX_GESCHWINDIGKEIT(double mAX_GESCHWINDIGKEIT) {
		MAX_GESCHWINDIGKEIT = mAX_GESCHWINDIGKEIT;
	}

	public int getAnzahlRaeder() {
		return anzahlRaeder;
	}

	public void setAnzahlRaeder(int anzahlRaeder) {
		this.anzahlRaeder = anzahlRaeder;
	}

	public void bewegen(double minuten) {
		double weg = minuten * (aktGeschwindigkeit / 60);
		aktPositionX += weg;
	}

}
