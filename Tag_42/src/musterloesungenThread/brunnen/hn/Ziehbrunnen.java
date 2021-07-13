package musterloesungenThread.brunnen.hn;

public class Ziehbrunnen extends Thread{
	int wasserTrog = 0;
	static Thread pumpe;
	static Thread verteiler;
	int change;
	
	public Ziehbrunnen() {
		Schoepfer s1 = new Schoepfer(this);	
		s1.geraet = s1.getPumpe().geraet;
		pumpe = s1;
		Schoepfer s2 = new Schoepfer(this);
		s2.geraet = s2.getVerteiler().geraet;
		verteiler = s2;
		s2.setName("Verteiler");
		s1.setName("Pumpe");
		
		System.out.println("Wasserstand " + wasserTrog);
//		pumpe.start();
//		verteiler.start();
		/*
		try {
			verteiler.join();
			pumpe.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}
	
	public static void main(String[] args) {
		
		Ziehbrunnen zb = new Ziehbrunnen();
		pumpe.start();
		verteiler.start();
		try {
			verteiler.join();
			pumpe.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public synchronized int setWassertrog(int wasser) {
		if(Thread.currentThread().getName().equals("Pumpe")) {
			wasserTrog += wasser;
		} else {
			if(this.wasserTrog > wasser) {
				wasserTrog -= wasser;
			} else 
				 {
				
				try {
					System.out.println("Stop");
					if(Thread.currentThread().getName().equals("Verteiler")) {
						wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return wasserTrog;
	}
	public synchronized void goGetWater() {
		if(wasserTrog >= 20 && verteiler.getState() == State.WAITING) {
			System.out.println("Aufwachen");
			notifyAll();
		}
	}

}
