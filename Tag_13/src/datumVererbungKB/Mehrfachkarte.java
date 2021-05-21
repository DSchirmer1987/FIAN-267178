package datumVererbungKB;

public class Mehrfachkarte extends Einzelticket {

	
	public Mehrfachkarte(int preis, int zone) {
		super(preis, zone, 10);
	}


	@Override
	public boolean gueltigInZone(int zone) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String toString() {
		return "Mehrfachkarte extends Einzelticket [preis=" + super.getPreis() + ", entwertet=" + super.istEntwertet()
				+ "erlaubteFahrten=" + super.getErlaubteFahrten() + "isGruppenKarte="+super.isGruppenkarte()+"]";
	}
	@Override
	public boolean equals(Object obj) {
		Einzelticket other = (Einzelticket) obj;
		if (super.getErlaubteFahrten() != other.getErlaubteFahrten())
			return false;
		if (super.istEntwertet() != other.istEntwertet())
			return false;
		if (super.getPreis() != other.getPreis())
			return false;
		return true;
	}

}
