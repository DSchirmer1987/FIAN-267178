package vererbungII.aufgabeFahrzeugKB;

public class Auto extends Fahrzeug{

	static {
		setMAX_GESCHWINDIGKEIT(140);		
	}
	
	{
		super.setAktPositionY(90);
		super.setAktPositionX(0);
		super.setAnzahlRaeder(4);
	}
	
	public Auto() {
		
	}

	public Auto(int aktPosition, int aktGeschwindigkeit) {
		super(aktPosition, aktGeschwindigkeit);
		
	}
	public Auto(int aktGeschwindigkeit) {
		super(aktGeschwindigkeit);
		
	}

	@Override
	public String toString() {
		return "Auto extends Fahrzeug [MAX_GESCHWINDIGKEIT=" + super.getMaxGeschwindigkeit() + ", aktPosition="
				+ super.getAktPositionX() + ", aktGeschwindigkeit=" + super.getAktGeschwindigkeit() + ", anzahlRaeder="
				+ super.getAnzahlRaeder() + "]";
	}
}
