package oopDemo;

public class VarArgsDemo {
	// Normale Methode mit festgelegter Anzahl von Argumenten
	public void verketten(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	// Methode mit Var Args - unbestimmte Anzahl von Argumenten
	// VarArgs sind Arrays und werden dann als Arrays verwendet.
	public void methodVarArgs(String... strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}
	
	// 1. Regel : Var Args müssen als letztes Argument stehen.
	public void methodVarArgsSecond(String a, int b, String... strings) {
		
	}
	
	// 2. Regel: Es darf nur 1 Var-Args vorhanden sein.
	public void methodVarArgsThird(String... strings) {
		
	}
	
	// 3. Regel VarArgs sind immer mit den Datentyp + ... anzugeben
	public void testMethod(String[] strings) {
		
	}
}
