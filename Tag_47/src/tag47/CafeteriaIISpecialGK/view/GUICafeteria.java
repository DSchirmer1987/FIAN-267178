package tag47.CafeteriaIISpecialGK.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import javax.swing.JSeparator;
import javax.swing.JTextField;

import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import tag47.CafeteriaIISpecialGK.model.ECup;
import tag47.CafeteriaIISpecialGK.model.EMenu;
import tag47.CafeteriaIISpecialGK.model.IDrinkingCoffee;

public class GUICafeteria extends JFrame implements IDrinkingCoffee {

	/**
	 * automatically generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * components for interaction with itself and/or controller
	 */
	private Component c;
	private boolean initFinished = false;

	private JFrame startFrame;
	private JButton btnStartSim;

	private JFrame frame;
	private JPanel contentPane;
	private JLayeredPane layeredPane;

	private JMenuBar myJMenuBar;
	private JMenu myJMenu;
	private JMenuItem myJMenuItem;
	private int myMenuLevel = 0;

	private static JTextField[] txfsCup = new JTextField[NUMBEROFCOFFEEDISPENSER];
	private static JTextField[] txfsCupVolume = new JTextField[NUMBEROFCOFFEEDISPENSER];
	private static JTextField[] txfsDisplayCurrentVolume = new JTextField[NUMBEROFCOFFEEDISPENSER];
	private static JTextField[] txfsWaitTime = new JTextField[NUMBEROFCOFFEEDISPENSER];
	private static JProgressBar[] pgbsVolume = new JProgressBar[NUMBEROFCOFFEEDISPENSER];	
	private JLabel[] lblsAbout = new JLabel[5];
	private JLabel lblPauseInfo;

	private static Font dig7;

	public void init() {
		startWindow();
	}

	private void startWindow() {
		startFrame = new JFrame();
		startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startFrame.setTitle(SIMTITLE);
		startFrame.setBounds(STARTLEFT, STARTTOP, STARTFRAMEWIDTH, STARTFRAMEHEIGHT);
		

		btnStartSim = new JButton();
		btnStartSim.setText(BTNSTARTTEXT);
		startFrame.add(btnStartSim);
		
		startFrame.setVisible(true);
	}

	public void startSim() {
		initSimWindow();
	}

	private void initSimWindow() {

		GUIComponents.initGUIComponents();
		LinkedHashMap<String, GUIComponents> lhm = GUIComponents.getGcm();
		Iterator<String> itr = lhm.keySet().iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			GUIComponents gcm = lhm.get(key);
			Component tmpC = gcm.getComponent();
			String clsName = tmpC.getClass().getSimpleName();

			/**
			 * initialization of frame
			 */
			if (!initFinished) {
				switch (clsName) {
				/**
				 * layeredPane for objects to control visibility free from order of creation
				 */
				case "JLayeredPane": {
					c = new JLayeredPane();
					layeredPane = (JLayeredPane) c;
					break;
				}
				case "JPanel": {
					c = new JPanel();
					contentPane = (JPanel) c;
					contentPane.setOpaque(true);
					contentPane.setBackground(new Color(176, 200, 200));
					contentPane.setLayout(null);
					contentPane.add(layeredPane);
					break;
				}
				case "JFrame": {
					c = new JFrame();
					frame = (JFrame) c;
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setResizable(false);
					frame.setTitle(SIMTITLE);
					frame.setVisible(true);
					frame.setContentPane(contentPane);
					/**
					 * sets font and menu before initialization is finished
					 */
					setFont();
					setMenu();
					initFinished = true;
					break;
				}
				default: {
					System.out.println("unexcpected event near '!initFinished, switch (clsName)'");
					continue;
				}
				}
				c.setName(gcm.getName());
				c.setBounds(gcm.getLeft(), gcm.getTop(), gcm.getWidth(), gcm.getHeight());
				continue;
			}
			/**
			 * building components for frame
			 */
			if (initFinished) {
				int number = 0;
				/**
				 * loop flexible control
				 */
				if (gcm.isSingleElement()) {
					number = 1;
				} else {
					number = NUMBEROFCOFFEEDISPENSER;
				}

				for (int i = 0; i < number; i++) {

					try {
						switch (clsName) {
						case "JPanel": {
							c = new JPanel();
							break;
						}
						case "JFrame": {
							frame = new JFrame();
							break;
						}
						case "JLayeredPane": {
							layeredPane = new JLayeredPane();
							break;
						}
						case "JLabel": {
							/**
							 * continue to avoid renaming of lblImageSimulation from index 1 to 2
							 */

							if (gcm.getIcon() != null) {
								c = new JLabel(gcm.getIcon());
							} else {
								c = new JLabel();
								((JLabel) c).setText(gcm.getMyText() + " " + (i + 1));
							}
							break;
						}
						case "JProgressBar": {
							c = new JProgressBar(SwingConstants.VERTICAL);
						}
							break;
						case "JButton": {
							c = new JButton(gcm.getMyText());
							((JButton) c).setBorder(new LineBorder(new Color(153, 255, 153), 2));
							;
						}
							break;
						case "JTextField": {
							c = new JTextField();
							((JTextField) c).setOpaque(false);
							((JTextField) c).setBorder(new EmptyBorder(0, 0, 1, 1));
							((JTextField) c).setText(gcm.getMyText());
							((JTextField) c).setHorizontalAlignment(SwingConstants.RIGHT);
						}
							break;
						default: {
							System.out.println("unexcpected event near 'initFinished, switch (clsName)'");
							continue;
						}
						}
						c.setName(key + (i + 1));
						c.setBounds(i * gcm.getOffset() + gcm.getLeft(), gcm.getTop(), gcm.getWidth(), gcm.getHeight());
						/**
						 * customizes components before adding and puts the changing ones into "control" arrays
						 */
						customizeComponents(c, i);
						layeredPane.add(c, Integer.valueOf(gcm.getLayer()));
					} catch (NullPointerException e) {
						System.out.println("gcm null");
					}
				}
			}
		}
		/**
		 * to avoid caret
		 */
		JTextField tmp = new JTextField();
		layeredPane.add(tmp, Integer.valueOf(0));

