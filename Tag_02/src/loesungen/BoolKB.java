package loesungen�sungen;

public class BoolKB {

	public static void main(String[] args) {
		boolean x = false, y = false;

		// �berschrift und schleife die 20 Gleichheitszeichen schreibt
		System.out.println("Logische Operatoren:");
		for (int i = 0; i < 20; i++) {
			System.out.print("=");
		}
		// Abstand zur Tabelle
		System.out.println();

		// �u�ere for-Schleife, die die �nderung der Variablen kontrolliert
		for (int i = 0; i < 4; i++) {
			// innere for-Schleife, die die String Ausgabe kontrolliert
			for (int j = 0; j < 3; j++) {
				// Variable zum Speichern der Ausgabe
				String booleanVariable = x + " && " + y + " liefert " + (x && y);

				if (j == 1) {
					booleanVariable = x + " || " + y + " liefert " + (x || y);
				} else if (j == 2) {
					booleanVariable = x + "  ^ " + y + " liefert " + (x ^ y);
				}
				System.out.println(booleanVariable);
			}
			//Ver�nderung der boolschen Werte
			System.out.println();
			if (i == 0) {
				y = true;
			} else if (i == 1) {
				x = true;
				y = false;
			} else if (i == 2) {
				y = true;
			}
		}
	}
}
