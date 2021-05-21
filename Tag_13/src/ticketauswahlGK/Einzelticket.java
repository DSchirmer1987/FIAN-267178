package ticketauswahlGK;

import java.time.LocalDate;

public class Einzelticket extends Ticket {

	public Einzelticket(int preis, int anzahlErlaubteFahrten, LocalDate gueltigkeitsDatum) {
		super(preis, anzahlErlaubteFahrten, gueltigkeitsDatum);
	}

	@Override
	public boolean gueltigInZone(int zone) {
		return false;
	}

	@Override
	public String toString() {
		return "Einzelticket [getPreis()=" + getPreis() + ", istEntwertet()=" + istEntwertet()
				+ ", getAnzahlErlaubteFahrten()=" + getAnzahlErlaubteFahrten() + ", getGueltigkeitsDatum()="
				+ getGueltigkeitsDatum() + "]";
	}

}
