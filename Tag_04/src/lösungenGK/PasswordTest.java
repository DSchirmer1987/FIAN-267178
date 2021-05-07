package lösungenGK;

import java.util.Scanner;

public class PasswordTest {

	////////////////////////////////
	// start Aufgabe 4, 06.05.2021
	////////////////////////////////

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String password;
		String result;

		System.out.println("\nBitte geben Sie das Passwort ein, welches geprüft werden soll.");

		password = scanner.nextLine();
		scanner.close();

		// von 4 a)
		//testLength(password);
		
		testUCC(password);

	}


	
	private static void testLength(String password) {
			
			int pwlength = password.length();
			String txtl = "\nPasswort-Länge wird als ";
			String txtr = "sicher betrachtet (mind. 10 Zeichen).";
			
			System.out.printf("Ihr Passwort hat %d Zeichen.\n", pwlength);
			
			if(pwlength > 9) {
				System.out.println(txtl + txtr);
			} else {
				System.out.println(txtl + "nicht " + txtr);
				String msg = "Es fehlen %d Zeichen.";
				// grammar for case 10 - 9 = 1
				if(pwlength == 9){
					msg = msg.replaceFirst("fehlen", "fehlt");
				}
				System.out.printf(msg, 10 - pwlength);
		
			}

	}
	
	private static void testUCC(String password) {
		
		int pwlength = password.length();
		int asc = (int) password.charAt(0);
		// at least 2 for test UpperCase + Chiffre
		short[] crit = new short[2];
		// uppercase
		crit[0] = 0;
		// chiffre
		crit[1] = 0;

		
		for(int i = 0; i < pwlength; i++) {
		
			asc = (int) password.charAt(i);
			
			// uppercase
			if(asc > 64 && asc < 91) {
				crit[0]++;
				continue;
			}
			
			// chiffre
			if(asc > 47 && asc < 58) {
				crit[1]++;
				continue;
			}
			
		//System.out.println(password.charAt(i) + ": " + asc);
		//	System.out.println(crit[0] + "\t" + crit[1]);
			
		}
		
		System.out.printf("\nIhr Passwort enthält %d Großbuchstabe(n) und %d Ziffer(n).", crit[0], crit[1]);
		testLength(password);
		testLCS(password, crit[0], crit[1]);
	}
	
	private static void testLCS(String password, short UC, short C) {
		// Idee: Kleinbuchstaben sind ASCII 97 - 122, dann Länge - Anzahl von (UC, C, LC) = Anzahl Sonderzeichen - nicht ganz sauber vermutlich
	}
	
	////////////////////////////////
	//end Aufgabe 4, 06.05.2021
	////////////////////////////////

	
}
