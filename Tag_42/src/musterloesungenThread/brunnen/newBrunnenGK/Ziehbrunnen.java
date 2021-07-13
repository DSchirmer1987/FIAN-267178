package musterloesungenThread.brunnen.newBrunnenGK;

import java.util.ArrayList;
import java.util.List;

public class Ziehbrunnen {

	private static int wasserTrog = 0;
	private final static List<Integer> taskQueue = new ArrayList<Integer>();

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Start-Inhalt Wassertrog: " + wasserTrog + " Liter.");

		Schoepfer pumpe = new Schoepfer(taskQueue, "Pumpe");
		Schoepfer verteiler = new Schoepfer(taskQueue, "Verteiler");


		pumpe.start();
		verteiler.start();

		while (true) {
			
//			System.out.println("Thread:  "+ Thread.currentThread().getName() + "\t\t\t\t-> Wassertrog: " + wasserTrog + " Liter.");

			Thread.sleep(1000);
		}

	}

	public static int getWasserTrog() {
		return wasserTrog;
	}

	public static void setWasserTrog(int wasserTrog) {
		Ziehbrunnen.wasserTrog = wasserTrog;
	}

	public static List<Integer> getTaskqueue() {
		return taskQueue;
	}

	@Override
	public String toString() {
		return "Ziehbrunnen [toString()=" + super.toString() + "]";
	}

}
