package gcDemo;

public class GCDemo {

	public static void main(String[] args) {
		String s1 = "Hallo";
		String s2 = new String("Hallo");
		String s3 = s2;
		String s4 = new String("Welt");
		
		
//		Wie viele Objekte wurden erzeugt?  -  3
		System.out.println(s1 == s2);
		
		s2 = null;
		s3 = null;
		
		// Wie viele Objekte wären für die GC löschbar? - 1

	}

}
