package abstractDemo;

import abstractDemo.KFZ.AKraftfahrzeug;
import abstractDemo.KFZ.PKW;

public class AbstractTest {

	public static void main(String[] args) {
		PKW pkw1 = new PKW("BMW", 4, "Grau");
		AKraftfahrzeug AKF = new PKW("VW", 4, "Blau");
		
		// Nicht möglich, da abstract
//		AKraftfahrzeug AKF2 = new AKraftfahrzeug();

	}

}
