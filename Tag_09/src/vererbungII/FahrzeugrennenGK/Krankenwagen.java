package vererbungII.FahrzeugrennenGK;

public class Krankenwagen extends Auto {

	private boolean beaconOn;

	public Krankenwagen() {
		this(false, 0.0, 0.0, 140.0, 4);
	}

	public Krankenwagen(boolean beaconOn, double currentPositionKm, double currentSpeedKph, double maxSpeedKph,
			int numberWheels) {
		super(currentPositionKm, currentSpeedKph, maxSpeedKph, numberWheels);

	}

	public void beaconOn() {
		beaconOn = true;

	}

	public void beaconOff() {
		beaconOn = false;
	}

	public boolean getBeaconOn() {
		return beaconOn;
	}

	public void setBeaconOn(boolean beaconOn) {
		this.beaconOn = beaconOn;
	}

	@Override
	public String toString() {
		return "Krankenwagen [beaconOn=" + beaconOn + ", getBeaconOn()=" + getBeaconOn() + ", getCurrentPositionKm()="
				+ getCurrentPositionKm() + ", getCurrentSpeedKph()=" + getCurrentSpeedKph() + ", getMaxSpeedKph()="
				+ getMaxSpeedKph() + ", getNumberWheels()=" + getNumberWheels() + ", getVehicleType()="
				+ getVehicleType() + "]";
	}


}
