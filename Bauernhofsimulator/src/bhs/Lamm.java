package bhs;

public class Lamm extends Schaf {
	private String augenfarbe;

	public Lamm() {
		this("Shaun", "Blau-Grün", 42.42, "Zitronenrot");
	}

	public Lamm(String name, String farbe, double gewicht, String augenfarbe) {
		super(name, farbe, gewicht);
		this.augenfarbe = augenfarbe;
	}

	public String getAugenfarbe() {
		return augenfarbe;
	}

	public void setAugenfarbe(String augenfarbe) {
		this.augenfarbe = augenfarbe;
	}

	@Override
	public String toString() {
		return "Lamm [augenfarbe=" + augenfarbe + ", getName()=" + getName() + ", getFarbe()=" + getFarbe()
				+ ", getGewicht()=" + getGewicht() + "]";
	}
	
	
}
