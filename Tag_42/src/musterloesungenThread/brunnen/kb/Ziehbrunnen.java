package musterloesungenThread.brunnen.kb;

public class Ziehbrunnen {

	private static int wassertrog=50;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		Schoepfer pumpe = new Schoepfer("pumpe");
		Schoepfer verteiler = new Schoepfer("verteiler");
		
		
		verteiler.start();
		pumpe.start();
		verteiler.join();
		pumpe.join();
		
	}

	public static int getWassertrog() {
		return wassertrog;
	}

	public synchronized static void setWassertrog(int wassertrog) {
		Ziehbrunnen.wassertrog = wassertrog;
	}

}
