package musterloesungen.woerterbuchGK;

public class Main {

	public static void main(String[] args) {
		
		DictionaryEntry dict = new DictionaryEntry();
		
		/*
		// only for test purposes with user input
		dict.addEntryWithoutArgs();
		System.out.println(dict);
		*/
		
		for(int i = 0; i < 10; i++) {
			dict.addEntryWithArgs("Vokabel " + (i + 1), "Vocabulary (x2 =) " + ((i + 1)*2));
		}
		
		// output via toString
		System.out.println("Ausgabe via toString-Methode...");
		System.out.println("===================================================");
		System.out.println(dict);
		
		
		System.out.println();
		dict.translateGermanEnglish();
		/*
		System.out.println();
		dict.translateEnglishGerman();
		 */
		
		dict.outputDictionary();
		
		dict.orderByGermanVocabulary();
		
		dict.orderByEnglishVocabulary();
	}

}
