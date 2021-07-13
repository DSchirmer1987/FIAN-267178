package musterloesungenThread.brunnen.gk;

import java.util.ArrayList;
import java.util.List;

public class Ziehbrunnen {

	public static int trog = 0;
	private int volume;
	

	public static void main(String[] args) throws InterruptedException {
		List<Integer> taskQueue = new ArrayList<Integer>();
//		Schoepfer s = new Schoepfer(taskQueue, "");
		
		System.out.println("Wassertrog Inhalt: " + trog + " l.");
		
		// Namens�bergabe hier klappte nicht, warum?!
		Thread pumpe = /*new Thread(*/new Schoepfer(taskQueue, "Pumpe");/*, "Pumpe");*/
		Thread verteiler = /*new Thread(*/new Schoepfer(taskQueue, "Verteiler");/*, "Verteiler");*/

//		pumpe.setName("Pumpe");
//		verteiler.setName("Verteiler");

		verteiler.start();
		pumpe.start();

	

		pumpe.join();
		verteiler.join();

	}




}
