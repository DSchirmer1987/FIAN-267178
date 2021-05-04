package tag02;

public class DemoStrings {

	public static void main(String[] args) {
		String text = "Gibt einen String zurück, in dem alle Vorkommnisse des Zeichens bzw. der Zeichenkette alt durch die Zeichenkette neu ersetzt wurden.";
		String text2 = "Gibt einen String zurück, in dem alle Vorkommnisse des Zeichens bzw. der Zeichenkette alt durch die Zeichenkette neu ersetzt wurden.";

		System.out.println(text);
		// replace erzeugt ein neues String-Objekt und weist es der Variable zu.
//		text = text.replace("i", "iii");
		System.out.println(text);
		
		System.out.println(text == text2);
		System.out.println(text.equals(text2));
		
		// Compare gibt den lexigografischen Abstand
		System.out.println("Anna".compareTo("Bertha"));
		System.out.println("Bertha".compareTo("Anna"));
		System.out.println("Anna".compareTo("Xavier"));
		System.out.println("Anna".compareToIgnoreCase("xavier"));
		System.out.println('x' - 'a');
	}

}
