package tag05.Nachmittagsaufgaben;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ArraysExerciseGK {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char again = 'j';

		while (again == 'j' || again == 'J') {
			short option = openMenu();
			optionCall(option);
			System.out.println("\nNochmal (j/[n]?");
			again = scanner.next().charAt(0);

		}
		;
		// scanner.close();
	}

	private static short openMenu() {
		Scanner scanner = new Scanner(System.in);
		short option = 0;

		do {
			System.out.println("Bitte geben Sie eine Auswahl ein für das Ausführen (3 - 8):");
			System.out.println("=====================================================================");
			System.out.println("(3) Aufgabe 3: Befüllen von Arrays und Berechnungen");
			System.out.println("(4) Aufgabe 4: Suchen im Array");
			System.out.println("(5) Aufgabe 5: Wechselgeld ausgeben");
			System.out.println("(6) Aufgabe 6: Lottozahlen und Häufigkeiten");
			System.out.println("(7) Aufgabe 7: Lottozahlen und Häufigkeiten");
			System.out.println("(8) Aufgabe 8: Passwortgenerator");
			System.out.println("=====================================================================");
			System.out.println();

			option = scanner.nextShort();
			// scanner.close();
		} while (option < 3 || option > 9);

		return option;

	}

	private static void optionCall(short option) {

		switch (option) {
		case 3: {
			Exercise3();
			break;
		}
		case 4: {
			Exercise4();
			break;
		}
		case 5: {
			Exercise5();
			break;
		}
		default: {
			return;
		}
		}
	}

	private static void Exercise3() {

////////////////////////////////
//start Aufgabe 3, 07.05.2021
////////////////////////////////

		/*
		 * Aufgabe 3: Befüllen von Arrays und Berechnungen Legen Sie ein Array eines
		 * beliebigen, ganzzahligen Datentyps mit der Größe 10 an. Füllen Sie das Array
		 * mit Zufallszahlen. Lassen Sie das Array ausgeben. Vertauschen Sie alle Zahlen
		 * im Array miteinander, d.h. die erste Zahl wird zur letzten Zahl, die zweite
		 * Zahl wird zur vorletzten Zahl, usw. Führen Sie den Tausch so durch, dass Sie
		 * kein weiteres Array anlegen müssen.
		 */

		// length of array
		short length = 10;
		int[] array = new int[length];

		array = fillArrayRandom(array);

		outputSpacer();

		changeInArray(array);

	}

	private static void outputSpacer() {
		System.out.println("==============================================");
	}

	private static int[] fillArrayRandom(int[] array) {

		short length = (short) array.length;
		Random random = new Random();
		// not "any" due to tests
		int limit = 100;

		for (int i = 0; i < length; i++) {
			array[i] = random.nextInt(limit) + 1;
		}

		System.out.println(Arrays.toString(array));
		return array;
	}

	private static void changeInArray(int[] array) {

		short length = (short) array.length;
		int tmp = 0;

		// length/2 for changes (here: index 0 - 4 (to 9 - 5))
		for (int i = 0; i < length / 2; i++) {
			tmp = array[i];
			array[i] = array[(length - 1) - i];
			array[(length - 1) - i] = tmp;
		}
		System.out.println(Arrays.toString(array));
	}
