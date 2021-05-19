/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_08
 * ©2020
 *
 */

package geometrie.figur;

public interface IFigur {	
	public abstract void berechneFlaeche();
	public abstract void berechneUmfang();
	public abstract void bewegen(Punkt zielpunkt);
}
