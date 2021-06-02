package musterloesungen.exceptionsGK;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String again = "j";

		while (again.equalsIgnoreCase("j")) {
			System.out.println(
					"Bitte geben Sie den Dividenden und Divisor ein, Schreibweise z. B. \"24:8\" (ohne Anführungszeichen):");
			String input = sc.nextLine();

			String[] operators = input.split(":");

			Calculate q = new Calculate();

			double quotient = 0.0;
			
			try {
				quotient = q.integerDivision(operators[0], operators[1]);
			}
			// instead of "IllegalArgumentException" according to exercise - for variable
			// and operator in only 1 string
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Sie haben einen Leertext eingegeben (oder einen unzulässigen bzw. keinen Operator).");

			}
	
			if(quotient !=0) {
			System.out.println(quotient);
			}
			System.out.println("Nochmal (j/[n])?");
			again = sc.nextLine();
		}

		System.out.println("Programm beendet.");
	}

}
