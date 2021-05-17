package oepnvKB;

public class Bus extends Verkehrsmittel {

	private int sitzplaetze;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(int linie, String fahrer, String start, String ziel, int sitzplaetze) {
		super(linie, fahrer, start, ziel);
		setSitzplaetze(sitzplaetze);
		// TODO Auto-generated constructor stub
	}

	public int getSitzplaetze() {
		return sitzplaetze;
	}

	public void setSitzplaetze(int sitzplaetze) {
		if (sitzplaetze>=0 && sitzplaetze < 200)
		this.sitzplaetze = sitzplaetze;
		else
			this.sitzplaetze = 80;
	}

	@Override
	public String toString() {
		return "Bus extends Verkehrsmittel [linie=" + super.getLinie() + ", fahrer=" + super.getFahrer() + ", start=" + super.getStart() + ", ziel=" + super.getZiel() + ", sitzplaetze=" + this.getSitzplaetze()+ "]";
	}
	
}
