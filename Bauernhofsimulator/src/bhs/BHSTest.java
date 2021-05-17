package bhs;

import bhs.fauna.ATier;
import bhs.fauna.Kuh;
import bhs.fauna.Lamm;

public class BHSTest {

	public static void main(String[] args) {
		Lamm l1 = new Lamm();
		Kuh k1 = new Kuh("Paula", "Blau", 300);
		ATier k2 = new Kuh("Lisa", "Grün", 500);
		k1.setName("Peter");
		
		System.out.println(k1);
		System.out.println(k2);
	}

}
