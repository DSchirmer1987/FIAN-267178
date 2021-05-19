/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_08
 * ©2020
 *
 */

package geometrie.figur;

public abstract class AFigur implements IFigur{
	private Punkt mittelpunkt;
	private double umfang;
	private double flaeche;
	
	public Punkt getMittelpunkt() {
		return mittelpunkt;
	}

	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelpunkt = mittelpunkt;
	}
	
	public double getUmfang() {
		return umfang;
	}

	public void setUmfang(double umfang) {
		this.umfang = umfang;
	}

	public double getFlaeche() {
		return flaeche;
	}

	public void setFlaeche(double flaeche) {
		this.flaeche = flaeche;
	}

	@Override
	public void bewegen(Punkt zielpunkt) {
		this.mittelpunkt = zielpunkt;
	}
	
}
