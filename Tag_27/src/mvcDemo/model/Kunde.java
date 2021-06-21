package mvcDemo.model;

public class Kunde {
	private String vorname;
	private String nachname;
	private String adresse;
	private String kundennummer;

	public Kunde() {
		this.vorname = "Max";
		this.nachname = "Mustermann";
		this.adresse = "Hildegard Strasse";
		this.kundennummer = "001234";
	}

	public String getVorname() {
		return this.vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return this.nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getKundennummer() {
		return this.kundennummer;
	}

	public void setKundennummer(String kundennummer) {
		this.kundennummer = kundennummer;
	}

}
