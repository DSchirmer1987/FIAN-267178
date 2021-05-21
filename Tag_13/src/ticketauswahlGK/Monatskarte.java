package ticketauswahlGK;

import java.time.LocalDate;

public class Monatskarte extends Ticket {
	
	private String nameEigentuemer;

	public Monatskarte(int preis, int anzahlErlaubteFahrten, LocalDate gueltigkeitsDatum, String nameEigentuemer) {
		super(preis, anzahlErlaubteFahrten, gueltigkeitsDatum);
		this.nameEigentuemer = nameEigentuemer;
	}

	@Override
	public boolean gueltigInZone(int zone) {
		return false;
	}

	public String getNameEigentuemer() {
		return nameEigentuemer;
	}

	public void setNameEigentuemer(String nameEigentuemer) {
		this.nameEigentuemer = nameEigentuemer;
	}

	@Override
	public String toString() {
		return "Monatskarte [nameEigentuemer=" + nameEigentuemer + ", getNameEigentuemer()=" + getNameEigentuemer()
				+ ", getPreis()=" + getPreis() + ", istEntwertet()=" + istEntwertet() + ", getAnzahlErlaubteFahrten()="
				+ getAnzahlErlaubteFahrten() + ", getGueltigkeitsDatum()=" + getGueltigkeitsDatum() + "]";
	}

}
