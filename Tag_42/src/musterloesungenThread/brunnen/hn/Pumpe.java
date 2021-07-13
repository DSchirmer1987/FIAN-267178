package musterloesungenThread.brunnen.hn;

public class Pumpe {
	
	String geraet = "pumpe";
	

	public Pumpe() {
	
	}
	public int addWater() {
		int tmp = 0;
		tmp = (int) (Math.random() * 20);
		
		return tmp;
		
	}
	synchronized void goOn() {
		
		notifyAll();
}

	
	
	
}
