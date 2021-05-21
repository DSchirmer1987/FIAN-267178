package ticketauswahlGK;

import java.time.LocalDate;

public class Gruppenkarte extends Ticket {

	public Gruppenkarte(int preis, int anzahlErlaubteFahrten, LocalDate gueltigkeitsDatum) {
		super(preis, anzahlErlaubteFahrten, gueltigkeitsDatum);
	}

	@Override
	public boolean gueltigInZone(int zone) {
		return false;
	}

	@Override
	public String toString() {
		return "Gruppenkarte [getPreis()=" + getPreis() + ", istEntwertet()=" + istEntwertet()
				+ ", getAnzahlErlaubteFahrten()=" + getAnzahlErlaubteFahrten() + ", getGueltigkeitsDatum()="
				+ getGueltigkeitsDatum() + "]";
	}

}
