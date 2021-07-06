package demoInterfaces;

import demoInterfaces.persistenz.DatabasePersistance;
import demoInterfaces.persistenz.DateiPersistence;
import demoInterfaces.persistenz.OnlinePersistence;

public class App {

	public static void main(String[] args) {
		WordController wc = new WordController();
		wc.setPersistenz(new OnlinePersistence());
		
		wc.onSaveClick();
		wc.onLoadClick();
		
		wc.setPersistenz(new DateiPersistence());
		
		wc.onSaveClick();
		wc.onLoadClick();
		
		wc.setPersistenz(new DatabasePersistance());
		
		wc.onSaveClick();
		wc.onLoadClick();

	}

}
