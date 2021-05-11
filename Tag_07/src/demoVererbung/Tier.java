package demoVererbung;

public class Tier {
	private String name;
	private String speed;
	private double length;
	
	public Tier(String name, String speed, double length) {
		this.name = name;
		this.setSpeed(speed);
		this.length = length;
	}

	public void move() {
		System.out.println(this.name + " bewegt sich mit " + this.getSpeed() + " km/h");
	}
	
	private void schwimmen() {
		
	}

	@Override
	public String toString() {
		return "Tier [name=" + name + ", speed=" + getSpeed() + ", length=" + length + "]";
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	
}
