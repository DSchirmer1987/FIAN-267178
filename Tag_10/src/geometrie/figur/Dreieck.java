/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_08
 * ©2020
 *
 */

package geometrie.figur;

public class Dreieck extends AFigur{
	private double height;
	private double seiteA;
	private double seiteB;
	private double seiteC;
	
	public Dreieck(double height, double seiteA, double seiteB, double seiteC, Punkt mittelpunkt) {
		super();
		this.height = height;
		this.seiteA = seiteA;
		this.seiteB = seiteB;
		this.seiteC = seiteC;
		super.setMittelpunkt(mittelpunkt);
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
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

	public double getSeiteC() {
		return seiteC;
	}

	public void setSeiteC(double seiteC) {
		this.seiteC = seiteC;
	}

	@Override
	public void berechneFlaeche() {
		super.setFlaeche(0.5d * (height * seiteA));
	}
	@Override
	public void berechneUmfang() {
		super.setUmfang(seiteA + seiteB + seiteC);	
	}

	@Override
	public String toString() {
		return "Dreieck [height=" + height + ", seiteA=" + seiteA + ", seiteB=" + seiteB + ", seiteC=" + seiteC
				+ ", getMittelpunkt()=" + getMittelpunkt() + ", getUmfang()=" + getUmfang() + ", getFlaeche()="
				+ getFlaeche() + "]";
	}
}
