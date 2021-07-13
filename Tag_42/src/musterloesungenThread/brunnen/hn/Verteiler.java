package musterloesungenThread.brunnen.hn;

public class Verteiler {
	private int removedWater;
	String geraet = "verteiler";
	
	public Verteiler() {
		
	}
	
	public int takeWater() {
		int tmp = 0;
		tmp = (int) (Math.random() * 30);
		removedWater = tmp;
		return tmp;
		
	}
	
	synchronized void stop() {
		
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	

	public int getRemovedWater() {
		return removedWater;
	}

	public void setRemovedWater(int removedWater) {
		this.removedWater = removedWater;
	}
	

}
