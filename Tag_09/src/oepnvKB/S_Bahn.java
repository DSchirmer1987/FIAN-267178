package oepnvKB;

public class S_Bahn extends Verkehrsmittel {

	private String schaffner;
	private int anzahlWagons, anzahlSitzeWagon;

	public S_Bahn() {
		super();
		// TODO Auto-generated constructor stub
	}

	public S_Bahn(int linie, String fahrer, String start, String ziel, String schaffner, int anzahlWagons,
			int anzahlSitzeWagon) {
		super(linie, fahrer, start, ziel);
		setSchaffner(schaffner);
		setAnzahlWagons(anzahlWagons);
		setAnzahlSitzeWagon(anzahlSitzeWagon);
		// TODO Auto-generated constructor stub
	}

	public int getAnzahlSitzeWagon() {
		return anzahlSitzeWagon;
	}

	public void setAnzahlSitzeWagon(int anzahlSitzeWagon) {
		if (anzahlSitzeWagon > 0 && anzahlSitzeWagon <= 120)
			this.anzahlSitzeWagon = anzahlSitzeWagon;
		else
			this.anzahlSitzeWagon = 100;
	}

	public int getAnzahlWagons() {
		return anzahlWagons;
	}

	public void setAnzahlWagons(int anzahlWagons) {
		if (anzahlWagons >= 0 && anzahlWagons <= 10)
			this.anzahlWagons = anzahlWagons;
		else
			this.anzahlSitzeWagon = 5;
	}

	public String getSchaffner() {
		return schaffner;
	}

	public void setSchaffner(String schaffner) {
		if (schaffner != null)
			this.schaffner = schaffner;
		else
			this.schaffner = "Schaffner";
	}

	@Override
	public String toString() {
		return "S_Bahn extends Verkehrsmittel [linie=" + super.getLinie() + ", fahrer=" + super.getFahrer() + ", start="
				+ super.getStart() + ", ziel=" + super.getZiel() + ", anzahlWagons=" + this.getAnzahlWagons()
				+ ", anzahlSitzeWagon=" + this.getAnzahlSitzeWagon() + ", schaffner=" + this.getSchaffner() + "]";
	}
}
