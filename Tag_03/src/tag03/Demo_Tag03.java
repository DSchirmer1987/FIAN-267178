package tag03;

public class Demo_Tag03 {
	
	public static void main(String[] args) {
		System.out.println(ausgabe());
		new Demo_Tag03().sageHallo();
		System.out.println(verdoppeln("Hallo"));
	}
	
	public static String ausgabe() {
		return "Hallo Welt";
	}
	
	public void sageHallo() {
		System.out.println("Hallo du da!");
		sageEtwas();
	}
	
	public static void sageEtwas() {
		System.out.println("Hallo");
	}
	
	//Methode mit Übergabe
	public static String verdoppeln(String text) {
		return text + text;
	}
}
