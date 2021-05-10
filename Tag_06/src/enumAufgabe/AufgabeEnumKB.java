package enumAufgabe;

public class AufgabeEnumKB {
	
	/*

	#Aufgabe 'Enums - Hunderassen'
	- Btte definieren Sie eine Enum-Klasse 'Hunderasse' mit drei Konstanten
	        DACKEL, COLLIE und DOGGE. 
	- Jede Hunderasse soll eine readonly-Property 'maxGroesse' bekommen:
	        0.5 f�r DACKEL, 1.0 f�r COLLIE und 1.5 f�r DOGGE.   
	- Geben Sie alle statischen Konstanten der Klasse 'Hunderasse' aus. Die Ausgaben sollen folgenderma�en aussehen:
	        Dackel, max. Gr��e: 0.5
	        Collie, max. Gr��e: 1.0
	        Dogge, max. Gr��e: 1.5
	        
	 */

	public static void main(String[] args) {
		HunderasseKB dackel  =  HunderasseKB.Dackel;
		System.out.print(dackel+", max. Gr��e: "+dackel.getHight()+"\n");
		HunderasseKB collie = HunderasseKB.Collie;
		System.out.print(collie+", max. Gr��e: "+collie.getHight()+"\n");
		HunderasseKB dogge = HunderasseKB.Dogge;
		System.out.print(dogge+", max. Gr��e: "+dogge.getHight()+"\n");
		
	}

}
