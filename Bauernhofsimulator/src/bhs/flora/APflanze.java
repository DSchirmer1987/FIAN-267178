package bhs.flora;

import bhs.IFressbar;

public abstract class APflanze implements IFressbar{
	private boolean ortsgebunden;
    private String bluetenfarbe;
    private String fortpflanzungsorgane;
    
    public APflanze() {
    	this(true, "Gelb", "Vorhanden");
    }
    
	public APflanze(boolean ortsgebunden, String bluetenfarbe, String fortpflanzungsorgane) {
		super();
		this.ortsgebunden = ortsgebunden;
		this.bluetenfarbe = bluetenfarbe;
		this.fortpflanzungsorgane = fortpflanzungsorgane;
	}

	public boolean isOrtsgebunden() {
		return ortsgebunden;
	}

	public void setOrtsgebunden(boolean ortsgebunden) {
		this.ortsgebunden = ortsgebunden;
	}

	public String getBluetenfarbe() {
		return bluetenfarbe;
	}

	public void setBluetenfarbe(String bluetenfarbe) {
		this.bluetenfarbe = bluetenfarbe;
	}

	public String getFortpflanzungsorgane() {
		return fortpflanzungsorgane;
	}

	public void setFortpflanzungsorgane(String fortpflanzungsorgane) {
		this.fortpflanzungsorgane = fortpflanzungsorgane;
	}

	@Override
	public String toString() {
		return "APflanze [ortsgebunden=" + ortsgebunden + ", bluetenfarbe=" + bluetenfarbe + ", fortpflanzungsorgane="
				+ fortpflanzungsorgane + "]";
	}
}
