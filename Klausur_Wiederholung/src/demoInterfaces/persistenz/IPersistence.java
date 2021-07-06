package demoInterfaces.persistenz;

import demoInterfaces.Word;

/**
 * 
 * Interfaces:
 * Beinhalten nur unimplementierte Methoden
 * Nur die Methoden Signatur
 *
 */
public interface IPersistence {
	/**
	 * Unimplementierte Methode
	 */
	void speichern(Word word);
	Word wortLaden();
	void aktualisieren(Word word, String neu);
	void loeschen(int wordID);
}
