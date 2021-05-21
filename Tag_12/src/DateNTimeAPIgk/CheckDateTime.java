package DateNTimeAPIgk;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Scanner;
import java.time.LocalDate;

public class CheckDateTime {

	public CheckDateTime() {
		// TODO Auto-generated constructor stub
	}
	
	public static void CheckTimeFromStringDateTime(String strTime) {
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

		try {
			LocalTime lTime = LocalTime.parse(strTime, dtf1);
			System.out.println("Sie haben es auch geschafft, eine gültige Zeit einzugeben => " + lTime + " Uhr.");
			System.out.println();
		} catch (DateTimeParseException e) {
			System.out.println("Zeit bitte nochmals eingeben - s. Vorgaben.");

		}
		}
	

	public static Return CheckDateFromStringDateTime() {

		boolean validDate = false;
		Return retBooleanString = new Return();
		retBooleanString.setRightString(null);
		// caution! recycled code from c++
		String input = ""; // zu prüfendes Datum

		String strtag = ""; // Übernahme zunächst als String
		String strmonat = ""; // Übernahme zunächst als String
		String strjahr = ""; // Übernahme zunächst als String
		String strp1 = ""; // Punkte aus String (zum Debuggen)
		String strp2 = ""; // Punkte aus String (zum Debuggen)

		char einzelzeichen = ' ';
		boolean fehler = false; // Fehler, wenn DD, MM, YYYY keine Ziffern enthalten

		int tag = 0; // Übernahme als short zwecks "Berechnung"
		int monat = 0; // Übernahme als short zwecks "Berechnung"
		int jahr = 0; // Übernahme als short zwecks "Berechnung"

		int max_tage_monat = 0; // Hilfsvariable zur besseren Lesbarkeit des Codes

		boolean flag = false; // Schaltjahr

		// Eingabe
		fehler = false; // Fehler, wenn DD, MM, YYYY keine Ziffern enthalten
		flag = false; // Schaltjahr

		System.out.println(
				"Bitte geben Sie Ihr Wunschdatum und -uhrzeit ein (in Schreibweise DD.MM.YYYY hh:mm, Jahre 1900 - 9999 zulaessig): ");
		Scanner scanner = new Scanner(System.in);
		String inputAllNew = scanner.nextLine();
		retBooleanString.setTotalString(inputAllNew);
		String inputAll = inputAllNew.substring(0, 10);
		if(inputAllNew.length() > 16) {
			return retBooleanString;
		}
		else {
		
			

		if (inputAll.length() == 10) {
			for (int i = 0; i < inputAll.length(); i++) // Prüfung, ob Einzelzeichen Ziffern sind, Ausnahme Punkte
														// (DD.MM.YYYY)
			{
				einzelzeichen = inputAll.charAt(i);
				if (i == 2 || i == 5) // bei erwarteten Punkten überspringen - Prüfung, ob an der Stelle Punkte sind,
										// weiter unten
					continue;
				if (einzelzeichen >= 48 && einzelzeichen <= 57)
					;
				else
					fehler = true;
			}

			// Verarbeitung // Ausgabe

			// Zerlegung
			if (fehler == false) {

				strp1 = inputAll.substring(2, 3); // caution! substring have to be written in another way to c++!
				strp2 = inputAll.substring(5, 6);

				if (strp1.equals(".") || strp2.equals(".")) // caution! equals! Prüfung, ob Punkte an der richtigen
															// Stelle sind
				{

					strtag = inputAll.substring(0, 2); // Zerlegung der TeilStrings aus DD.MM.YYYY
					strmonat = inputAll.substring(3, 5); // Zerlegung der TeilStrings aus DD.MM.YYYY
					strjahr = inputAll.substring(6, 10); // Zerlegung der TeilStrings aus DD.MM.YYYY

					if ( // Prüfung, ob im grundsätzlichen Datumsbereich (filtert auch Fehlinputn wie z.
							// B. Buchstaben heraus)

					(Integer.parseInt(strtag) >= 1 && Integer.parseInt(strtag) <= 31) && // Tag Zahlenrahmen (nicht
																							// monatsgenau!)
							(Integer.parseInt(strmonat) >= 1 && Integer.parseInt(strmonat) <= 12) && // Monat
																										// Zahlenrahmen
							(Integer.parseInt(strjahr) >= 1900 && Integer.parseInt(strjahr) <= 9999) // Jahr
																										// Zahlenrahmen

					)

					{
						System.out.println(Integer.parseInt(strtag));
						// da Prüfung oben keine Auffälligkeiten und keine Buchstaben (! - sonst Fehler
						// - hierdurch abgefangen!) =>
						tag = Integer.parseInt(inputAll.substring(0, 2)); // Umwandlung zur Zahl
						monat = Integer.parseInt(inputAll.substring(3, 5)); // Umwandlung zur Zahl
						jahr = Integer.parseInt(inputAll.substring(6, 10)); // Umwandlung zur Zahl

						int[][] tage_monat = { // 2-d Array (Feld) für bessere Übersicht in gewohnter Optik (Tag, Monat)
												// und variablen Code weiter unten
								{ 31, 1 }, // auch 1-d möglich, aber durch Monat dabei, ist eine einfache
											// switch-Verzweigung möglich
								{ 28, 2 }, { 31, 3 }, { 30, 4 }, { 31, 5 }, { 30, 6 }, { 31, 7 }, { 31, 8 }, { 30, 9 },
								{ 31, 10 }, { 30, 11 }, { 31, 12 } };

						switch (monat) // nur der Februar wird hier abgefangen - ursprünglich anders konzeptionell
										// gedacht, aber durch Anpassung Code
						{ // müssen die anderen Monate nicht einzeln abgefragt werden - daher wäre jetzt
							// eine if-Verzweigung wohl besser
						case 2:

							// Prüfung auf Schaltjahr // Reihenfolge wichtig, da ansonsten ggf.
							// unerwünschtes Ergebnis für z. B. Jahr 2000 (ist durch 4, durch 100 und durch
							// 400 teilbar)
							if (jahr % 4 == 0) // dadurch auch Schaltjahr, bei anderer Reihenfolge der if-Verzweigungen
												// u. U. sonst als kein Schaltjahr (falsch!) bewertet
								flag = true; // da auch durch 100 teilbar mit Rest 0
							if (jahr % 100 == 0)
								flag = false;
							if (jahr % 400 == 0)
								flag = true;
							if (flag)
								tage_monat[1][0] = 29; // wenn flag für Schaltjahr auf true gesetzt wurde, wird die
														// Anzahl für den Monat 2 (Februar) auf 29 gesetzt (auch +1
							break; // oder ++ möglich gewesen, aber so besser lesbar, dass auf 29 Tage geändert
									// wurde)
						default:
							flag = false;

						}

						max_tage_monat = tage_monat[monat - 1][0]; // universellerer Code durch Einbeziehung des Monats
																	// zum Aufruf aus dem Array

						if (tag <= max_tage_monat) { // Prüfung: stimmt die Tageszahl zum Monat?
							System.out.println("Glückwunsch! Sie haben es geschafft, ein gültiges Datum einzugeben => "
									+ tag + "." + monat + "." + jahr);
							validDate = true;
						} else {
							System.out.println("Datum ungültig - Tageszahl passt nicht.");
						}
					} else {
						System.out.println(
								"Datum ungültig - keine gültigen Datumszahlen - bitte Eingabe nochmals prüfen.");
					}

				} else {
					System.out.println("\nDatum ungültig - Trennpunkte nicht an erwarteter Stelle (DD.MM.YYYY).");
					System.out.println("\n\n");
				}

			} else {
				System.out.println("\n\nDatum ungültig - keine Zahlen an den erwarteten Stellen (DD.MM.YYYY).");
				System.out.println("\n\n");
			}
		} else {
			System.out.println(
					"\n\nDatum ungültig - nicht die richtige Länge (Soll 10 Zeichen Datum => + Uhrzeit!). Länge: " + inputAll.length());
			System.out.println("\n\n");
			return retBooleanString;
		}

		retBooleanString.setValidDate(validDate);
		retBooleanString.setRightString(inputAll);
		retBooleanString.setTotalString(inputAllNew);
		return retBooleanString;
		}
	}

	public static void CheckStringDateTime() {

		char nochmal = 'j'; // für wiederholte Eingabe
		Scanner scanner = new Scanner(System.in);
		Return currentReturn;
		boolean validDate = false;

		do {
			currentReturn = CheckDateTime.CheckDateFromStringDateTime();
			System.out.println("Datum ok: " + currentReturn.isValidDate() + "\t rechte Seite: " + currentReturn.getRightString());
			String totalString = currentReturn.getTotalString();
			if(totalString.length() > 16) {
				System.out.println("Zeit bitte nochmals eingeben - s. Vorgaben.");
			} else {
			CheckDateTime.CheckTimeFromStringDateTime(totalString);
			}
			System.out.println("\n\nNochmal (j/[n])? ");
			nochmal = scanner.nextLine().charAt(0);

		} while (nochmal == 'j' || nochmal == 'J');
	}
}
