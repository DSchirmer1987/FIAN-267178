package pizzeriaHN;


public class Kurier extends Thread {
	
	private PizzaSync ps;
	public Kurier(PizzaSync ps) {
		this.ps = ps;
	}

	@Override
	public void run() {
		
		while (true) {
			
			try {
				int zeit = 10000;
				System.out.println("Pizza " + ps.getPizza() + " wird ausgeliefert. (" + (zeit/1000) + " Sekunden)\n");
		
				Thread.sleep(zeit);
				
				ps.pizzaGeliefert();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	
	
	
}
