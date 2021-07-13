package musterloesungenThread.brunnen.gk;

import java.util.ArrayList;
import java.util.List;

public class Schoepfer extends Thread {

	private int rndVolumeVerteiler, rndVolumePumpe;
	private Thread myThread;
	private static Thread tmpThreadVerteiler;
	private final List<Integer> taskQueue;

	public Schoepfer(List<Integer> sharedQueue, String name) {
		myThread = this;
		myThread.setName(name);
		this.taskQueue = sharedQueue;
	}

//	 private final List<Integer> taskQueue;

//	public Schoepfer(List<Integer> taskQueue, Thread thread) {
//		this.taskQueue = taskQueue;
//		this.myThread = thread;
//	}

//	 public Schoepfer(List<Integer> taskQueue) {
//		 this.taskQueue = taskQueue;
//		 this.myThread = this;
//	 }

	@Override
	public synchronized void run() {
		int counter = 0;
		while (true) {
			rndVolumeVerteiler = (int) (Math.random() * 21);
			rndVolumePumpe = (int) (Math.random() * 21);
			try {
				Thread.sleep(1000);
				if (myThread.getName().equals("Pumpe")) {
					pumpe();
				} else if (myThread.getName().equals("Verteiler")) {
//					tmpThreadVerteiler = myThread;
//					if(Ziehbrunnen.trog - rndVolumeVerteiler < 0) {
//						taskQueue.add(1);	
//					}

					verteiler();
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(counter + ".:\tAufruf von " + myThread.getName() + ": " + rndVolumePumpe
					+ "l => Wassertrog Inhalt: " + Ziehbrunnen.trog + " l. ");
			counter++;
		}

	}

	private synchronized void verteiler() throws InterruptedException {
		
		synchronized (taskQueue/* taskQueue tmpThreadVerteiler */) {
			
			if(Ziehbrunnen.trog - rndVolumeVerteiler < 0) {
				taskQueue.clear();
			}
			tmpThreadVerteiler = myThread;
			while (taskQueue.isEmpty()/* taskQueue.size() > 0 Ziehbrunnen.trog - rndVolumeVerteiler < 0*/) {
				System.out.println("Thread wartet... Verteiler: " + rndVolumeVerteiler + " l.");
				taskQueue.add(1);
				System.out.println("Nach add: " + taskQueue.size());
				
				if(Ziehbrunnen.trog - rndVolumeVerteiler >= 0) {
					System.out.println("Wacht auf");
//					taskQueue.notifyAll();
					Ziehbrunnen.trog -= rndVolumeVerteiler;
					
				} else {
					System.out.println("Wartet");
					taskQueue.wait();
				}
						
			}
			System.out.println("Nach while: " + taskQueue.size());
			Thread.sleep(1000);
//			if (taskQueue.size() > 0 && taskQueue != null) {
				taskQueue.add(1);
				
//			}
			Ziehbrunnen.trog -= rndVolumeVerteiler;
			taskQueue.notifyAll();

		}

	}

	private synchronized void pumpe() {
		
		Ziehbrunnen.trog += rndVolumePumpe;
//		tmpThreadVerteiler.notifyAll();
		taskQueue.add(1);
		notifyAll();
		System.out.println("Von Pumpe: " + taskQueue.size());
		System.out.println("ZB - Vt: " + (Ziehbrunnen.trog - rndVolumeVerteiler));
		synchronized (taskQueue/* taskQueue tmpThreadVerteiler */) {
			taskQueue.notifyAll();
		}
//		taskQueue.clear();
//		taskQueue.notifyAll();
//		try {
//		tmpThreadVerteiler.notifyAll();
//		} catch(NullPointerException e) {
//			e.printStackTrace();
//		}
	}

	public int getRndVolumeVerteiler() {
		return rndVolumeVerteiler;
	}

	public void setRndVolumeVerteiler(int rndVolumeVerteiler) {
		this.rndVolumeVerteiler = rndVolumeVerteiler;
	}

	public int getRndVolumePumpe() {
		return rndVolumePumpe;
	}

	public void setRndVolumePumpe(int rndVolumePumpe) {
		this.rndVolumePumpe = rndVolumePumpe;
	}

	public Thread getMyThread() {
		return myThread;
	}

	public void setMyThread(Thread myThread) {
		this.myThread = myThread;
	}

	public Thread getTmpThreadVerteiler() {
		return tmpThreadVerteiler;
	}

	public void setTmpThreadVerteiler(Thread tmpThreadVerteiler) {
		this.tmpThreadVerteiler = tmpThreadVerteiler;
	}

	public List<Integer> getTaskQueue() {
		return taskQueue;
	}
}
