/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_08
 * �2020
 *
 */

package junit.data;


public class Rechteck extends AFigur{
	private double seiteA;
	private double seiteB;
	
	public Rechteck(double seiteA, double seiteB, Punkt mittelpunkt) {
		super();
		this.seiteA = seiteA;
		this.seiteB = seiteB;
		super.setMittelpunkt(mittelpunkt);
	}
	
	public Rechteck() {
		
	}
	
	public double getSeiteA() {
		return seiteA;
	}


	public void setSeiteA(double seiteA) {
		this.seiteA = seiteA;
	}


	public double getSeiteB() {
		return seiteB;
	}


	public void setSeiteB(double seiteB) {
		this.seiteB = seiteB;
	}
	
	@Override
	public String toString() {
		return "Rechteck [seiteA=" + seiteA + ", seiteB=" + seiteB + ", getMittelpunkt()=" + getMittelpunkt()
				+ ", getUmfang()=" + getUmfang() + ", getFlaeche()=" + getFlaeche() + "]";
	}

	@Override
	public void berechneFlaeche() {
		super.setFlaeche(this.seiteA * this.seiteB);
	}

	@Override
	public void berechneUmfang() {
		super.setUmfang((seiteA + seiteB) * 2);
	}
	
	public double getFlaeche() {
		return this.seiteA * this.seiteB;
	}
	
	public double getUmfang() {
		return (seiteA + seiteB) * 2;
	}
	
}