////////////////////////////////
//end Aufgabe 3, 07.05.2021
////////////////////////////////

	private static void Exercise4() {

////////////////////////////////
//start Aufgabe 4, 07.05.2021
////////////////////////////////

		/*
		 * Aufgabe 4: Suchen im Array Schreiben Sie eine Anwendung, die 100.000
		 * Zufallszahlen zwischen 0 und 50.000 in ein Array schreibt. Der Anwender soll
		 * eine zu suchende Zahl eingeben und die Anwendung soll im Array nach der Zahl
		 * suchen. Fangen Sie fehlerhafte Eingaben der gesuchten Zahl auf die obere und
		 * untere Zahlengrenze ab. Es wird ausgegeben: „Ja, die Zahl ist im Array“ oder
		 * „Nein, die Zahl ist nicht im Array“. Programmieren Sie die Suche als eine
		 * sequentielle Suche, d.h. fangen Sie beim ersten Array-Element an und
		 * vergleichen es mit dem gesuchten Wert. Falls es nicht das gesuchte Element
		 * ist, gehen Sie zum nächsten Array-Element usw. Zusätze: Geben Sie die Stelle
		 * (d.h. den Index) aus, an dem die Zahl gefunden wurde. Brechen Sie die
		 * Schleife ab, wenn die gesuchte Zahl im Array gefunden wurde. Alternativ:
		 * Suchen Sie alle vorkommen einer Zahl im Array, bzw. fragen Sie den Nutzer, ob
		 * nach weiteren Vorkommen gesucht werden soll, falls die gesuchte Zahl gefunden
		 * wurde.
		 */

		// length of array
		int length = 100000;
		int[] array = new int[length];

		array = fillArrayRandom100K(array);

		int searchNumber = searchDialogue(array);

		searchInArray(array, searchNumber);

	}

	private static int[] fillArrayRandom100K(int[] array) {

		int length = array.length;
		Random random = new Random();
		// not "any" due to tests
		int limit = 50000;

		for (int i = 0; i < length; i++) {

			// do not use random.nextInt(limit) +1; <- it will start at 1 instead of 0
			// read tooltip of function
			array[i] = random.nextInt(limit + 1);
		}

		// System.out.println(Arrays.toString(array));
		return array;
	}

	private static int searchDialogue(int[] array) {
		Scanner scanner = new Scanner(System.in);
		int searchNumber = 0;

		// test for search functionality
		for (int i = 0; i < 100; i++) {
			System.out.println(i + ": " + array[i]);
		}

		// number must be 0 - 50000, if not: loop
		do {

			// input number to search for
			System.out.println("Bitte geben Sie die Zahl an, die Sie suchen (0 - 50.000):");
			searchNumber = scanner.nextInt();

			// number must be 0 - 50000, if not: output extra info
			if (searchNumber < 0 || searchNumber > 50000) {
				System.out.println("Bitte nochmals eingeben (die Zahl muss von 0 bis 50.000 sein) ...");
				System.out.println("===============================================================================");
				System.out.println();
			}
		} while (searchNumber < 0 || searchNumber > 50000);

		return searchNumber;
	}

	private static void searchInArray(int[] array, int searchNumber) {

		int length = array.length;
		boolean inArray = false;
		int i = 0;
		ArrayList<Integer> hitsAt = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		char furtherSearch = 'j';

		for (i = 0; i < length; i++) {
			if (searchNumber == array[i]) {
				inArray = true;

				/*
				 * // option "Zusätze" line 2: break of loop after first match break;
				 */

				// option "Zusätze" line 3: search and output all hits in array
				hitsAt.add(i);

				// option "Zusätze" line 3 + 4: asks user for further search
				System.out.println("Suche hat Treffer geliefert - wollen Sie weitersuchen (j/[n])?");
				furtherSearch = scanner.next().charAt(0);

				if (furtherSearch == 'j' || furtherSearch == 'J') {
					continue;
				} else {
					break;
				}

			}
		}

		if (inArray == true) {
			System.out.println("\nJa, die Zahl ist im Array.");

			/*
			 * // option "Zusätze" line 1: output of index of first match
			 * System.out.println("Die Zahl steht im Array beim Index: " + i);
			 */

			// option "Zusätze" line 3: search and output all hits in array
			System.out.println(hitsAt);

		} else {
			System.out.println("\nNein, die Zahl ist nicht im Array.");
		}
	}

////////////////////////////////
//end Aufgabe 4, 07.05.2021
////////////////////////////////

	private static void Exercise5() {

////////////////////////////////
//start Aufgabe 5, 07.05.2021
////////////////////////////////

		/*
		 * Aufgabe 5: Wechselgeld ausgeben
		 * Schreiben Sie ein Programm, welches für z.B.
		 * einen Getränkeautomaten die Art und Anzahl der Münzen ermittelt, die für die
		 * Auszahlung des Wechselgeldes benötigt wird. Ein Beispiel: Ein Kunde kauft ein
		 * Getränk für 35 Cent, bezahl aber durch den Einwurf einer 1 Euro Münze. Das
		 * Restgeld entspricht 65 Cent und muss ausgezahlt werden. Idealerweise erfolgt
		 * dies in folgenden Münzen: 1 x 50 Cent 1 x 10 Cent 1 x 5 Cent Gehen Sie davon
		 * aus, dass Sie für das Programm einen idealen Automaten mit unendlich vielen
		 * Münzen jeder Sorte zur Verfügung haben. Erstellen Sie das Programm so, dass
		 * es vom Anwender direkt den Restgeldbetrag in Cent abfragt und dann die Folge
		 * der zu zahlenden Münzen ausgibt. Die Ausgabe könnte so aussehen:
		 */
		
		Scanner scanner = new Scanner(System.in);
		int[] coins = new int[]{50, 20, 10, 5, 2, 1};
		
		System.out.println("Bitte geben Sie einen Betrag in Cent ein: ");
		int change = scanner.nextInt();
		
		calcChange(change, coins);

	}
		private static void calcChange(int change, int[] coins) {
			
			int counter = 0;
			
			while(change > 0) {
				if(change/coins[counter]==0) {
					
				}else {
				System.out.println(change/coins[counter] + " x " + coins[counter] + " Cent");
				}
				change = change % coins[counter];
				counter++;}
			
		}
		

////////////////////////////////
//end Aufgabe 5, 07.05.2021
////////////////////////////////
	
}