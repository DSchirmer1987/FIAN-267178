package demoInterfaces.persistenz;

import demoInterfaces.Word;

/**
 * 
 * Konkrete Klassen beeinhalten nur voll-implementierte Methoden
 * Methoden mit Kopf und Rumpf
 *
 */
public class OnlinePersistence extends PersistanceAdapter {

	@Override
	public Word wortLaden() {
		System.out.println("Lade Word aus dem Internet");
		return new Word("Wikipedia", 443);
	}
	
	/**
	 * Voll-Implementierte Methode
	 * Methoden-Kopf + MethodenRumpf
	 */
	public void sageEtwas() {}

}
