package musterloesungenThread.brunnen.kb;

public class Schoepfer extends Thread {

	public Schoepfer(String name) {
		super();
		super.setName(name);
	}

	@Override
	public void run() {
		while (true) {
			
			if (super.getName().equals("verteiler")) {

				int wassermenge = (int) (Math.random() * 21);
				if (Ziehbrunnen.getWassertrog() > wassermenge) {
					Ziehbrunnen.setWassertrog(Ziehbrunnen.getWassertrog() - wassermenge);
					System.out.println(wassermenge+ " Liter verteilt");
//					System.out.println(Ziehbrunnen.getWassertrog()+" Liter sind im Brunnen.\n");
				} else {
					try {
						System.out.println("Wollte "+wassermenge+" Liter holen, "+Ziehbrunnen.getWassertrog()+" Liter sind nur drin. Ich warte!");
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			} else {
				if (super.getName().equals("pumpe")) {

					int wassermenge = (int) (Math.random() * 11);
					Ziehbrunnen.setWassertrog(Ziehbrunnen.getWassertrog() + wassermenge);
					System.out.println(wassermenge+ " Liter reingepumt");
					System.out.println(Ziehbrunnen.getWassertrog()+" Liter sind im Brunnen.\n");
				}
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
