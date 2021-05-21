package mitarbeiterVerwaltungGK;

import java.time.LocalDate;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String cName = null;

		Mitarbeiter[] hilfsarbeiter = { new Hilfsarbeiter(123, "Max Helfer", "02.05.2021", 2000.0), };

		for (int i = 0; i < hilfsarbeiter.length; i++) {
			String tmpString = "";
			cName = hilfsarbeiter[i].getClass().getSimpleName();
			if (cName.length() < 14) {
				tmpString = "\t";
			}
			System.out.println(cName + ": " + "\t" + tmpString + "Equals hilfsarbeiter[0] zu [" + i + "]: "
					+ hilfsarbeiter[i].equals(hilfsarbeiter[0]) + "\tNamen: " + hilfsarbeiter[i].getName() + "\t"
					+ hilfsarbeiter[i].getMonatsLohn() + " Euro \n");

		}

		cName = null;

		// int personalNr, String name, String datumEintritt, double monatsLohn, double fixGehalt, double provision, double umsatz
		IMitarbeiterUniversal[] verkaeufer = { new Verkaeufer(987, "Moritz Kaufmann", "02.05.1999", 0.0, 3000.0, 10.5, 21050.99), };

		for (int i = 0; i < verkaeufer.length; i++) {
			String tmpString = "";
			cName = verkaeufer[i].getClass().getSimpleName();
			if (cName.length() < 14) {
				tmpString = "\t";
			}
			System.out.println(cName + ": " + "\t" + tmpString + "Equals verkaeufer[0] zu [" + i + "]: "
					+ verkaeufer[i].equals(verkaeufer[0]) + "\tNamen: " + verkaeufer[i].getName() + "\t"
					+ verkaeufer[i].getMonatsLohn() + " Euro \n");

		}

	}

}
