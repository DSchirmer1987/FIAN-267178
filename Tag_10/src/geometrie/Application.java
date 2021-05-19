/**
 * Daniel Schirmer
 *
 * 07.12.2020
 * Project : Tag_08
 * ©2020
 *
 */

package geometrie;

import geometrie.figur.AFigur;
import geometrie.figur.Dreieck;
import geometrie.figur.Kreis;
import geometrie.figur.Punkt;
import geometrie.figur.Quadrat;
import geometrie.figur.Rechteck;

public class Application {
	public static void main (String[] args) {
		double gesamtFlache = 0;
		AFigur[] figuren = new AFigur[20];
		for (int i = 0; i < 5; i++) {
			figuren[i] = new Rechteck(4.0, 5.0, new Punkt(4.0, 4.0));
		}
		for (int i = 5; i < 10; i++) {
			figuren[i] = new Quadrat(5.0, new Punkt(5.0, 5.0));
		}
		for (int i = 10; i < 15; i++) {
			figuren[i] = new Kreis(5.0, new Punkt(5.0, 5.0));
		}
		for (int i = 15; i < 20; i++) {
			figuren[i] = new Dreieck(5.0, 3.0, 3.0, 4.0, new Punkt(5.0, 5.0));
		}
		
		for (AFigur aFigur : figuren) {
			aFigur.berechneFlaeche();
			aFigur.berechneUmfang();		
			System.out.println(aFigur);
			gesamtFlache = gesamtFlache + aFigur.getFlaeche();
		}
		
		System.out.println("--------");
		System.out.println("GesamtFläche : " + gesamtFlache);
	}
}
