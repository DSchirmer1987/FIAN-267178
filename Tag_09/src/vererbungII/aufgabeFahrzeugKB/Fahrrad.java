package vererbungII.aufgabeFahrzeugKB;

public class Fahrrad extends Fahrzeug{

	static {
		setMAX_GESCHWINDIGKEIT(30);
		
	}
	
	{
		super.setAktPositionY(10);
		super.setAktPositionX(0);
		super.setAnzahlRaeder(2);
	
		
	}
	
	public Fahrrad() {
		
	}
	
	public Fahrrad(int aktGeschwindigkeit) {
		super(aktGeschwindigkeit);
		
	}

	public Fahrrad(int aktPosition, int aktGeschwindigkeit) {
		super(aktPosition, aktGeschwindigkeit);
		
	}
	
	@Override
	public String toString() {
		return "Fahrrad extends Fahrzeug [MAX_GESCHWINDIGKEIT=" + super.getMaxGeschwindigkeit() + ", aktPosition="
				+ super.getAktPositionX() + ", aktGeschwindigkeit=" + super.getAktGeschwindigkeit() + ", anzahlRaeder="
				+ super.getAnzahlRaeder() + "]";
	}

}
