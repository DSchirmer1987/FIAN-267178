package pizzeriaGK;

public class Kurier extends Thread {
	private PizzaSync ps;
	private int n;

	public Kurier(PizzaSync ps) {
		this.ps = ps;
	}

	public void run() {

		while (true) {

			while(!PizzaSync.isErstePizzaBestellungErfolgt()) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			n = ps.getPizza();

			ps.setKurierLiefertAus(true);
			
			System.out.println("Pizza " + n + " wird ausgeliefert");
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			synchronized (Pizzeria.getKurier()) {
				System.err.println("Kurier liefert gerade aus\t\t\t\tKurier-Thread wieder aktiv geschaltet...");
				PizzaSync.setKurierLiefertAus(false);
				Pizzeria.getKurier().notifyAll();
			}

			ps.pizzaGeliefert(n);
			System.out.println("Pizza " + n + " wurde ausgeliefert");
			System.out.println("=====================================");

		}
	}
}
