package uebungBank;


public class App {

	public static void main(String[] args) {
		double[] konten = new double[] {1000, 1500, 2000};
		SimpleBank sb = new SimpleBank(konten);
		System.out.println("Vor Angestellte");
		System.out.println(sb);
		
		Thread a1 = new Angestellter(sb, 0, 1, 500);
		Thread a2 = new Angestellter(sb, 1, 2, 500);
		Thread a3 = new Angestellter(sb, 2, 0, 500);
		a1.start();
		a2.start();
		a3.start();
		
	}

}
