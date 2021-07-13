package pizzeriaHN;


public class PizzaSync {
	private int pizzaNr;
	Thread kurier = new Kurier(this);
	Thread pizzaiolo = new Pizzaiolo(this);
	
	public PizzaSync() {
		try {
			kurier.join();
			pizzaiolo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pizzaiolo.start();
		
		
	}
	
	/*
	 * Wird vom Pizzaiolo verwendet, um eine Pizza zur Auslieferung zu übergeben;
	 * blockiert, wenn der Kurier beschäftigt ist
	 */
	public synchronized void lieferePizza(int pizza) throws InterruptedException {
		
		System.out.println("Pizza " + pizza + " wird an Kurier �bergeben\n");
		if(kurier.getState() == Thread.State.NEW)
			kurier.start();
		if(kurier.getState() == Thread.State.WAITING)
			notifyAll();
		
		
		wait();
	}

	/*
	 * Wird vom Kurier verwendet, um eine Pizza zur Auslieferung abzuholen;
	 * blockiert, wenn keine Pizza bereit
	 */
	public synchronized int getPizza() {
		return pizzaNr;
		
	}

	/* Wird vom Kurier verwendet, wenn er eine Pizza ausgeliefert hat */
	public synchronized void pizzaGeliefert() {
		System.out.println("Pizza " + pizzaNr + " wurde ausgeliefert.");
		System.out.println("======== Bestellung abgeschlossen ========\n");
//		System.out.println("Kurier " + kurier.getState());
//		System.out.println("Pizzaiolo " + pizzaiolo.getState());
		
		try {
			
			notifyAll();
			wait();
			
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getPizzaNr() {
		return pizzaNr;
	}

	public void setPizzaNr(int pizzaNr) {
		this.pizzaNr = pizzaNr;
	}
	
}
