package arrays;

import java.util.Arrays;
import java.util.Random;

public class DemoArrays {

	public static void main(String[] args) {
		int z1,z2,z3,z4,z5;
		z1 = 1;
		z2 = 2;
		// Deklaration - Noch kein Speicher reserviert
		int[] zahlen;
		int[][] mehrdimZahlen;
		
		// Initialisieren - Speicher wird reserviert
		zahlen = new int[5];
		zahlen = new int[]{1,2,3,4,5};
		zahlen = new int[] {z1,z2,3,4,5};
		zahlen = new int[] {new Integer(3), new Integer(4)};
		
		mehrdimZahlen = new int[5][10];
		mehrdimZahlen = new int[][]{ zahlen, zahlen };
		
//		zahlen = int[] {1,2,3} <- funkioniert nicht.
		
		
		// Durchlaufen eines Arrays
		for(int i=0; i<zahlen.length;i++) {
			System.out.println(zahlen[i]);
		}
		for (int zahl : zahlen) {
			System.out.println(zahl);
		}
		
		// Pseudo-Speicheradresse
		System.out.println(zahlen);
		// Korrekte Ausgabe der Werte
		System.out.println(Arrays.toString(zahlen));
		
		
		// Ein Array mit Zufallszahlen
		int[] zufall = new int[3];
		
		// Mit der Util-Klasse MATH
		for (int i = 0; i < zufall.length; i++) {
			zufall[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(zufall));
		
		// Mit der Klasse Random
		Random random = new Random();
		for (int i = 0; i < zufall.length; i++) {
			zufall[i] = random.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(zufall));
	}

}
