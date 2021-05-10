package enumAufgabe;

public class AufgabeEnumKB {
	
	/*

	#Aufgabe 'Enums - Hunderassen'
	- Btte definieren Sie eine Enum-Klasse 'Hunderasse' mit drei Konstanten
	        DACKEL, COLLIE und DOGGE. 
	- Jede Hunderasse soll eine readonly-Property 'maxGroesse' bekommen:
	        0.5 für DACKEL, 1.0 für COLLIE und 1.5 für DOGGE.   
	- Geben Sie alle statischen Konstanten der Klasse 'Hunderasse' aus. Die Ausgaben sollen folgendermaßen aussehen:
	        Dackel, max. Größe: 0.5
	        Collie, max. Größe: 1.0
	        Dogge, max. Größe: 1.5
	        
	 */

	public static void main(String[] args) {
		HunderasseKB dackel  =  HunderasseKB.Dackel;
		System.out.print(dackel+", max. Größe: "+dackel.getHight()+"\n");
		HunderasseKB collie = HunderasseKB.Collie;
		System.out.print(collie+", max. Größe: "+collie.getHight()+"\n");
		HunderasseKB dogge = HunderasseKB.Dogge;
		System.out.print(dogge+", max. Größe: "+dogge.getHight()+"\n");
		
	}

}
