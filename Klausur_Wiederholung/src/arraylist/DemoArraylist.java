package arraylist;

import java.math.BigInteger;
import java.util.ArrayList;

public class DemoArraylist {

	public static void main(String[] args) {
		/**
		 * Ohne Datentyp - Nimmt jeden Datentyp an.
		 */
		ArrayList liste = new ArrayList<>();
		
		/**
		 * Object Datentyp - Nimmt auch jeden Datentyp an.
		 */
		ArrayList<Object> liste2 = new ArrayList<Object>();
		
		/**
		 * Expliziter Datentyp - Nimmt nur diesen Datentyp an.
		 * 
		 * Spezialfall Klasse als Datentyp:
		 * Auch jede Unterklase wird akzeptiert
		 * 
		 */	
		ArrayList<Integer> liste3 = new ArrayList<Integer>();
		
		
		/**
		 * Spezialfall für Zahlen
		 * 
		 * Akzeptiert alle Zahlen-Datentypen
		 */
		ArrayList<Number> liste4 = new ArrayList<Number>();
		
		
	}

}
