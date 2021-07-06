package demoMethoden;

import java.util.Date;

public class DemoMethods {
	
	/**
	 * static - Gilt für alle Objekte einer Klasse
	 * non-static - Gilt nur für EIN Objekt einer Klasse
	 */

	public static void main(String[] args) {
		/**
		 * Statische Methoden werden mit Klassenname.Methodenname aufgerufen
		 * 
		 * Statische Methoden werden verwendet, 
		 * wenn diese nicht unbedingt zu einem einzelnen Objekt zugewiesen werden können oder
		 * für die Klasse allgemein geltend ist.
		 * z.b. Methode schreibeFlaechenberechnungsformel() in der Klasse "Rechteck"
		 * 
		 */
//		System.out.printf("Betrag ist: %.2f ", 1.95443);
		System.out.println(String.format("Betrag ist: %.2f", 1.95443));
		DemoMethods.methodOPar();
		DemoMethods.methodMPar("Daniel");
		DemoMethods.methodMPar("Daniel", new Date());
		DemoMethods.methodMPar("Daniel", "Kay", "Guido", "Maren", "Peter");
		
		/**
		 * Non-Static Methoden:
		 * 
		 * Non-Static Methoden werden immer dann verwendet, wenn diese zu einem bestimmten
		 * Object einer Klasse zugewiesen werden kann, diese also nur für ein Objekt gilt.
		 * z.b. berechneFlaeche() in der Klasse "Rechteck"
		 * 
		 * Methoden mit Rückgabewert, sollte zu einer Variablen zugewiesen werden, 
		 * damit man mit dem zurückgelieferten Wert weiterarbeiten kann.
		 */
		int jahr = DemoMethods.berechneJahr();
		System.out.println(jahr);
		
		
		/**
		 * Nicht statische Methoden werden mit Instanzname.Methodname aufgerufen.
		 */
//		DemoMethods.nonStaticMethodOPar() - Nicht möglich, da non-static.
		DemoMethods dm = new DemoMethods();
		dm.nonStaticMethodOPar();

	}
	
	/**
	 * Methode ohne Parameter 
	 * Methodenname: methodOPar 
	 * Parameter: in den runden Klammern hinter Methodennamen
	 * 
	 * Methode ohne Rückgabewert: void Rückgabewert(typ) steht vor Methodenname
	 * void: - kein Rückgabewert
	 * 
	 * static - Static bedeuted, dass diese Methode ohne das 
	 * vorherige erstellen einer Instanz aufrufbar ist.
	 * 
	 */
	public static void methodOPar() {
		System.out.println("Hallo Welt");
	}
	
	/**
	 * Methode ohne Rückgabewert: void Rückgabewert(typ) steht vor Methodenname
	 * void: - kein Rückgabewert
	 * 
	 * Methode mit Parameter 
	 * Methodenname: methodMPar 
	 * Parameter: in den runden Klammern hinter Methodennamen
	 * 
	 * @param name
	 *            - Parameter vom Typ String mit dem Namen name
	 * 
	 */
	public static void methodMPar(String name) {
		System.out.println("Hallo " + name);
	}
	
	/**
	 * Methodenüberladung:
	 * Methoden können überladen werden.
	 * Methoden gelten als überladen, wenn deren Name gleich ist, 
	 * diese sich jedoch in Anzahl, Reihenfolge oder Art der Parameter unterscheiden
	 * 
	 * Der Compiler wählt die richtige Methode anhand der Parameter die mitgegeben wurden aus.
	 * 
	 * @param name
	 * 				- Parameter vom Typ String mit dem Namen name
	 * @param date
	 * 				- Parameter vom Typ Date mit dem Namen date
	 */
	public static void methodMPar(String name, Date date) {
		System.out.println("Hallo " + name + " Datum: " + date);
	}
	
	/**
	 * Methode mit Var Args (variable arguments) - Variable Parameter
	 * VarArgs sind nicht in der Anzahl der Argumente beschränkt.
	 * VarArgs werden mit Datentyp + ... gekennzeichnet z.B. String...
	 * VarArgs verhalten sich dann wie ein Array das übergeben wurde.
	 * Ein VarArg MUSS immer der letzte Parameter sein.
	 * 
	 * Durch die VarArgs kann man wie durch ein normales Array itieren.
	 * 
	 * 
	 * @param name
	 * 				- Parameter vom Typ String mit dem Namen name
	 * @param names
	 */
	public static void methodMPar(String name, String...names) {
		System.out.println("Hallo " + name);
		for (String string : names) {
			System.out.println("Hallo " + string);
		}
	}
	
	/**
	 * Methode mit Rückgabewert 
	 * Rückgabewert steht vor Methodenname 
	 * Rückgabewert ist mit return gekoppelt 
	 * 
	 * return steht in der letzten Zeile 
	 * return wird gefolgt von dem Wert, welches zurückgeliefert wird.
	 * 
	 */
	public static int berechneJahr() {
		System.out.println("Ich berechne ein Jahr!");
		return 42;
	}
	
	/**
	 * Nicht statische Methode.
	 * 
	 * Im Gegensatz zu statischen (static) Methoden 
	 * muss für diese Methoden eine Instanz erzeugt werden!
	 * 
	 */
	public void nonStaticMethodOPar() {
		System.out.println("Nicht statisches Hallo Welt!");
	}

}
