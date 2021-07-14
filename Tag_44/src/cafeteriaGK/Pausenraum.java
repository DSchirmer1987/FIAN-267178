package cafeteriaGK;

public class Pausenraum {

	private final static int NUMBERCOFFEEAUTOMAT = 5;
	private static Kaffeeautomat[] coffeeAutomat = new Kaffeeautomat[NUMBERCOFFEEAUTOMAT];
	
	public static void main(String[] args) {
		
		/**
		 * initialize coffeeAutomats in an array of Threads/Kaffeeautomat
		 * and starts them
		 */
		for(int i = 0; i < coffeeAutomat.length; i++) {
			coffeeAutomat[i] = new Kaffeeautomat("KA_" + (i + 1));
			coffeeAutomat[i].start();
		}
		
		
				

	}

}
