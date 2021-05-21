package ticketauswahlGK;

import java.time.LocalDate;

public class Mehrfahrtenkarte extends Ticket {

	public Mehrfahrtenkarte(int preis, int anzahlErlaubteFahrten, LocalDate gueltigkeitsDatum) {
		super(preis, anzahlErlaubteFahrten, gueltigkeitsDatum);
	}

	@Override
	public boolean gueltigInZone(int zone) {
		return false;
	}

	@Override
	public String toString() {
		return "Mehrfahrtenkarte [getPreis()=" + getPreis() + ", istEntwertet()=" + istEntwertet()
				+ ", getAnzahlErlaubteFahrten()=" + getAnzahlErlaubteFahrten() + ", getGueltigkeitsDatum()="
				+ getGueltigkeitsDatum() + "]";
	}

}