		startFrame.dispose();		
	}

	/**
	 * customizes components and puts the changing ones into "control" arrays
	 * 
	 * @param c
	 * @param i1
	 */
	private void customizeComponents(Component c, int i1) {

		/**
		 * cName is name of component without index
		 */
		int a = 1;
		/**
		 * to get correct cName depending on index
		 */
		for (int i = 0; i < c.getName().length(); i++) {
			try {
				a = Integer.parseInt(c.getName().substring(i));
				a = c.getName().substring(i).length();
				break;
			} catch (NumberFormatException e) {
			}
		}

		String cName = c.getName().substring(0, c.getName().length() - a);

		switch (cName) {
		case "lblImageSimulation": {
			((JLabel) c).setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
			return;
		}
		case "lblImageCup": {
			return;
		}
		case "txfCup": {
			((JTextField) c).setOpaque(false);
			c.setForeground(Color.gray);
			c.setFont(new Font(c.getFont().getName(), Font.BOLD, 36));
			txfsCup[i1] = (JTextField) c;
			return;
		}
		case "txfCupVolume": {
			txfsCupVolume[i1] = (JTextField) c;
			return;
		}
		case "lblDisplayName": {
			((JLabel) c).setBorder(
					new CompoundBorder(new EtchedBorder(EtchedBorder.RAISED, null, null), new EmptyBorder(0, 2, 0, 0)));
			c.setForeground(Color.darkGray);
			return;
		}
		case "txfDisplayCurrentVolume": {
			((JTextField) c).setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
			((JTextField) c).setOpaque(true);
			c.setBackground(new Color(30, 200, 225));
			Font dig7_S16 = dig7.deriveFont(Font.BOLD, 16);
			GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(dig7_S16);
			c.setFont(dig7_S16);
			txfsDisplayCurrentVolume[i1] = (JTextField) c;
			return;
		}
		case "lblImageCD": {
			return;
		}
		case "lblCDBadge": {
			c.setForeground(Color.lightGray);
			c.setFont(dig7);
			return;
		}
		case "txfWaitTime": {
			((JTextField) c).setOpaque(true);
			c.setBackground(new Color(140, 200, 255));
			c.setFont(new Font(c.getFont().getName(), Font.PLAIN, 8));
			txfsWaitTime[i1] = (JTextField) c;
			return;
		}
		case "pgbVolume": {
			((JProgressBar) c).setMinimum(0);
			((JProgressBar) c).setMaximum(MAXVOLUMEDISPENSER);
			((JProgressBar) c).setValue((int) MAXVOLUMEDISPENSER / 2);
			c.setForeground(new Color(140, 200, 255));
			c.setBackground(new Color(80, 80, 80));
			((JProgressBar) c).setBorderPainted(false);
			pgbsVolume[i1] = (JProgressBar) c;
			return;
		}
		case "btnPause": {
			c.setBackground(new Color(90, 210, 165));
			c.setFont(new Font(c.getFont().getName(), Font.PLAIN, 8));
			return;
		}
		case "lblImageBoard": {
			lblsAbout[0] = (JLabel) c;
			return;
		}
		case "lblImageAuthor": {
			c.setVisible(false);
			lblsAbout[1] = (JLabel) c;
			return;
		}
		case "lblImageSizeOfCups": {
			c.setVisible(false);
			lblsAbout[2] = (JLabel) c;
			return;
		}
		case "lblImageNumberOfCoffeeDispensers": {
			c.setVisible(false);
			lblsAbout[3] = (JLabel) c;
			return;
		}
		case "lblImagePause": {
			c.setVisible(false);
			lblsAbout[4] = (JLabel) c;
			return;
		}
		case "lblPauseInfo": {
			c.setForeground(Color.gray);
			c.setFont(new Font(c.getFont().getName(), Font.BOLD, 36));
			((JLabel) c).setText("");
			lblPauseInfo = (JLabel) c;
			return;
		}
		default: {
			System.out.println("unexpected event in customizeComponents" + c.getName());
		}
		}
	}

	private void setFont() {
		dig7 = null;

		try {
			dig7 = Font.createFont(Font.TRUETYPE_FONT, new File(MAINPATH + "font/digital-7_new.ttf"));
			dig7 = dig7.deriveFont(Font.ITALIC, 20);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(dig7);
		} catch (FontFormatException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void setBoardEmpty() {
		for (int i = 1; i < getLblsAbout().length; i++) {
			getLblsAbout()[i].setVisible(false);
		}
		lblPauseInfo.setText("");
	}

	public static void printRemainingVolume(int iCD, int remainingVolume) {
		GUICafeteria.getTxfsWaitTime()[iCD].setText("remain " + remainingVolume + " ml...");
		GUICafeteria.getTxfsWaitTime()[iCD].update(GUICafeteria.getTxfsWaitTime()[iCD].getGraphics());
	}

	public static void printContinuousFilling(int iCD, int remainingVolume, int i) {
		GUICafeteria.getPgbsVolume()[iCD].setValue((int) (i * MAXVOLUMEDISPENSER / (PERIODOFFILLUP / INTERVAL)));
		GUICafeteria.getPgbsVolume()[iCD].update(GUICafeteria.getPgbsVolume()[iCD].getGraphics());
	}

	public static void printFillUp(int iCD) {
		GUICafeteria.getTxfsDisplayCurrentVolume()[iCD].setText("fill up...");
		GUICafeteria.getTxfsDisplayCurrentVolume()[iCD]
				.update(GUICafeteria.getTxfsDisplayCurrentVolume()[iCD].getGraphics());

	}

	public static void printContinueWorking(int iCD) {
		GUICafeteria.getTxfsDisplayCurrentVolume()[iCD].setText("continue...");
		GUICafeteria.getTxfsDisplayCurrentVolume()[iCD]
				.update(GUICafeteria.getTxfsDisplayCurrentVolume()[iCD].getGraphics());
	}

	public static void printCupOfCoffeeVolume(int iCD, int volumeKA, String cupOfCoffeeSize) {
		GUICafeteria.getTxfsDisplayCurrentVolume()[iCD].setText(volumeKA + " ml");
		GUICafeteria.getTxfsDisplayCurrentVolume()[iCD]
				.update(GUICafeteria.getTxfsDisplayCurrentVolume()[iCD].getGraphics());
		((JProgressBar) GUICafeteria.getPgbsVolume()[iCD]).setValue(volumeKA);
		((JProgressBar) GUICafeteria.getPgbsVolume()[iCD])
				.update(((JProgressBar) GUICafeteria.getPgbsVolume()[iCD]).getGraphics());

		GUICafeteria.getTxfsCup()[iCD].setText(cupOfCoffeeSize.substring(0, 1));
		GUICafeteria.getTxfsCup()[iCD].update(GUICafeteria.getTxfsCup()[iCD].getGraphics());
		GUICafeteria.getTxfsCupVolume()[iCD].setText(ECup.valueOf(cupOfCoffeeSize).getVolumeCup() + " ml");
		GUICafeteria.getTxfsCupVolume()[iCD].update(GUICafeteria.getTxfsCupVolume()[iCD].getGraphics());
	}

	public static void printTimeToWaitForNextEmployee(int iCD, int rndTimeToWaitForNextEmployee) {
		((JTextField) GUICafeteria.getTxfsWaitTime()[iCD]).setText("waits " + rndTimeToWaitForNextEmployee + " ms...");
		((JTextField) GUICafeteria.getTxfsWaitTime()[iCD])
				.update(((JTextField) GUICafeteria.getTxfsWaitTime()[iCD]).getGraphics());
	}

	public static int getPauseTime() {

		int pauseTime = 0;

		while (pauseTime < 1 || pauseTime > 180) {
			String strPauseTime = (String) JOptionPane.showInputDialog(null,
					"Please enter pause time (" + MINPAUSETIME + "- " + MAXPAUSETIME + " (in seconds)): ",
					"Setting Pause Time", JOptionPane.QUESTION_MESSAGE, ICONQUESTION, null, "42");
			try {
				pauseTime = Integer.parseInt(strPauseTime);
			} catch (NumberFormatException e) {
				pauseTime = 0;
			}

			if (strPauseTime == null) {
				return -1;
			}

		}

		return pauseTime;

	}

	public void setMenu() {

		String tmpText;
		boolean addElement = false;

		for (int i = 0; i < EMenu.values().length; i++) {

			tmpText = EMenu.values()[i].getText();

			if (EMenu.values()[i].getLevel() > myMenuLevel) {
				addElement = true;
			}

			switch (EMenu.values()[i].getTypeOfMenu()) {

			case "JMenuBar": {
				myJMenuBar = new JMenuBar();
				break;
			}
			case "JMenu": {
				myJMenu = new JMenu();
				myJMenu.setName(tmpText);
				myJMenu.setText(tmpText);
				if (addElement && myMenuLevel == 0) {
					myJMenuBar.add(myJMenu);
					myMenuLevel = EMenu.values()[i].getLevel();
					addElement = false;
				} else {
					myJMenuBar.getMenu(myMenuLevel - 1).add(myJMenu);
				}
				break;
			}
			case "JMenuItem": {
				myJMenuItem = new JMenuItem();
				myJMenuItem.setName(tmpText);
				myJMenuItem.setText(tmpText);
				if (addElement) {
					myJMenu.add(myJMenuItem);
					addElement = false;
				}
				if (EMenu.values()[i].isSeparatorBelow()) {
					myJMenu.add(new JSeparator());
				}
				break;
			}
			default: {
				System.out.println("unexpected event in setMenu...");
				break;
			}
			}

			frame.setJMenuBar(myJMenuBar);

		}
	}
	
	@SuppressWarnings("unused")
	public static void checkNumberOfCoffeeDispensers() {
		/**
		 * TODO create more rooms by array of frames, add arrows to navigate
		 */
		if (NUMBEROFCOFFEEDISPENSER > 5) {
			JOptionPane.showMessageDialog(null, "Danger! A person who probably likes 42 has manipulated the interface above its limits.\n\nYou can get more rooms for money. ;-)\n\nprogram will terminate...", "Warning Number Of CoffeeDispensers",
					JOptionPane.WARNING_MESSAGE, ICONWARNING);
			System.exit(0);
		}
	}

	public static Font getDig7() {
		return dig7;
	}

	public static void setDig7(Font dig7) {
		GUICafeteria.dig7 = dig7;
	}

	public static JTextField[] getTxfsCup() {
		return txfsCup;
	}

	public static void setTxfsCup(JTextField[] txfsCup) {
		GUICafeteria.txfsCup = txfsCup;
	}

	public static JProgressBar[] getPgbsVolume() {
		return pgbsVolume;
	}

	public static void setPgbsVolume(JProgressBar[] pgbsVolume) {
		GUICafeteria.pgbsVolume = pgbsVolume;
	}

	public static JTextField[] getTxfsWaitTime() {
		return txfsWaitTime;
	}

	public static void setTxfsWaitTime(JTextField[] txfsWaitTime) {
		GUICafeteria.txfsWaitTime = txfsWaitTime;
	}

	public static JTextField[] getTxfsCupVolume() {
		return txfsCupVolume;
	}

	public static void setTxfsCupVolume(JTextField[] txfsCupVolume) {
		GUICafeteria.txfsCupVolume = txfsCupVolume;
	}

	public static JTextField[] getTxfsDisplayCurrentVolume() {
		return txfsDisplayCurrentVolume;
	}

	public static void setTxfsDisplayCurrentVolume(JTextField[] txfsDisplayCurrentVolume) {
		GUICafeteria.txfsDisplayCurrentVolume = txfsDisplayCurrentVolume;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JFrame getStartFrame() {
		return startFrame;
	}

	public void setStartFrame(JFrame startFrame) {
		this.startFrame = startFrame;
	}

	public JButton getBtnStartSim() {
		return btnStartSim;
	}

	public void setBtnStartSim(JButton btnStartSim) {
		this.btnStartSim = btnStartSim;
	}

	public JMenuBar getMyJMenuBar() {
		return myJMenuBar;
	}

	public void setMyJMenuBar(JMenuBar myJMenuBar) {
		this.myJMenuBar = myJMenuBar;
	}

	public JMenu getMyJMenu() {
		return myJMenu;
	}

	public void setMyJMenu(JMenu myJMenu) {
		this.myJMenu = myJMenu;
	}

	public JMenuItem getMyJMenuItem() {
		return myJMenuItem;
	}

	public void setMyJMenuItem(JMenuItem myJMenuItem) {
		this.myJMenuItem = myJMenuItem;
	}

	public int getMyMenuLevel() {
		return myMenuLevel;
	}

	public void setMyMenuLevel(int myMenuLevel) {
		this.myMenuLevel = myMenuLevel;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JLayeredPane getLayeredPane() {
		return layeredPane;
	}

	public void setLayeredPane(JLayeredPane layeredPane) {
		this.layeredPane = layeredPane;
	}

	public JLabel[] getLblsAbout() {
		return lblsAbout;
	}

	public void setLblsAbout(JLabel[] lblsAbout) {
		this.lblsAbout = lblsAbout;
	}

	public Component getC() {
		return c;
	}

	public void setC(Component c) {
		this.c = c;
	}

	public boolean isInitFinished() {
		return initFinished;
	}

	public void setInitFinished(boolean initFinished) {
		this.initFinished = initFinished;
	}

	public JLabel getLblPauseInfo() {
		return lblPauseInfo;
	}

	public void setLblPauseInfo(JLabel lblPauseInfo) {
		this.lblPauseInfo = lblPauseInfo;
	}

	@Override
	public String toString() {
		return "GUICafeteria [c=" + c + ", initFinished=" + initFinished + ", startFrame=" + startFrame
				+ ", btnStartSim=" + btnStartSim + ", frame=" + frame + ", contentPane=" + contentPane
				+ ", layeredPane=" + layeredPane + ", myJMenuBar=" + myJMenuBar + ", myJMenu=" + myJMenu
				+ ", myJMenuItem=" + myJMenuItem + ", myMenuLevel=" + myMenuLevel + ", lblsAbout="
				+ Arrays.toString(lblsAbout) + ", lblPauseInfo=" + lblPauseInfo + ", getStartFrame()=" + getStartFrame()
				+ ", getBtnStartSim()=" + getBtnStartSim() + ", getMyJMenuBar()=" + getMyJMenuBar() + ", getMyJMenu()="
				+ getMyJMenu() + ", getMyJMenuItem()=" + getMyJMenuItem() + ", getMyMenuLevel()=" + getMyMenuLevel()
				+ ", getFrame()=" + getFrame() + ", getContentPane()=" + getContentPane() + ", getLayeredPane()="
				+ getLayeredPane() + ", getLblsAbout()=" + Arrays.toString(getLblsAbout()) + ", getC()=" + getC()
				+ ", isInitFinished()=" + isInitFinished() + ", getLblPauseInfo()=" + getLblPauseInfo() + "]";
	}

}
