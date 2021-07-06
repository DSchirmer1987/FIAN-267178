package arrayGK;

import java.util.Scanner;

public class ArrayE1T5 {

	// exercise 1
	public static int[] ErzeugeArray() {
		int n = 0;
		String q = "Bitte geben Sie die Gr��e des Arrays ein: ";

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(q);
			String tmp = sc.nextLine();
			try {
				n = Integer.parseInt(tmp);
			} catch (Exception e) {
				n = -1;
			}
		} while (n < 1 || n == -1);

		int[] arrayN = new int[n];

		for (int i = n - 1; i >= 0; i--) {
			arrayN[i] = n - i;
		}
		return arrayN;
	}

	public static void printArray(int[] arrayN) {
		System.out.println("i\tWert");
		for (int i = 0; i < arrayN.length; i++) {
			System.out.println(i + "\t" + arrayN[i]);
		}
	}

	// exercise 2
	public static int searchArray(int[] a, int value) {
		int searchIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (value == a[i]) {
				return i;
			}
		}
		return -1;
	}

	// exercise 3
	public static void swap(int[] a, int i, int j) {
		if ((i >= 0 && i < a.length) || (j >= 0 && j < a.length)) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		} else {
			System.out.println("Ung�ltige/r Parameter.");
		}
	}

	// exercise 4
	public static void reverseArray(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length - i -1);
		}
	}
	
	// exercise 5
	public static void cloneArray(int[] a) {
		int[] newA = new int[a.length];
		// instead of Clone()
		for(int i = 0; i < a.length; i++) {
			newA[i] = a[i];
		}
		
		//check
		System.out.println("\nPr�fung (Methode cloneArray per eigener Schleife)");
		System.out.println("- per equals-Methode: " + newA.equals(a));
		int c = newA.length;
		for(int i = 0; i < newA.length; i++) {
			if(newA[i] != a[i]) {
				c--;
			}
		}
		System.out.println("- L�nge Arrays stimmt �berein: " + (newA.length == a.length));
		System.out.println("- Elemente stimmen �berein: " + c + " von " + newA.length);
		
		int[] newA1 = a.clone();
		System.out.println("\nPr�fung (Methode cloneArray per Standard-Methode clone()");
		System.out.println("- per equals-Methode: " + newA1.equals(a));
		int c1 = newA1.length;
		for(int i = 0; i < newA1.length; i++) {
			if(newA1[i] != a[i]) {
				c1--;
			}
		}
		System.out.println("- L�nge Arrays stimmt �berein: " + (newA1.length == a.length));
		System.out.println("- Elemente stimmen �berein: " + c1 + " von " + newA1.length);
		
	}
}
