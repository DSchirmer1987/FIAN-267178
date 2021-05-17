package bhs;

import bhs.fauna.ATier;
import bhs.fauna.carnivoren.Tiger;
import bhs.fauna.herbivoren.Kuh;
import bhs.fauna.herbivoren.Lamm;

public class BHSTest {

	public static void main(String[] args) {
		Lamm l1 = new Lamm();
		Kuh k1 = new Kuh("Paula", "Blau", 300);
		ATier k2 = new Kuh("Lisa", "Grün", 500);
		k1.setName("Peter");
		
		System.out.println(k1);
		System.out.println(k2);
		
		Tiger t1 = new Tiger();
		t1.fressen(t1);
	}

}
