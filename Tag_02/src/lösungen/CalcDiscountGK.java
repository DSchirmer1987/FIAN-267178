package lösungen;

import java.util.Scanner;

public class CalcDiscountGK {

	public static void main(String[] args) {
		// Deklaration
		float number, price, total, discount;
		
		Scanner scanner = new Scanner(System.in);
		
		// Eingabe
		System.out.println("Bitte geben Sie die Stückzahl an: ");
		number = scanner.nextFloat();
		
		System.out.println("Bitte geben Sie den Einzelpreis an: ");
		price = scanner.nextFloat();
		

		// Verarbeitung

		discount = 1;
		
		if(number > 10) {
			discount = 0.95f;
		};
		if(number > 50) {
			discount = 0.9f;
		};
		
		total = number * price * discount;
		
		// Ausgabe
		System.out.println(number + " x " + price + " => Gesamtpreis (inkl. Rabattfaktor: " + discount + "): " + total + ".");
				
	}
}
