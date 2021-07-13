package musterloesungenThread.brunnen.hn;

public class Schoepfer extends Thread{
	private Verteiler verteiler;
	private Pumpe pumpe;
	private Ziehbrunnen zb;
	String geraet;
	boolean working;
	
	public Schoepfer(Ziehbrunnen zb) {
		this.zb = zb;
		this.verteiler = new Verteiler();
		this.pumpe = new Pumpe();
		
		
	}
//	public Schoepfer(Verteiler verteiler, Pumpe pumpe) {
//		this.verteiler = verteiler;
//		this.pumpe = pumpe;
//	}
	
	@Override
	public void run() {
		working = true;
		
	
		
		while (working) {
			
			if (geraet.equalsIgnoreCase("verteiler")) {
				
				int tmp = verteiler.takeWater();
				zb.setWassertrog(tmp);
				int z = zb.setWassertrog(tmp);
				
				System.out.println("entnommenes Wasser " + tmp + " - " + z);
					}
				
				
					
			
				if (geraet.equalsIgnoreCase("pumpe")) {
					int tmp = pumpe.addWater();
//					zb.wasserTrog += tmp;
					int p = zb.setWassertrog(tmp);
					zb.goGetWater();
					System.out.println("zugepumptes Wasser " + tmp + " - " + p);
				} 
//			check();
				
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	
	public synchronized void check() {
		if (geraet.equalsIgnoreCase("verteiler")) {
			
			int tmp = verteiler.takeWater();
			int z = zb.setWassertrog(tmp);
			System.out.println("entnommenes Wasser " + tmp + " - " + z);
				}
			
			
				
		
			if (geraet.equalsIgnoreCase("pumpe")) {
				int tmp = pumpe.addWater();
//				zb.wasserTrog += tmp;
				int p = zb.setWassertrog(tmp);
				zb.goGetWater();
				System.out.println("zugepumptes Wasser " + tmp + " - " + p);
			} 
	}
	public Verteiler getVerteiler() {
		return verteiler;
	}

	public void setVerteiler(Verteiler verteiler) {
		this.verteiler = verteiler;
	}
	public Pumpe getPumpe() {
		return pumpe;
	}
	public void setPumpe(Pumpe pumpe) {
		this.pumpe = pumpe;
	}
	@Override
	public synchronized String toString() {
		return "Wasserstand " + zb.wasserTrog;
	}

	
}
