package tag47.CafeteriaIISpecialGK.control;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.MenuElement;

import tag47.CafeteriaIISpecialGK.Application;
import tag47.CafeteriaIISpecialGK.model.CoffeeDispenser;
import tag47.CafeteriaIISpecialGK.model.IDrinkingCoffee;
import tag47.CafeteriaIISpecialGK.view.GUICafeteria;

public class ControllerCafeteria extends Thread implements IDrinkingCoffee {

	private static boolean[] pause = new boolean[NUMBEROFCOFFEEDISPENSER];
	private static Object[] lock = new Object[NUMBEROFCOFFEEDISPENSER];
	private static GUICafeteria gc = new GUICafeteria();
	private static CoffeeDispenser[] coffeeDispenser = new CoffeeDispenser[NUMBEROFCOFFEEDISPENSER];
	private static String nameKA;

	public ControllerCafeteria() {

		GUICafeteria.checkNumberOfCoffeeDispensers();
		gc.init();
		gc.getBtnStartSim().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				gc.startSim();
				setBtnActionListener(gc.getContentPane());
				setMenuActionlistener1st(gc.getFrame().getJMenuBar());

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
									 * TODO getter setter via GUI for better style look below at pause for special
									 * coffeeDispensers
									 */
									for (int bc = 1; bc < gc.getLblsAbout().length; bc++) {
										gc.getLblsAbout()[bc].setVisible(false);
										if (bc == 4) {
											gc.getLblsAbout()[bc].setVisible(true);
										}
									}
									coffeeDispenser[i].setPauseLength(pauseTime * 1000);
									coffeeDispenser[i].setPause(true);
								}
								/**
								 * not finally 100 % correct with emptying board TODO exact control information
								 * about which coffeeDispensers are in pause
								 */
								if (gc.getLblPauseInfo().getText().equals("")) {
									gc.getLblPauseInfo().setText("all");
								} else {
									System.out.println(gc.getLblPauseInfo().getText().length());
									gc.getLblPauseInfo().setText(gc.getLblPauseInfo().getText() + ", all");
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
							gc.getLblPauseInfo().setText("");
							for (int i = 1; i < gc.getLblsAbout().length; i++) {

								gc.getLblsAbout()[i].setVisible(false);
								if (i == 1) {
									gc.getLblsAbout()[i].setVisible(true);
								}
							}
							break;
						}
						case "Size Of Cup": {
							gc.getLblPauseInfo().setText("");
							for (int i = 1; i < gc.getLblsAbout().length; i++) {
								gc.getLblsAbout()[i].setVisible(false);
								if (i == 2) {
									gc.getLblsAbout()[i].setVisible(true);
								}
							}
							break;
						}
						case "Number Of Coffeedispensers": {
							gc.getLblPauseInfo().setText("");
							for (int i = 1; i < gc.getLblsAbout().length; i++) {
								gc.getLblsAbout()[i].setVisible(false);
								if (i == 3) {
									gc.getLblsAbout()[i].setVisible(true);
								}
							}
							break;
						}
						case "History": {
							/**
							 * TODO more history
							 */
							System.out.println("Todo");
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
						int i = Integer.parseInt(inner.getName().substring(inner.getName().length() - 1)) - 1;
						int pauseTime = GUICafeteria.getPauseTime();

						if (pauseTime == -1) {
							pauseTime = 0;
						} else {
							for (int bc = 1; bc < gc.getLblsAbout().length; bc++) {
								gc.getLblsAbout()[bc].setVisible(false);
								if (bc == 4) {
									gc.getLblsAbout()[bc].setVisible(true);
								}
							}
							coffeeDispenser[i].setPauseLength(pauseTime * 1000);
							coffeeDispenser[i].setPause(true);
							/**
							 * not finally 100 % correct with emptying board TODO exact control information
							 * about which coffeeDispensers are in pause
							 */
							if (gc.getLblPauseInfo().getText().equals("")) {
								gc.getLblPauseInfo().setText("" + (i + 1));
							} else {
								gc.getLblPauseInfo().setText(gc.getLblPauseInfo().getText() + ", " + (i + 1));
							}

						}
					}
				});
			}
		}
	}

	@SuppressWarnings("unused")
	private void checkNumberOfCoffeeDispensers() {
		/**
		 * TODO create more rooms by array of frames, add arrows to navigate
		 */
		if (NUMBEROFCOFFEEDISPENSER > 5) {
			JOptionPane.showMessageDialog(null,
					"Danger! A person who probably likes 42 has manipulated the interface above its limits.\n\nYou can get more rooms for money. ;-)\n\nprogram will terminate...",
					"Warning Number Of CoffeeDispensers", JOptionPane.WARNING_MESSAGE, ICONWARNING);
			System.exit(0);
		}
	}

	public static CoffeeDispenser[] getCoffeeDispenser() {
		return coffeeDispenser;
	}

	public static void endPause() {
		gc.setBoardEmpty();
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

	@Override
	public String toString() {
		return "ControllerCafeteria [getGc()=" + getGc() + ", getLock()=" + Arrays.toString(getLock()) + ", getPause()="
				+ Arrays.toString(getPause()) + "]";
	}

}
