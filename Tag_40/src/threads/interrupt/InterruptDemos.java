package threads.interrupt;

public class InterruptDemos {

	public static void main(String[] args) {
		Runnable killingMeSoftly = () -> {
			System.out.println("Es gibt ein Leben vor dem Tod");
			
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("Der Thread läuft und läuft und läuft");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					System.out.println("Interrupt beim sleep()");
				}
			}
			
			System.out.println("Das Ende");
		};
		
		Thread t = new Thread(killingMeSoftly);
		t.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.interrupt();
	}

}
