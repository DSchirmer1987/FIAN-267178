package pizzeriaGK;

public class PizzaSync {

	private static int n;
	private static boolean kurierLiefertAus = false;
	private static boolean erstePizzaBestellungErfolgt = false;
	private static boolean pizzaioloBereitetPizzaZu = true;


	/*
	 * Wird vom Pizzaiolo verwendet, um eine Pizza zur Auslieferung zu übergeben;
	 * blockiert, wenn der Kurier beschäftigt ist
	 */
	public synchronized void lieferePizza(int pizza) throws InterruptedException {
		n = pizza;
		erstePizzaBestellungErfolgt = true;
		synchronized (Pizzeria.getKurier()) {
			while (isKurierLiefertAus()) {
				System.err.println("Piazzaiolo wartet auf Auslieferung des Kuriers\t\tKurier-Thread pausiert...");
				Pizzeria.getKurier().wait();
			}

		}

		System.out.println("Piazzaiolo -> lieferePizza() Nr.: " + n);
	}

	/*
	 * Wird vom Kurier verwendet, um eine Pizza zur Auslieferung abzuholen;
	 * blockiert, wenn keine Pizza bereit
	 */
	public synchronized int getPizza() {
		synchronized (Pizzeria.getPizzaiolo()) {
			while (isPizzaioloBereitetPizzaZu()) {
				System.err.println("Pizza Nr. " + n + " zur Abholung bereit (Kurier wartet)\t\t\tPizzaiolo-Thread pausiert...");
				try {
					Pizzeria.getPizzaiolo().wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("getPizza: " + n);

		return n;
	}

	/* Wird vom Kurier verwendet, wenn er eine Pizza ausgeliefert hat */
	public synchronized void pizzaGeliefert(int pizza) {

		System.out.println("pizzaGeliefert: " + pizza);
	}

	public static int getN() {
		return n;
	}

	public static void setN(int n) {
		PizzaSync.n = n;
	}

	public static boolean isKurierLiefertAus() {
		return kurierLiefertAus;
	}

	public static void setKurierLiefertAus(boolean kurierLiefertAus) {
		PizzaSync.kurierLiefertAus = kurierLiefertAus;
	}

	public static boolean isPizzaioloBereitetPizzaZu() {
		return pizzaioloBereitetPizzaZu;
	}

	public static void setPizzaioloBereitetPizzaZu(boolean pizzaioloBereitetPizzaZu) {
		PizzaSync.pizzaioloBereitetPizzaZu = pizzaioloBereitetPizzaZu;
	}

	public static boolean isErstePizzaBestellungErfolgt() {
		return erstePizzaBestellungErfolgt;
	}

	public static void setErstePizzaBestellungErfolgt(boolean erstePizzaBestellungErfolgt) {
		PizzaSync.erstePizzaBestellungErfolgt = erstePizzaBestellungErfolgt;
	}

}
