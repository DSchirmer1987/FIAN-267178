package vererbungII.aufgabeFahrzeugKB;

public class Rennwagen extends Fahrzeug {

	static {
		setMAX_GESCHWINDIGKEIT(220);		
	}
	
	{
		super.setAktPositionY(180);
		super.setAktPositionX(0);
		super.setAnzahlRaeder(4);
	}
	
	
	public Rennwagen() {
		// TODO Auto-generated constructor stub
	}

	public Rennwagen(int aktPosition, int aktGeschwindigkeit) {
		super(aktPosition, aktGeschwindigkeit);
		// TODO Auto-generated constructor stub
	}
	
	public Rennwagen(int aktGeschwindigkeit) {
		super(aktGeschwindigkeit);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Rennwagen extends Fahrzeug [MAX_GESCHWINDIGKEIT=" + super.getMaxGeschwindigkeit() + ", aktPosition="
				+ super.getAktPositionX() + ", aktGeschwindigkeit=" + super.getAktGeschwindigkeit() + ", anzahlRaeder="
				+ super.getAnzahlRaeder() + "]";
	}

}
