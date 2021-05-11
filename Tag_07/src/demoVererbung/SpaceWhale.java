package demoVererbung;

public class SpaceWhale extends Tier{
	
	public SpaceWhale() {
		super("Paul", "200", 32.5);
	}
	
	public void schwimmen() {
		
	}
	
	public void raumKruemmen() {
		System.out.println("SpaceWhale bewegt sich mit " + super.getSpeed() + " parsecs / sekunde!");
	}

	@Override
	public String toString() {
		return "SpaceWhale [" + super.toString() + "]";
	}
	
	
	
}
