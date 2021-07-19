package CafeteriaIIGK.control;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.MenuElement;

import CafeteriaIIGK.Application;
import CafeteriaIIGK.model.CoffeeDispenser;
import CafeteriaIIGK.model.IDrinkingCoffee;
import CafeteriaIIGK.view.GUICafeteria;

public class ControllerCafeteria extends Thread implements IDrinkingCoffee {

	private static boolean[] pause = new boolean[NUMBEROFCOFFEEDISPENSER];
	private static Object[] lock = new Object[NUMBEROFCOFFEEDISPENSER];
	private GUICafeteria gc = new GUICafeteria();
	private static CoffeeDispenser[] coffeeDispenser = new CoffeeDispenser[NUMBEROFCOFFEEDISPENSER];
	private static String nameKA;
	private static JTextField[] txfs = new JTextField[] { GUICafeteria.getTxfKA1(), GUICafeteria.getTxfKA2(),
			GUICafeteria.getTxfKA3(), GUICafeteria.getTxfKA4(), GUICafeteria.getTxfKA5() };

	public ControllerCafeteria() {

		gc.init();
		GUICafeteria.getBtnStartSim().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gc.startSim();
				setBtnActionListener(gc.getContentPane());
				setMenuActionlistener1st(GUICafeteria.getMnbSim());

				/**
				 * initialize coffeeDispensers in an array of Threads/coffeeDispensers and
				 * starts them
				 */
				for (int i = 0; i < coffeeDispenser.length; i++) {

					lock[i] = new Object();
					coffeeDispenser[i] = new CoffeeDispenser("KA " + (i + 1), pause[i], lock[i]);

					coffeeDispenser[i].setName("ThreadKA_" + (i + 1));
					coffeeDispenser[i].start();
				}
			}
		});

	}

	private void setMenuActionlistener1st(JMenuBar menuBar) {

		for (MenuElement element : menuBar.getSubElements()) {
			@SuppressWarnings("unused")
			JMenuItem menuItem = (JMenuItem) element;
			setMenuActionlistener2nd(element);
		}
	}

	private static void setMenuActionlistener2nd(MenuElement subElement) {
		for (MenuElement element : subElement.getSubElements()) {
			if (element instanceof JMenuItem) {
				((JMenuItem) element).addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						String command = ((JMenuItem) element).getText();
						switch (command) {
						case "Restart": {
							try {
								Runtime.getRuntime().exec(Application.cmd.toString());
								System.exit(0);
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							break;
						}
						case "Pause Simulation": {
							int pauseTime = GUICafeteria.getPauseTime();

							if (pauseTime == -1) {
								pauseTime = 0;
							} else {
								for (int i = 0; i < NUMBEROFCOFFEEDISPENSER; i++) {
									/**
									 * TODO getter setter via GUI for better style
									 * look below at pause for special coffeeDispensers
									 */
									for (int bc = 1; bc < GUICafeteria.getLblsAbout().length; bc++) {
										GUICafeteria.getLblsAbout()[bc].setVisible(false);
										if (bc == 4) {
											GUICafeteria.getLblsAbout()[bc].setVisible(true);
										}
									}
									coffeeDispenser[i].setPauseLength(pauseTime * 1000);
									coffeeDispenser[i].setPause(true);
								}
							}
							break;
						}
						case "End": {
							System.exit(0);
							break;
						}
						/**
						 * TODO solve it per text of button/path/icon name, trim spaces for that
						 */
						case "Author": {
							for (int i = 1; i < GUICafeteria.getLblsAbout().length; i++) {
								GUICafeteria.getLblsAbout()[i].setVisible(false);
								if (i == 1) {
									GUICafeteria.getLblsAbout()[i].setVisible(true);
								}
							}
							break;
						}
						case "Size Of Cup": {
							for (int i = 1; i < GUICafeteria.getLblsAbout().length; i++) {
								GUICafeteria.getLblsAbout()[i].setVisible(false);
								if (i == 2) {
									GUICafeteria.getLblsAbout()[i].setVisible(true);
								}
							}
							break;
						}
						case "Number Of Coffeedispensers": {
							for (int i = 1; i < GUICafeteria.getLblsAbout().length; i++) {
								GUICafeteria.getLblsAbout()[i].setVisible(false);
								if (i == 3) {
									GUICafeteria.getLblsAbout()[i].setVisible(true);
								}
							}
							break;
						}
						default: {
							System.out.println("Unexpected Event...");
							break;
						}
						}
					}
				});
			}
			setMenuActionlistener2nd(element);
		}
	}

	public void setBtnActionListener(Component root) {
		Container container = (Container) root;
		for (Component inner : container.getComponents()) {
			setBtnActionListener(inner);
			if (inner instanceof JButton) {
				((JButton) inner).addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						int i = Integer.parseInt(inner.getName().substring(3)) - 1;
						int pauseTime = GUICafeteria.getPauseTime();

						if (pauseTime == -1) {
							pauseTime = 0;
						} else {
							for (int bc = 1; bc < GUICafeteria.getLblsAbout().length; bc++) {
								GUICafeteria.getLblsAbout()[bc].setVisible(false);
								if (bc == 4) {
									GUICafeteria.getLblsAbout()[bc].setVisible(true);
								}
							}
							coffeeDispenser[i].setPauseLength(pauseTime * 1000);
							coffeeDispenser[i].setPause(true);
						}
					}
				});
			}
		}
	}

	public static CoffeeDispenser[] getCoffeeDispenser() {
		return coffeeDispenser;
	}

	public static void endPause() {
		GUICafeteria.setBoardEmpty();
	}

	public static void setCoffeeDispenser(CoffeeDispenser[] coffeeDispenser) {
		ControllerCafeteria.coffeeDispenser = coffeeDispenser;
	}

	public GUICafeteria getGc() {
		return gc;
	}

	public void setGc(GUICafeteria gc) {
		this.gc = gc;
	}

	public static String getNameKA() {
		return nameKA;
	}

	public static void setNameKA(String nameKA) {
		ControllerCafeteria.nameKA = nameKA;
	}

	public static JTextField[] getTxfs() {
		return txfs;
	}

	public static void setTxfs(JTextField[] txfs) {
		ControllerCafeteria.txfs = txfs;
	}

	public Object[] getLock() {
		return lock;
	}

	public void setLock(Object[] lock) {
		this.lock = lock;
	}

	public boolean[] getPause() {
		return pause;
	}

	public void setPause(boolean[] pause) {
		this.pause = pause;
	}

}
