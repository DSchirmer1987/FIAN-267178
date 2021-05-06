package initDemo;

public class InitDemo {

	public static void main(String[] args) {
		Init i1 = new Init();
		Init i2 = new Init("Peter", 35);
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(Init.anzahl);
		
		System.out.println((short) 'a');
		
		String text = "Hallo";
		int a = text.length();
		char buchstabe = text.charAt(0);
	}

}
