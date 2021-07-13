package musterloesungenThread.brunnen.dozent;

import java.lang.Thread.State;

public class Ziehbrunnen{
	private static int wassertrog = 0;
	private static Schoepfer verteiler, pumpe;
	private static Thread mt;
	
	public static void main(String[] args) {
		mt = Thread.currentThread();
		Ziehbrunnen brunnen = new Ziehbrunnen();
		verteiler = new Schoepfer("Verteiler", brunnen);
		pumpe = new Schoepfer("Pumpe", brunnen);
		pumpe.start();
		verteiler.start();
		while(true) {
			try {
				pumpe.sleep(1000);
				verteiler.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized static boolean checkWasserTrog(int menge) {
		if(wassertrog > menge) {
			synchronized (mt) {
				verteiler.notify();
			}
			return true;
		} else {
			return false;
		}
	}
	
	public synchronized static void setWassertrog(int menge) {
		wassertrog += menge;
	}
}
