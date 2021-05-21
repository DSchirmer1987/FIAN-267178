package datumVererbungKB;

public class Einzelticket extends Ticket {

	private int erlaubteFahrten;

	
	public Einzelticket(int preis, int zone, int erlaubteFahrten) {
		super(preis, zone);
		this.erlaubteFahrten = 1;
	}

	public int getErlaubteFahrten() {
		return erlaubteFahrten;
	}

	public void setErlaubteFahrten(int erlaubteFahrten) {
		this.erlaubteFahrten = erlaubteFahrten;
	}

	@Override
	public boolean gueltigInZone(int zone) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		return "Einzelticket extends Ticket [preis=" + super.getPreis() + ", entwertet=" + super.istEntwertet() 
				+ "erlaubteFahrten=" + this.erlaubteFahrten + "isGruppenKarte="+super.isGruppenkarte()+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + erlaubteFahrten;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Einzelticket other = (Einzelticket) obj;
		if (erlaubteFahrten != other.erlaubteFahrten)
			return false;
		if (super.istEntwertet() != other.istEntwertet())
			return false;
		if (super.getPreis() != other.getPreis())
			return false;
		return true;
	}

}
