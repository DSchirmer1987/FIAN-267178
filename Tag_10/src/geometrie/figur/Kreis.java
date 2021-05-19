/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_08
 * ©2020
 *
 */

package geometrie.figur;

public class Kreis extends AFigur{
	private double radius;
	
	public Kreis(double radius, Punkt mittelpunkt) {
		super();
		this.radius = radius;
		super.setMittelpunkt(mittelpunkt);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void berechneFlaeche() {
		super.setFlaeche(Math.PI * (this.radius * this.radius));
	}

	@Override
	public void berechneUmfang() {
		super.setUmfang(2 * Math.PI * this.radius);
	}

	@Override
	public String toString() {
		return "Kreis [radius=" + radius + ", getMittelpunkt()=" + getMittelpunkt() + ", getUmfang()=" + getUmfang()
				+ ", getFlaeche()=" + getFlaeche() + "]";
	}
}
