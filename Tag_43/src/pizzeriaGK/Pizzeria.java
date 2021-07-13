package pizzeriaGK;


public class Pizzeria {
	

private static Pizzaiolo pizzaiolo;
private static Kurier kurier;
	
	public static void main(String args[]) throws InterruptedException {
		PizzaSync ps = new PizzaSync();
		pizzaiolo = new Pizzaiolo(ps);
		kurier = new Kurier(ps);
		
		System.out.println("Start des Pizza-Kurier-Dienstes...");
		System.out.println("==========================================");
		System.out.println();
		
		pizzaiolo.start();
		kurier.start();

	}

	public static Pizzaiolo getPizzaiolo() {
		return pizzaiolo;
	}

	public static void setPizzaiolo(Pizzaiolo pizzaiolo) {
		Pizzeria.pizzaiolo = pizzaiolo;
	}

	public static Kurier getKurier() {
		return kurier;
	}

	public static void setKurier(Kurier kurier) {
		Pizzeria.kurier = kurier;
	}

}
