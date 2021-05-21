package datumVererbungKB;

public class Gruppenkarte extends Einzelticket { 
	
	public Gruppenkarte(int preis, int zone ) {
		super(preis, zone, 1);
		super.setGruppenkarte(true);
	}
	
	@Override
	public boolean gueltigInZone(int zone) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public String toString() {
		return "Gruppenkarte extends Einzelticket [preis=" + super.getPreis() + ", entwertet=" + super.istEntwertet()
				+ "erlaubteFahrten=" + super.getErlaubteFahrten() +"isGruppenKarte="+super.isGruppenkarte()+ "]";
	}

	

}
