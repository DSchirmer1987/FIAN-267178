package cafeteriaHN;

public class CafeteriaApp {

	public static void main(String[] args) {
		
		
		Thread automat1 = new KaffeeAutomat(1, 900);
		Thread automat2 = new KaffeeAutomat(2, 1100);
		Thread automat3 = new KaffeeAutomat(3, 1050);
		Thread automat4 = new KaffeeAutomat(4, 500);
		Thread automat5 = new KaffeeAutomat(5, 1000);
		
		automat1.start();
		automat2.start();
		automat3.start();
		automat4.start();
		automat5.start();
		
	}

}
