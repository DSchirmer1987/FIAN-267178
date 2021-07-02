package oop;

public class Rechteck {
	private int seiteA;
	private int seiteB;
	
	public Rechteck() {
		this(5,10);
	}
	
	public Rechteck(int seiteA, int seiteB) {
		this.seiteA = seiteA;
		this.seiteB = seiteB;
	}

	public int getSeiteA() {
		return seiteA;
	}

	public void setSeiteA(int seiteA) {
		this.seiteA = seiteA;
	}

	public int getSeiteB() {
		return seiteB;
	}

	public void setSeiteB(int seiteB) {
		this.seiteB = seiteB;
	}
	
	public int berechneFlaeche() {
		return this.seiteA * this.seiteB;
	}
	
	@Override
	public String toString() {
		return "Rechteck [seiteA=" + seiteA + ", seiteB=" + seiteB + "] Flaeche: " + this.berechneFlaeche();
	}
	
	public static String schreibeFlaechenberechnungsFormel() {
		return "Seite A * Seite B";
	}
	
	
	
}
