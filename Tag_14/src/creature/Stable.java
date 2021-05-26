package creature;

public class Stable {
	private Stable next;
	
	public Stable(int apartments) {
		if(apartments > 1) {
			next = new Stable(apartments - 1);
		}
	}
}
