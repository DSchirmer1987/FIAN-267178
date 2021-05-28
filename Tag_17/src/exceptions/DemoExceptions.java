package exceptions;
/*
* Während der normalen Abarbeitung einer Methode kann zur Laufzeit ein
* abnormales Ereignis auftreten, das die normale Ausführung der Methode
* unterbricht.
* 
* Ein solches abnormales Ereignis ist eine Exception (Ausnahme).
* 
* Eine Exception kann beispielsweise ein arithmetischer Überlauf, ein Mangel an
* Speicherplatz, eine Verletzung der Array-Grenzen, etc. darstellen.
* 
* Eine Exception stellt damit ein LaufzeitEreignis dar, das zum Versagen einer
* Methode und damit zu einem Laufzeit-Fehler des Programms führen kann.
*/

public class DemoExceptions {

	public static void main(String[] args) {
		
		/*
		 * Try = Hier könnte eine Ausnahme auftreten
		 * catch = Zum behandeln der Ausnahme und verhindern des Programmabsturzes.
		 * Der Catch sollte immer so genau wie möglich sein.
		 */
		int[] array = new int[5];
		try {
			
			int zahl = Integer.parseInt("19%");
			
			for(int i = 0; i <= 10; i++) {
				System.out.println(array[i]);
			}
			
		} catch (NumberFormatException nfa) {
			System.out.println("Es ist ein Fehler bei dem Unwandeln aufgetreten");
		}catch (IllegalArgumentException iae) {
			System.out.println("Es ist ein Fehler mit den Argumenten aufgetreten!");
		}catch (Exception e) {
			System.out.println("Es ist ein Fehler aufgetreten!");
		}
		
		System.out.println("Programm lief durch!");
	}

}
