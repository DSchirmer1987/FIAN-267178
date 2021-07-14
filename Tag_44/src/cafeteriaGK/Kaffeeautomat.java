package cafeteriaGK;

import java.time.LocalDateTime;

public class Kaffeeautomat extends Thread {

	private final static int MAXVOLUMEAUTOMAT = 5000;
	private String nameKA;

	public Kaffeeautomat(String name) {
		this.nameKA = name;
	}

	public void run() {

		int volumeKA = MAXVOLUMEAUTOMAT;
		int remainingVolume = 0;
		boolean printRed = false;
		int tmp = Integer.parseInt(nameKA.substring(nameKA.length()-1));
		/**
		 * for better readability the output is controlled by the number of coffeeAutomat
		 * (similar to a kind of group)
		 * and by color for even numbers
		 */
		String tmpTabs = "";
		for(int i = 0; i < tmp;i++) {
			tmpTabs += "\t";
		}
		
		if(tmp%2 == 0) {
			printRed = true;
		}
		
		while (true) {
			
			/**
			 * gets the remaining rest, if coffeeAutomat was filled up
			 */
			volumeKA -= remainingVolume;

			while (volumeKA > 0) {
				
				
				
				int rndETasseVolume = (int) (Math.random() * ETasse.values().length);
				/**
				 * "... /100)*100" for being accurate to a tenth of seconds
				 * and avoid getting each millisecond
				 */
				int rndTimeToWaitForNextEmployee = (int) ((500 + Math.random() * 2501)/100)*100;				

				int tmpVolumeCupOfCoffee = ETasse.values()[rndETasseVolume].getVolumeCup();
				String cupOfCoffeeSize = ETasse.values()[rndETasseVolume].name();
				printCupOfCoffeeVolume(tmpVolumeCupOfCoffee, volumeKA, tmpTabs, printRed, cupOfCoffeeSize);
				volumeKA -= tmpVolumeCupOfCoffee;
				
				try {
					/**
					 * only waits if coffeeAutomat is not to be filled up
					 */
					if(volumeKA > 0) {
						printTimeToWaitForNextEmployee(rndTimeToWaitForNextEmployee, tmpTabs, printRed);
						Thread.sleep(rndTimeToWaitForNextEmployee);
					}
	
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				

			}
			
			/**
			 * keeps the remaining rest, if coffeeAutomat is to be filled up
			 * here with (-1) to do operation "-=" in code above
			 */
			remainingVolume = volumeKA * (-1);
			
			printFillUp(tmpTabs, printRed);
			try {
				/**
				 * needs ca. 30 s to be filled up
				 */
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			volumeKA = MAXVOLUMEAUTOMAT;
			
			printContinueWorking(tmpTabs, printRed);
		}

	}

	public void printFillUp(String tmpTabs, boolean printRed) {		
		
		if(printRed) {
			System.err.println(tmpTabs + "Die Kaffeemaschine " + nameKA + " muss aufgef�llt werden..." + LocalDateTime.now());
		} else {
			System.out.println(tmpTabs + "Die Kaffeemaschine " + nameKA + " muss aufgef�llt werden..." + LocalDateTime.now());	
		}
		
		
	}

	public void printContinueWorking(String tmpTabs, boolean printRed) {
		
		if(printRed) {
			System.err.println(tmpTabs + "-------------------------------------------");
			System.err.println(tmpTabs + "Die Kaffeemaschine " + nameKA + " arbeitet weiter..."  + LocalDateTime.now() + "\n");
		} else {
			System.out.println(tmpTabs + "-------------------------------------------");
			System.out.println(tmpTabs + "Die Kaffeemaschine " + nameKA + " arbeitet weiter..."  + LocalDateTime.now() + "\n");
		}
		
	}
	
	public void printCupOfCoffeeVolume(int volumeCupOfCoffee, int volumeKA, String tmpTabs, boolean printRed, String cupOfCoffeeSize) {
		
		if(printRed) {
			System.err.println(tmpTabs + "-> Die Kaffeemaschine " + nameKA + "(Volumen: " + volumeKA + ") gibt " + volumeCupOfCoffee + " ml aus (Tassengr��e " + cupOfCoffeeSize + ")... <-");
		} else {
			System.out.println(tmpTabs + "-> Die Kaffeemaschine " + nameKA + "(Volumen: " + volumeKA + ") gibt " + volumeCupOfCoffee + " ml aus (Tassengr��e " + cupOfCoffeeSize + ")... <-");	
		}
			
	}
	
	public void printTimeToWaitForNextEmployee(int rndTimeToWaitForNextEmployee, String tmpTabs, boolean printRed) {
		
		if(printRed) {
			System.err.println(tmpTabs + "-> Die Kaffeemaschine " + nameKA + " wartet " + rndTimeToWaitForNextEmployee + " ms auf den n�chsten Mitarbeiter... <-");
		} else {
			System.out.println(tmpTabs + "-> Die Kaffeemaschine " + nameKA + " wartet " + rndTimeToWaitForNextEmployee + " ms auf den n�chsten Mitarbeiter... <-");
		}
		
	}

	public String getNameKA() {
		return nameKA;
	}

	public void setNameKA(String nameKA) {
		this.nameKA = nameKA;
	}

}
