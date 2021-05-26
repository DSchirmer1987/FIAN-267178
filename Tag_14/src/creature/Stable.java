package creature;

public class Stable {
	private Stable next;
	
	public Stable(int apartments) {
		if(apartments > 1) {
			next = new Stable(apartments - 1);
		}
	}
	
	public void printStable() {
		PrintHelper.printLine();
		PrintHelper.printEmptyCell();
		PrintHelper.printLine();
		if(next != null) {
			next.printStable();
		}
	}
}
