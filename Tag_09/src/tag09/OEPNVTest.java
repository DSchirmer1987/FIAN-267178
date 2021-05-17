package tag09;

import oepnvKG.Bus;
import oepnvKG.S_Bahn;

public class OEPNVTest {

	public static void main(String[] args) {
		S_Bahn s1 = new S_Bahn(25, "Schmidt", "Betriebshof", "Bauernhof", "Peters", 4, 25);
		Bus b1 = new Bus(25, "Lutz", "Bauernhof","Stadmitte", 67);
		
		System.out.println(s1);
		System.out.println(b1);
		System.out.println(b1.equals(s1));

	}

}
