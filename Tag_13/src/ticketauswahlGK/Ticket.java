package ticketauswahlGK;

import java.time.LocalDate;

public abstract class Ticket {
	private int preis; // Der Preis
	private boolean entwertet; // Ungültig, wenn entwertet!
	private int anzahlErlaubteFahrten;
	private LocalDate gueltigkeitsDatum;
	
	public Ticket(int preis, int anzahlErlaubteFahrten, LocalDate gueltigkeitsDatum) {
		this.preis = preis;
		this.anzahlErlaubteFahrten = anzahlErlaubteFahrten;
		this.gueltigkeitsDatum = gueltigkeitsDatum;
		entwertet = false;
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

	public int getAnzahlErlaubteFahrten() {
		return anzahlErlaubteFahrten;
	}

	public void setAnzahlErlaubteFahrten(int anzahlErlaubteFahrten) {
		this.anzahlErlaubteFahrten = anzahlErlaubteFahrten;
	}

	public LocalDate getGueltigkeitsDatum() {
		return gueltigkeitsDatum;
	}

	public void setGueltigkeitsDatum(LocalDate gueltigkeitsDatum) {
		this.gueltigkeitsDatum = gueltigkeitsDatum;
	}

	@Override
	public String toString() {
		return "Ticket [preis=" + preis + ", entwertet=" + entwertet + ", anzahlErlaubteFahrten="
				+ anzahlErlaubteFahrten + ", gueltigkeitsDatum=" + gueltigkeitsDatum + ", getPreis()=" + getPreis()
				+ ", istEntwertet()=" + istEntwertet() + ", getAnzahlErlaubteFahrten()=" + getAnzahlErlaubteFahrten()
				+ ", getGueltigkeitsDatum()=" + getGueltigkeitsDatum() + "]";
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
		if (anzahlErlaubteFahrten != other.anzahlErlaubteFahrten)
			return false;
		if (entwertet != other.entwertet)
			return false;
		if (gueltigkeitsDatum == null) {
			if (other.gueltigkeitsDatum != null)
				return false;
		} else if (!gueltigkeitsDatum.equals(other.gueltigkeitsDatum))
			return false;
		if (preis != other.preis)
			return false;
		return true;
	}

}
