package musterloesungen.filesIIGK;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnalyseFileNMore {

	public static boolean checkUserInputValid(String input) {
		// check valid
		boolean valid = true;

		// check number of arguments
		int nArg = input.length() - input.replace(",", "").length() + 1;
		if (nArg != 2) {
			IO.Spacer1();
			System.out.println(
					"Anzahl der Parameter wurde auf " + nArg + " bestimmt. Erwartet wurden zwei (2) Parameter.");
			valid = false;
		}
		// check space behind separator
		boolean chSep = false;
		if (input.contains(", ")) {
			chSep = true;
			valid = false;
		}
		if (chSep) {
			IO.Spacer1();
			System.out.println(
					"Bitte geben Sie die Parameter zwar kommagetrennt ein, aber bitte ohne Leerzeichen nach dem Komma.");
		}

		// only if string is correct to this point (number arguments, comma without
		// space behind)
		if (valid) {
			// check left string is integer
			try {
				int n = Integer.parseInt(input.substring(0, input.indexOf(",")));
			} catch (NumberFormatException e) {
				IO.Spacer1();
				System.out.println("Bitte geben Sie eine Ganze Zahl ein.");
				valid = false;
			}
			// check right string file exists
			String rStr = input.substring(input.indexOf(",") + 1);
			File file = new File(rStr);
			if (!file.exists()) {
				IO.Spacer1();
				System.out.println(
						"Datei wurde nicht gefunden. Bitte geben Sie einen Pfad mit Dateinamen ein, der existiert.");
				valid = false;
			}

		}

		if (!valid) {
			for (int i = 0; i < 3; i++) {
				IO.Spacer1();
			}

			IO.Example();
			for (int i = 0; i < 3; i++) {
				IO.Spacer1();
			}
		}

		return valid;
	}

	public static void checkNumberCharsPerLine(String input) {
		int n = Integer.parseInt(input.substring(0, input.indexOf(",")));
		String rStr = input.substring(input.indexOf(",") + 1);
		File file = new File(rStr);
		int counter = 0;
			Scanner fs = null;
			try {
				fs = new Scanner(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			while (fs.hasNext()) {
				if(fs.nextLine().length() > n) {
					counter++;
				}
			
			}
		
			System.out.println("Die Datei " + file + " enthält " + counter + " Zeilen, die länger als " + n + " Zeichen sind.");
	}

}
