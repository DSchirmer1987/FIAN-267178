package musterloesungenThread.brunnen.dozent;

import java.util.Random;

public class Schoepfer extends Thread {
	private String type;
	private int mengeP, mengeV;
	private Ziehbrunnen brunnen;
	
	public Schoepfer(String type, Ziehbrunnen brunnen) {
		this.type = type;
		this.setName(type);
		this.brunnen = brunnen;
	}

	@Override
	public void run() {
		System.out.println(this.type + " has started to work!");
//		while(true) {
			if(this.type.equals("Verteiler")) {
				mengeV = this.schoepfen();
				if(Ziehbrunnen.checkWasserTrog(mengeV)) {
					System.out.println("Verteiler entnimmt " + mengeV + " Liter");
					Ziehbrunnen.setWassertrog(mengeV);
				}else {
					try {
						System.out.println("Verteiler wartet auf mehr Wasser");
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			} else {
				mengeP = this.schoepfen();
				System.out.println("Pumpe pumpt " + mengeP + " Liter");
				Ziehbrunnen.setWassertrog(mengeP);
				if(Ziehbrunnen.checkWasserTrog(mengeV)) {
					
				}
			}
//		}
	}
	
	public int schoepfen() {
		int tmp = new Random().nextInt(21);
//		System.out.println(type + " schoepft " + tmp +  " Liter");
		return tmp;
	}
	
	
}
