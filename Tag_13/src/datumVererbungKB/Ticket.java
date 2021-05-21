package datumVererbungKB;

public abstract class Ticket {
	private int preis; // Der Preis
	private boolean entwertet; // Ungültig, wenn entwertet!
	private boolean isGruppenkarte;
	int zone;

	public Ticket(int preis, int zone) {
		this.preis = preis;
		entwertet = false;
		this.isGruppenkarte=false;
		this.zone=zone;
		
	}

	public boolean isGruppenkarte() {
		return isGruppenkarte;
	}

	public void setGruppenkarte(boolean isGruppenkarte) {
		this.isGruppenkarte = isGruppenkarte;
	}

	public int getPreis() {
		return preis;
	}

	public void entwerten() {
		entwertet = true;
	}

	public boolean istEntwertet() {
		return entwertet;
	}

	public abstract boolean gueltigInZone(int zone);

	@Override
	public String toString() {
		return "Ticket [preis=" + preis + ", entwertet=" + entwertet + "]";
	}

	//keine ahnung was das ist XD
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (entwertet ? 1231 : 1237);
		result = prime * result + preis;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (entwertet != other.entwertet)
			return false;
		if (preis != other.preis)
			return false;
		return true;
	}
	
	
}
