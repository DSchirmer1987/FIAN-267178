package CafeteriaIIGK.model;

import java.util.concurrent.TimeUnit;

import CafeteriaIIGK.control.ControllerCafeteria;
import CafeteriaIIGK.view.GUICafeteria;

public class CoffeeDispenser extends Thread implements IDrinkingCoffee {

	private boolean pause;
	private Object lock;
	private int pauseLength;
	private String nameCD;

	public CoffeeDispenser(String name, boolean pause, Object lock) {
		this.nameCD = name;
		this.pause = pause;
		this.lock = lock;
	}

	@Override
	public void run() {

		int volumeCD = MAXVOLUMEDISPENSER;
		int remainingVolume = 0;
		int iCD = Integer.parseInt(nameCD.substring(nameCD.length() - 1)) - 1;

		while (true) {
			/**
			 * gets the remaining rest, if coffeeAutomat was filled up
			 */
			volumeCD -= remainingVolume;

			while (volumeCD > 0) {

				if (pause) {
					synchronized (lock) {
						try {
							lock.wait(pauseLength);
							pause = false;
							pauseLength = 0;
							ControllerCafeteria.endPause();
							lock.notify();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}

				int rndECupVolume = (int) (Math.random() * ECup.values().length);
				/**
				 * "... /100)*100" for being accurate to a tenth of seconds and avoid getting
				 * each millisecond
				 */
				int rndTimeToWaitForNextEmployee = (int) ((1000 + Math.random() * 2001) / 100) * 100;

				int tmpVolumeCupOfCoffee = ECup.values()[rndECupVolume].getVolumeCup();
				String cupOfCoffeeSize = ECup.values()[rndECupVolume].name();

				volumeCD -= tmpVolumeCupOfCoffee;
				GUICafeteria.printCupOfCoffeeVolume(iCD, volumeCD, cupOfCoffeeSize);

				try {
					/**
					 * only waits if coffeeAutomat is not to be filled up
					 */
					if (volumeCD > 0) {
						GUICafeteria.printTimeToWaitForNextEmployee(iCD, rndTimeToWaitForNextEmployee);
						TimeUnit.MILLISECONDS.sleep(rndTimeToWaitForNextEmployee);
					}

				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			/**
			 * keeps the remaining rest, if coffeeAutomat is to be filled up here with (-1)
			 * to do operation "-=" in code above
			 */
			remainingVolume = volumeCD * (-1);

			GUICafeteria.printFillUp(iCD);
			/**
			 * needs ~ 30 s to be filled up
			 */

			GUICafeteria.printRemainingVolume(iCD, remainingVolume);

			for (int i = 0; i < PERIODOFFILLUP / INTERVAL; i++) {
				if (pause) {
					synchronized (lock) {
						try {
							lock.wait(pauseLength);
							pause = false;
							pauseLength = 0;
							ControllerCafeteria.endPause();
							lock.notify();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				GUICafeteria.printContinuousFilling(iCD, remainingVolume, i);
				try {
					TimeUnit.MILLISECONDS.sleep(INTERVAL);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			volumeCD = MAXVOLUMEDISPENSER;

			GUICafeteria.printContinueWorking(iCD);
		}
	}

	public static String[] getSizeOfCup() {
		int enumCupLength = ECup.values().length;
		String[] sizeOfCups = new String[enumCupLength];
		for (int i = 0; i < enumCupLength; i++) {
			sizeOfCups[i] = ECup.values()[i].name();
		}
		return sizeOfCups;
	}

	public String getNameKA() {
		return nameCD;
	}

	public void setNameKA(String nameCD) {
		this.nameCD = nameCD;
	}

	public String getNameCD() {
		return nameCD;
	}

	public void setNameCD(String nameCD) {
		this.nameCD = nameCD;
	}

	public boolean isPause() {
		return pause;
	}

	public void setPause(boolean pause) {
		this.pause = pause;
	}

	public Object getLock() {
		return lock;
	}

	public void setLock(Object lock) {
		this.lock = lock;
	}

	public int getPauseLength() {
		return pauseLength;
	}

	public void setPauseLength(int pauseLength) {
		this.pauseLength = pauseLength;
	}

}
