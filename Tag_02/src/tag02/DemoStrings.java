package tag02;

public class DemoStrings {

	public static void main(String[] args) {
		String text = "Gibt einen String zurück, in dem alle Vorkommnisse des Zeichens bzw. der Zeichenkette alt durch die Zeichenkette neu ersetzt wurden.";
		
		System.out.println(text);
		// replace erzeugt ein neues String-Objekt und weist es der Variable zu.
		text = text.replace("i", "iii");
		System.out.println(text);

	}

}
