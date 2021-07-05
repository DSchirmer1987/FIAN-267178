package arrays;

import java.util.Arrays;
import java.util.Iterator;

public class CloneArray {
	public static int[] zahlen, zahlen2;

	public static void main(String[] args) {
		int a = 5;
		System.out.println(a);
		// ab Java 10
		var intB = 5;
		var zahl = 6;
		var schuhgroesse = 42;
		var stringC = "Hallo";
		System.out.println(intB);
		
		
		//Arrays
		// Klausur Relevant
		zahlen = new int[]{1,2,3,4,5};
		zahlen2 = new int[1];
		
		// Nicht mehr relevant
		zahlen2[0] = zahlen[0];
		ausgabe();
		zahlen[0] = 6;
		ausgabe();
		
		zahlen2 = zahlen.clone();
		zahlen[0] = 1;
		ausgabe();
		
		// Klausur Relevant - Index
		for (int i = 0; i < zahlen.length; i++) {
			zahlen2[i] = zahlen[i];
		};
		
		zahlen2 = zahlen;
		
		String[] satz = new String[] {"Hallo", "Welt"};
		String[] satz2 = new String[2];
		satz2 = satz.clone();
		satz[0] = "Java";
		
		System.out.println(Arrays.toString(satz));
		System.out.println(Arrays.toString(satz2));
		
		
		
		System.out.println( true || true );
	}
	
	public static void ausgabe() {
		System.out.println("Zahlen: " + Arrays.toString(zahlen));
		System.out.println("Zahlen2: " + Arrays.toString(zahlen2));
	}

}
