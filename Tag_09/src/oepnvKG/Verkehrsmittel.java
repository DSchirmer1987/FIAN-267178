package oepnvKG;

public abstract class Verkehrsmittel {
	private int linie;
	private String fahrer, start, ziel;

	public Verkehrsmittel() {
		super();
	}

	public Verkehrsmittel(int linie, String fahrer, String start, String ziel) {
		super();
		setLinie(linie);
		setFahrer(fahrer);
		setStart(start);
		setZiel(ziel);
	}

	@Override
	public String toString() {
		return "Verkehrsmittel [linie=" + linie + ", fahrer=" + fahrer + ", start=" + start + ", ziel=" + ziel + "]";
	}

	public int getLinie() {
		return linie;
	}

	public void setLinie(int linie) {
		if (linie >= 0)
			this.linie = linie;
		else
			this.linie = 0;
	}

	public String getFahrer() {
		return fahrer;
	}

	public void setFahrer(String fahrer) {
		if (fahrer != null)
			this.fahrer = fahrer;
		else
			this.fahrer = "Fahrer";
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		if (start != null)
			this.start = start;
		else
			this.start = "Zentrale";
	}

	public String getZiel() {
		return ziel;
	}

	public void setZiel(String ziel) {
		if (ziel != null)
			this.ziel = ziel;
		else
			this.ziel = "Hauptbahnhof";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Verkehrsmittel other = (Verkehrsmittel) obj;
		if (linie != other.linie)
			return false;
		return true;
	}

}
