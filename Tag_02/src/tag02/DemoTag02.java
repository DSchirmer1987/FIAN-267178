package tag02;

import java.util.Scanner;

public class DemoTag02 {

	public static void main(String[] args) {
		boolean loop = true;
		
		while(loop) {
			System.out.println("--------------");
			System.out.println("1. Pizza");
			System.out.println("2. Nudeln");
			System.out.println("3. Salat");
			System.out.println("4. Desert");
			System.out.println("5. Beenden");

			System.out.println("Bitte wählen Sie einen Menüpunkt");
			
			int eingabe = new Scanner(System.in).nextInt();
			
			// If-Else-IF
			/*
			if(eingabe == 1) {
				System.out.println("Sie haben Pizza gewählt!");
			} else if (eingabe == 2) {
				System.out.println("Sie haben Nudeln gewählt!");
			} else if (eingabe == 3) {
				System.out.println("Sie haben Salat gewählt!");
			} else if (eingabe == 4) {
				System.out.println("Sie haben Desert gewählt!");
			} else if (eingabe == 5){
				System.out.println("Auf Wiedersehen!");
				loop = false;
			} else {
				System.out.println("Falsche Auswahl!");
			}
			*/
			
			// Switch-Case // Fall-Unterscheidung
			switch(eingabe) {
				case 1: {
					System.out.println("Sie haben Pizza gewählt!");
					break;
				}
				case 2: {
					System.out.println("Sie haben Nudeln gewählt!");
					break;
				}
				case 3: {
					System.out.println("Sie haben Salat gewählt!");
					break;
				}
				case 4: {
					System.out.println("Sie haben Desert gewählt!");
					break;
				}
				case 5: {
					System.out.println("Auf Wiedersehen!");
					loop = false;
					break;
				}
				default: {
					System.out.println("Falsche Auswahl!");
					break;
				}
			}
		}

	}

}
