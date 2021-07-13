package musterloesungenThread.brunnen.newBrunnenGK;

import java.time.LocalDateTime;
import java.util.List;

public class Schoepfer extends Thread {
	private Thread myThread;
	private int volume;
	private static Thread waitingThread;
	private static int waitingVolume = 0;
	private static List<Integer> taskQueue;
	private static int counter = 0;

	public Schoepfer(List<Integer> sharedTaskQueue, String name) {
		myThread = this;
		myThread.setName(name);
		this.taskQueue = sharedTaskQueue;

	}

	@Override
	public void run() {
		while (true) {
			counter++;
			System.out.println(
					"=================================================================== ");
			volume = (int) (Math.random() * 21);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (myThread.getName().equals("Pumpe")) {
				pumpe(volume);

			} else if (myThread.getName().equals("Verteiler")) {
				waitingVolume = volume * 2;
				try {
					verteiler(waitingVolume);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void pumpe(int volume) {
		Ziehbrunnen.setWasserTrog(Ziehbrunnen.getWasserTrog() + volume);
		System.out.println(counter + ". Pumpe pumpt " + volume + " Liter. \t\t-> Wassertrog: "
				+ Ziehbrunnen.getWasserTrog() + " Liter.");

		synchronized (taskQueue) {
			if (Ziehbrunnen.getWasserTrog() >= waitingVolume) {

				System.out.println("Task wird wieder gestartet...");

				taskQueue.notifyAll();

			}
		}
	}

	public void verteiler(int waitingVolume) throws InterruptedException {
		System.out.println(counter + ". waitingVolume Verteiler: " + waitingVolume + " Liter.");
		synchronized (taskQueue) {

			if (Ziehbrunnen.getWasserTrog() < waitingVolume) {
				System.err.println("Task wartet...");
				taskQueue.wait();
			}
			Ziehbrunnen.setWasserTrog(Ziehbrunnen.getWasserTrog() - waitingVolume);
			System.err.println("Verteiler entnimmt " + waitingVolume + " Liter. \t\t-> Wassertrog: "
					+ Ziehbrunnen.getWasserTrog() + " Liter.");

			waitingVolume = 0;
		}

	}

	public Thread getMyThread() {
		return myThread;
	}

	public void setMyThread(Thread myThread) {
		this.myThread = myThread;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public static Thread getWaitingThread() {
		return waitingThread;
	}

	public static void setWaitingThread(Thread waitingThread) {
		Schoepfer.waitingThread = waitingThread;
	}

	public static int getWaitingVolume() {
		return waitingVolume;
	}

	public static void setWaitingVolume(int waitingVolume) {
		Schoepfer.waitingVolume = waitingVolume;
	}

	public static List<Integer> getTaskQueue() {
		return taskQueue;
	}

	public static void setTaskQueue(List<Integer> taskQueue) {
		Schoepfer.taskQueue = taskQueue;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Schoepfer.counter = counter;
	}

	@Override
	public String toString() {
		return "Schoepfer [myThread=" + myThread + ", volume=" + volume + ", getMyThread()=" + getMyThread()
				+ ", getVolume()=" + getVolume() + "]";
	}

}
