package demoInterfaces.persistenz;

import demoInterfaces.Word;

public class DateiPersistence implements IPersistence {

	@Override
	public void speichern(Word word) {
		System.out.println("Speichere in Datei " + word);

	}

	@Override
	public Word wortLaden() {
		System.out.println("Lade Word aus Datei");
		return new Word("Welt", 43);
	}

	@Override
	public void aktualisieren(Word word, String neu) {
		System.out.println("Aktualisiere Word in Datei");

	}

	@Override
	public void loeschen(int wordID) {
		System.out.println("Lösche Word aus Datei");

	}

}
