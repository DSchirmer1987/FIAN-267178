package bhs.fauna.carnivoren;

import bhs.fauna.ATier;

public class Tiger extends ATier {
	
	public Tiger() {
		this("Shir Khan", "gestreift", 280.0);
	}

	public Tiger(String name, String farbe, double gewicht) {
		super(name, farbe, gewicht);
	}

	@Override
	public void machGeraeusch() {

	}

	@Override
	public void wirdGefressen() {
		// TODO Auto-generated method stub
		
	}

}
