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
		Kuh k3 = new Kuh("Paula", "Violett", 250);
//		k1.setName("Peter");
		
		System.out.println(k1);
		System.out.println(k2);
		
		Tiger t1 = new Tiger();
		t1.fressen(t1);
		
		String s1 = k1.getName();
		String s2 = k3.getName();
		
		System.out.println(k1.equals(k3));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
	}

}
