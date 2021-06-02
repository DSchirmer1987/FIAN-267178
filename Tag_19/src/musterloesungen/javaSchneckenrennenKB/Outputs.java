package musterloesungen.javaSchneckenrennenKB;

import java.util.Iterator;

public class Outputs {

	public static void rennenVoll() {
		System.out.println("Sorry, das Rennen ist voll Kumpel!");
	}

	public static void theWinnerIs(Rennschnecke snail) {
		System.out.println("The winner is: " + snail.toString());
	}

//	public static void zeichneRennen(Rennen race) {
//		for (int i = 0; i < race.getNumberOfSnails() + 3; i++) {
//
//			for (int j = 0; j < race.getRaceLenght(); j++) {
//				if (i == 0) {
//					System.out.print("-");
//				}else if (j>0&&j<race.getRaceLenght() - 1) {
//					for(int k=0; k < 5; k++) {
//						
//					}
//				}
//				if (j == race.getRaceLenght() - 1) {
//					System.out.print("|\n");
//				}
//			}
//		}
//	}
}
