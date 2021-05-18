package vererbungII.FahrzeugrennenGK;

public class Fahrzeug {

	private double currentPositionKm;
	private double currentSpeedKph;
	private double maxSpeedKph;
	private int numberWheels;
	private String vehicleType;

	public Fahrzeug() {
		this(0.0, 0.0, 0.0, 0);
	}
	
	public Fahrzeug(double currentPositionKm, double currentSpeedKph, double maxSpeedKph, int numberWheels) {
		super();
		this.currentPositionKm = currentPositionKm;
		this.currentSpeedKph = currentSpeedKph;
		this.maxSpeedKph = maxSpeedKph;
		this.numberWheels = numberWheels;
	}

	public double getCurrentPositionKm() {
		return currentPositionKm;
	}

	public void setCurrentPositionKm(double currentPositionKm) {
		this.currentPositionKm = currentPositionKm;
	}

	public double getCurrentSpeedKph() {
		return currentSpeedKph;
	}

	public void setCurrentSpeedKph(double currentSpeedKph) {
		if(currentSpeedKph <= this.maxSpeedKph) {
		this.currentSpeedKph = currentSpeedKph;
		} else {
			this.currentSpeedKph = this.maxSpeedKph;
		}
	}

	public double getMaxSpeedKph() {
		return maxSpeedKph;
	}

	public void setMaxSpeedKph(double maxSpeedKph) {
		this.maxSpeedKph = maxSpeedKph;
	}

	public int getNumberWheels() {
		return numberWheels;
	}

	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	};

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public void move(double durationMinutes) {
		double tmpCurrentPositionKm = getCurrentPositionKm();
		double tmpCurrentSpeedKph = getCurrentSpeedKph();
		setCurrentPositionKm(tmpCurrentPositionKm + durationMinutes * tmpCurrentSpeedKph / 60);
	}

	@Override
	public String toString() {
		return "Fahrzeug [currentPositionKm=" + currentPositionKm + ", currentSpeedKph=" + currentSpeedKph
				+ ", maxSpeedKph=" + maxSpeedKph + ", numberWheels=" + numberWheels + ", vehicleType=" + vehicleType
				+ ", getCurrentPositionKm()=" + getCurrentPositionKm() + ", getCurrentSpeedKph()="
				+ getCurrentSpeedKph() + ", getMaxSpeedKph()=" + getMaxSpeedKph() + ", getNumberWheels()="
				+ getNumberWheels() + ", getVehicleType()=" + getVehicleType() + "]";
	}




}
