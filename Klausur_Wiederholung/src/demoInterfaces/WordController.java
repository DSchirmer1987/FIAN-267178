package demoInterfaces;

import demoInterfaces.persistenz.IPersistence;

public class WordController {
	
	private IPersistence persistenz;
	
	public WordController() {
		Word wort = new Word("Hallo", 42);
	}
	
	public void setPersistenz(IPersistence persistenz) {
		this.persistenz = persistenz;
	}

	public void onSaveClick() {
		persistenz.speichern(new Word("Java", 55));
	}
	
	public void onLoadClick() {
		persistenz.wortLaden();
	}
}
