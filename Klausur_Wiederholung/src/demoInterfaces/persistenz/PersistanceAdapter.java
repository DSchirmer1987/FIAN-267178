package demoInterfaces.persistenz;

import demoInterfaces.Word;

/**
 * 
 * Abstrakte Klassen beinhalten volle Methoden und unimplementierte Methoden
 * 
 */
public abstract class PersistanceAdapter implements IPersistence{
	
	public abstract void sageEtwas();

	@Override
	public void speichern(Word word) {
		System.out.println("Keine Funktion hinterlegt");
	}

	@Override
	public Word wortLaden() {
		return null;
	}

	@Override
	public void aktualisieren(Word word, String neu) {

	}

	@Override
	public void loeschen(int wordID) {

	}
	
}
