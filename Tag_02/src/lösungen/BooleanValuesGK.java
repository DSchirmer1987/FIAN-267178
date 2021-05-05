package lösungen;

import java.util.Scanner;

public class BooleanValuesGK {

	public static void main(String[] args) {
		// Deklaration
		Boolean bool1, bool2, boolVariable;
		
		bool1 = false;
		bool2 = false;
		boolVariable = false;
		
		// Eingabe
		
		// Verarbeitung + // Ausgabe

		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 2; j++) {
				
				boolVariable = bool1 && bool2;
				System.out.println(bool1 + " && " + bool2 + " liefert " + boolVariable);
				
				boolVariable = bool1 || bool2;
				System.out.println(bool1 + " || " + bool2 + " liefert " + boolVariable);
				
				boolVariable = bool1 ^ bool2;
				System.out.println(bool1 + "  ^ " + bool2 + " liefert " + boolVariable);
				
				System.out.println();
				
			if(bool2 == false) {
				bool2 = true;
			}
			else {
				bool2 = false;
			}
			}
			if(bool1 == false) {
				bool1 = true;
			}
		}
		
	}
}
