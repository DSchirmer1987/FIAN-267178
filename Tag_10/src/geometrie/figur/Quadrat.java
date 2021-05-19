/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_08
 * ©2020
 *
 */

package geometrie.figur;

public class Quadrat extends Rechteck{

	public Quadrat(double seiteA, Punkt mittelpunkt) {
		super(seiteA, seiteA, mittelpunkt);
	}

	@Override
	public String toString() {
		return "Quadrat [getSeiteA()=" + getSeiteA() + ", getMittelpunkt()=" + getMittelpunkt() + ", getUmfang()="
				+ getUmfang() + ", getFlaeche()=" + getFlaeche() + "]";
	}
}
