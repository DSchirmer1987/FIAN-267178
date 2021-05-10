package demoList;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {
		ArrayList<Integer> zahlenListe = new ArrayList<>();
		
		for(int i = 0; i<101;i++) {
			zahlenListe.add(i);
		}
		
		System.out.println(zahlenListe);
		
		// Referenziert - Mögliche Fehlerquelle
		List<Integer> zl2 = zahlenListe.subList(10, 31);
		// Neues Objekt erstellt
		ArrayList<Integer> zL2 = new ArrayList<>(zahlenListe.subList(10, 31));
		
		System.out.println(zL2);
		
		zL2.set(5, 42);
		
		System.out.println(zL2);
		System.out.println(zahlenListe);
	}

}
