package demoInterfaces.persistenz;

import demoInterfaces.Word;

public class DatabasePersistance implements IPersistence {

	@Override
	public void speichern(Word word) {
		System.out.println("Speichere in DB " + word);

	}

	@Override
	public Word wortLaden() {
		System.out.println("Lade Word aus DB");
		return new Word("Welt", 43);
	}

	@Override
	public void aktualisieren(Word word, String neu) {
		System.out.println("Aktualisiere Word in DB");

	}

	@Override
	public void loeschen(int wordID) {
		System.out.println("Lösche Word aus DB");

	}

}
