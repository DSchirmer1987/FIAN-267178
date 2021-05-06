package lösungen.buch;

public class Buchtest {

	public static void main(String[] args) {
		Buch b1 = new Buch("ES", "Stephen King", "Heyne", (short) 1214);
		Buch b2 = new Buch("Krabat", "Otfried Preußler", "Thienemann", (short) 256);
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
