package bhs.fauna.herbivoren;

public class Kalb extends Kuh {
	private double fleckengroesse;

	public Kalb() {
		this("Karl", "Grün", 300, 2.5);
	}

	public Kalb(String name, String farbe, double gewicht, double fleckengroesse) {
		super(name, farbe, gewicht);
		this.fleckengroesse = fleckengroesse;
	}

	public double getFleckengroesse() {
		return fleckengroesse;
	}

	public void setFleckengroesse(double fleckengroesse) {
		this.fleckengroesse = fleckengroesse;
	}

	@Override
	public String toString() {
		return "Kalb [fleckengroesse=" + fleckengroesse + ", getName()=" + getName() + ", getFarbe()=" + getFarbe()
				+ ", getGewicht()=" + getGewicht() + "]";
	}
	
	
	
	
}
