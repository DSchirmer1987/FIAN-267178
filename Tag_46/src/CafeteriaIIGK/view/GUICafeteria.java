package CafeteriaIIGK.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import java.io.File;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComponent;
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

import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import CafeteriaIIGK.model.ECup;
import CafeteriaIIGK.model.IDrinkingCoffee;

public class GUICafeteria extends JFrame implements IDrinkingCoffee {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * attributes for the GUI with coefficients for more variability
	 */
	private static JFrame startFrame;
	private static JFrame frame;
	private static JPanel startContentPane;
	private static JPanel startPanel;
	private static JPanel contentPane;
	private static JLayeredPane layeredPane;

	private static JPanel pnlSimulation = new JPanel();
	private static JPanel pnlKA1 = new JPanel();
	private static JPanel pnlKA2 = new JPanel();
	private static JPanel pnlKA3 = new JPanel();
	private static JPanel pnlKA4 = new JPanel();
	private static JPanel pnlKA5 = new JPanel();

	private static JButton btnStartSim;

	private static JButton[] btnsPause = new JButton[NUMBEROFCOFFEEDISPENSER];
	private static JLabel[] lblsAbout = new JLabel[NUMBEROFCOFFEEDISPENSER];

	private static JMenuBar mnbSim = new JMenuBar();
	private static JMenu mnuSim = new JMenu("Simulation");
	private static JMenuItem mniRestart = new JMenuItem("Restart");
	private static JMenuItem mniPause = new JMenuItem("Pause Simulation");
	private static JMenuItem mniEnd = new JMenuItem("End");

	private static JMenu mnuAbout = new JMenu("About");
	private static JMenuItem mniAuthor = new JMenuItem("Author");
	private static JMenuItem mniSizeOfCup = new JMenuItem("Size Of Cup");
	private static JMenuItem mniNoOfCoffeeDispensers = new JMenuItem("Number Of Coffeedispensers");

	private static JProgressBar[] pgbsVolume = new JProgressBar[NUMBEROFCOFFEEDISPENSER];

	private static JLabel lblImageSimulation = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblImageKA1 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblImageKA2 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblImageKA3 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblImageKA4 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblImageKA5 = new JLabel("", SwingConstants.CENTER);

	private static JLabel lblKA1 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblKA2 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblKA3 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblKA4 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblKA5 = new JLabel("", SwingConstants.CENTER);

	private static JLabel lblKKA1 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblKKA2 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblKKA3 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblKKA4 = new JLabel("", SwingConstants.CENTER);
	private static JLabel lblKKA5 = new JLabel("", SwingConstants.CENTER);

	private static JTextField txfKA1 = new JTextField();
	private static JTextField txfKA2 = new JTextField();
	private static JTextField txfKA3 = new JTextField();
	private static JTextField txfKA4 = new JTextField();
	private static JTextField txfKA5 = new JTextField();

	private static JLabel[] lbls = new JLabel[NUMBEROFCOFFEEDISPENSER];

	private static JTextField[] txfs = new JTextField[NUMBEROFCOFFEEDISPENSER];
	private static JTextField[] txfsCup = new JTextField[NUMBEROFCOFFEEDISPENSER];
	private static JTextField[] txfsCupVolume = new JTextField[NUMBEROFCOFFEEDISPENSER];
	private static JTextField[] txfsWaitTime = new JTextField[NUMBEROFCOFFEEDISPENSER];

	private static Font dig7;

	public void init() {
		startWindow();
	}

	public void startSim() {
		initWindow();
	}

	private void startWindow() {
		startFrame = new JFrame();
		startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startFrame.setBounds(STARTLEFT, STARTTOP, STARTFRAMEWIDTH, STARTFRAMEHEIGHT);
		startFrame.setResizable(false);
		startFrame.setTitle(SIMTITLE);
		startFrame.setVisible(true);
		startFrame.setLayout(null);

		startContentPane = new JPanel();
		startContentPane.setBounds(0, 0, startFrame.getWidth(), startFrame.getHeight());
		startContentPane.setBackground(new Color(176, 200, 200));
		startFrame.setContentPane(startContentPane);
		startContentPane.setLayout(null);

		btnStartSim = new JButton();
		btnStartSim.setBounds(startContentPane.getX() + INS, startContentPane.getY() + INS,
				startContentPane.getWidth() - 3 * INS, startContentPane.getHeight() - 6 * INS);
		btnStartSim.setText("Pausenraum-Simulation");
		startContentPane.add(btnStartSim);
	}

	private void initWindow() {

		/**
		 * strange effects with using UIManager.getSystemLookAndFeelClassName()
		 * menu will have overlay with text fields
		 */
//		try {
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		setFont();

		/**
		 * setAlwaysOnTop(true) and left, top useful for testing purposes
		 */
//		setAlwaysOnTop(true);
		frame = new JFrame();

		setMenu();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(LEFT, TOP, FRAMEWIDTH, FRAMEHEIGHT);

		frame.setResizable(false);
		frame.setTitle(SIMTITLE);
		frame.setVisible(true);

		contentPane = new JPanel();
		contentPane.setName("contentPane");
		contentPane.setBounds(0, 0, FRAMEWIDTH, FRAMEHEIGHT);

		contentPane.setOpaque(true);
		contentPane.setBackground(new Color(176, 200, 200));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

//		initFont();
		createGUIObjects();

	}

	private void createGUIObjects() {
		/**
		 * layeredPane for objects to control visibility free from order of creation
		 */
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, FRAMEWIDTH, FRAMEHEIGHT);
		contentPane.add(layeredPane);


		MyGUIObject[] o = new MyGUIObject[] {

				/**
				 * all objects in order of their structure and appearance for better orientation
				 * the values for setBounds(left, top, width, height) are depending from other
				 * objects, so that it will be easy to change one value with effects on many
				 * other objects
				 * 
				 * @parameters: object, name, [text], left, top, width, height, layer
				 */

				/**
				 * create panels
				 */
				new MyGUIObject(pnlSimulation, "pnlSimulation", INS, INS, (int) (FRAMEWIDTH - 3 * INS),
						(int) (FRAMEHEIGHT - 6 * INS), 0),


				/**
				 * for panel Simulation
				 */
				new MyGUIObject(lblImageSimulation, "lblImageSimulation", "", pnlSimulation.getX(),
						pnlSimulation.getY(), pnlSimulation.getWidth(), pnlSimulation.getHeight(), 1),

				/**
				 * for panels coffeeDispenser
				 */


		};

		for (int i = 0; i < o.length; i++) {
			JComponent c = null;
			String s = o[i].toString().substring(0, 200);

			if (s.contains("JPanel")) {
				c = o[i].getPnl();


			} else if (s.contains("JButton")) {
				c = o[i].getBtn();

			} else if (s.contains("JLabel")) {
				c = o[i].getLbl();



			} else if (s.contains("JSlider")) {
				c = o[i].getSli();

			} else if (s.contains("JTextField")) {
				c = o[i].getTxf();

			} else if (s.contains("JTextPane")) {
				c = o[i].getTxp();
			}


			if (!s.contains("JList")) {
				layeredPane.add(c, Integer.valueOf(o[i].getLayer()));
			}

			lblImageSimulation.setIcon(ICONCAFETERIA);


			JPanel[] pnls = new JPanel[] { pnlKA1, pnlKA2, pnlKA3, pnlKA4, pnlKA5 };

			JLabel[] lblsImageCup = new JLabel[NUMBEROFCOFFEEDISPENSER];

			JLabel[] lblsImage = new JLabel[] { lblImageKA1, lblImageKA2, lblImageKA3, lblImageKA4, lblImageKA5 };

			JLabel[] lblsK = new JLabel[] { lblKKA1, lblKKA2, lblKKA3, lblKKA4, lblKKA5 };

			for (int ic = 0; ic < NUMBEROFCOFFEEDISPENSER; ic++) {

				lblsAbout[ic] = new JLabel();
				lblsAbout[ic].setName("lblAbout" + (ic + 1));

				lbls[ic] = new JLabel();
				lbls[ic].setName("lbl" + (ic + 1));

				txfs[ic] = new JTextField();
				txfs[ic].setName("txf" + (ic + 1));

				lblsImageCup[ic] = new JLabel();
				lblsImageCup[ic].setName("lblImageCup" + (ic + 1));
				txfsCup[ic] = new JTextField();
				txfsCup[ic].setName("txfCup" + (ic + 1));

				txfsCupVolume[ic] = new JTextField();
				txfsCupVolume[ic].setName("txfCupVolume" + (ic + 1));

				pgbsVolume[ic] = new JProgressBar(SwingConstants.VERTICAL);
				pgbsVolume[ic].setName("pgbVolume" + (ic + 1));

				txfsWaitTime[ic] = new JTextField();
				txfsWaitTime[ic].setName("txfWaitTime" + (ic + 1));

				btnsPause[ic] = new JButton();
				btnsPause[ic].setName("btn" + (ic + 1));

			}

			for (int i1 = 0; i1 < pnls.length; i1++) {
				MyGUIObject oPnl = new MyGUIObject(pnls[i1], pnls[i1].getName(),
						pnlSimulation.getX() + 275 + (i1 * (int) ((pnlSimulation.getWidth() / 9) + INSSMALL))
								+ INSSMALL,
						pnlSimulation.getY() + 200, (int) (pnlSimulation.getWidth() / 9) + INSSMALL,
						(int) (pnlSimulation.getHeight() / 2) - 50, 1);
				MyGUIObject oLblImage = new MyGUIObject(lblsImage[i1], lblsImage[i1].getName(), "", pnls[i1].getX(),
						pnls[i1].getY(), pnls[i1].getWidth(), pnls[i1].getHeight(), 2);

				MyGUIObject oLbl = new MyGUIObject(lblsK[i1], lblsK[i1].getName(), "KA " + (i1 + 1),
						pnls[i1].getX() + 4 * INS, pnls[i1].getY() + INS, pnls[i1].getWidth() - 2 * INS, 20, 3);

				MyGUIObject oLbl2 = new MyGUIObject(lbls[i1], lbls[i1].getName(), "KA " + (i1 + 1),
						(int) (pnls[i1].getX() + INS + INSSMALL / 2), pnls[i1].getY() - 9 * INS - INSSMALL,
						pnls[i1].getWidth() - 2 * INS, 20, 4);

				MyGUIObject oTxf = new MyGUIObject(txfs[i1], txfs[i1].getName(), MAXVOLUMEDISPENSER + " ml",
						(int) (pnls[i1].getX() + INS + INSSMALL / 2), pnls[i1].getY() - 8 * INS,
						pnls[i1].getWidth() - 2 * INS, 20, 2);
				MyGUIObject oLblImageCup = new MyGUIObject(lblsImageCup[i1], lblsImageCup[i1].getName(), "",
						pnls[i1].getX() + 2 * INS, pnlSimulation.getY() - INS + INSSMALL, pnls[i1].getWidth(),
						5 * INS + INSSMALL, 2);
				MyGUIObject oTxfCup = new MyGUIObject(txfsCup[i1], txfsCup[i1].getName(), "",
						lblsImageCup[i1].getX() - 2 * INS - INSSMALL, lblsImageCup[i1].getY() + INS,
						lblsImageCup[i1].getWidth() - 4 * INS, 3 * INS, 3);

				MyGUIObject oTxfCupVolume = new MyGUIObject(txfsCupVolume[i1], txfsCupVolume[i1].getName(), "",
						lblsImageCup[i1].getX() + 4 * INS, lblsImageCup[i1].getY() + 4 * INS - INSSMALL, 3 * INS, INS,
						4);

				MyGUIObject oPgbVolume = new MyGUIObject(pgbsVolume[i1], pgbsVolume[i1].getName(),
						pnls[i1].getX() + 8 * INS, pnls[i1].getY() + 9 * INS, 2 * INSSMALL, 4 * INS, 3);

				MyGUIObject oTxfWaitTime = new MyGUIObject(txfsWaitTime[i1], txfsWaitTime[i1].getName(), "",
						pnls[i1].getX() + 2 * INS - (int) 1.5 * INSSMALL, pnls[i1].getY() + 9 * INS - INSSMALL, 4 * INS,
						(int) 2.5 * INSSMALL, 3);

				MyGUIObject oBtn = new MyGUIObject(btnsPause[i1], btnsPause[i1].getName(), "Pause",
						pnls[i1].getX() + 2 * INS - (int) 1.5 * INSSMALL, pnls[i1].getY() + pnls[i1].getHeight(),
						6 * INS, 2 * INS, 2);

				MyGUIObject oLblAbout = new MyGUIObject(lblsAbout[i1], lblsAbout[i1].getName(), "",
						pnls[i1].getX() - 7 * INS, pnls[i1].getY() + pnls[i1].getHeight() + INS, 8 * INS, 10 * INS, 2);

				/**
				 * TODO loop for better style
				 */
				JComponent cPnl = oPnl.getPnl();
				JComponent cLblImage = oLblImage.getLbl();
				JComponent cLbl2 = oLbl2.getLbl();
				JComponent cLbl = oLbl.getLbl();
				JComponent cTxf = oTxf.getTxf();
				JComponent cLblAbout = oLblAbout.getLbl();

				JComponent cLblImageCup = oLblImageCup.getLbl();
				JComponent cTxfCup = oTxfCup.getTxf();
				JComponent cTxfCupVolume = oTxfCupVolume.getTxf();
				JComponent cPgbVolume = oPgbVolume.getPgb();
				JComponent cTxfWaitTime = oTxfWaitTime.getTxf();

				JComponent cBtnPause = oBtn.getBtn();

				cTxfWaitTime.setBackground(new Color(140, 200, 255));
				cTxfWaitTime.setFont(new Font(cTxfWaitTime.getFont().getName(), Font.PLAIN, 8));
				cTxfWaitTime.setBorder(new EmptyBorder(0, 0, 1, 1));

				cTxfCupVolume.setBorder(new EmptyBorder(0, 0, 1, 1));
				cTxfCupVolume.setOpaque(false);

				cLbl.setForeground(Color.lightGray);
				cLbl.setFont(dig7);

				cLbl2.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				cLbl2.setForeground(Color.darkGray);
				cTxf.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
				cTxf.setOpaque(true);
				cTxf.setBackground(new Color(30, 200, 225));
				Font dig7New = dig7.deriveFont(Font.BOLD, 16);
				GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(dig7New);

				cLblAbout.setVisible(false);

				cTxf.setFont(dig7New);
				cTxfCup.setOpaque(false);
				cTxfCup.setForeground(Color.gray);

				cTxfCup.setFont(new Font(cTxfCup.getFont().getName(), Font.BOLD, 36));
				
				cBtnPause.setBackground(new Color(90, 210, 165));
				
				layeredPane.add(cTxf, Integer.valueOf(oTxf.getLayer()));

				layeredPane.add(cTxfWaitTime, Integer.valueOf(oTxfWaitTime.getLayer()));

				layeredPane.add(cLblImage, Integer.valueOf(oLblImage.getLayer()));
				layeredPane.add(cLbl, Integer.valueOf(oLbl.getLayer()));
				layeredPane.add(cLbl2, Integer.valueOf(oLbl2.getLayer()));

				if (i1 == 0) {
					layeredPane.add(cLblAbout, Integer.valueOf(oLblAbout.getLayer()));
				} else {
					layeredPane.add(cLblAbout, Integer.valueOf(oLblAbout.getLayer() + 1));
				}

				layeredPane.add(cTxfCup, Integer.valueOf(oTxfCup.getLayer()));
				layeredPane.add(cTxfCupVolume, Integer.valueOf(oTxfCupVolume.getLayer()));

				layeredPane.add(cLblImageCup, Integer.valueOf(oLblImageCup.getLayer()));
				layeredPane.add(cBtnPause, Integer.valueOf(oLblImageCup.getLayer()));

				layeredPane.add(cPnl, Integer.valueOf(oPnl.getLayer()));

				layeredPane.add(cPgbVolume, Integer.valueOf(4));

				lblsImage[i1].setIcon(ICONCOFFEEDISPENSER);
				lblsImageCup[i1].setIcon(ICONCUP);

			}

			lblsAbout[0].setBounds(INS, btnsPause[0].getY() - 2 * INS, 14 * INS, 20 * INS);
			
			Icon[] boardContent = new Icon[] {ICONBOARD, ICONAUTHOR, ICONSIZEOFCUPS, ICONNUMBEROFCOFFEEDISPENSERS, ICONPAUSE};

			for(int bc = 0; bc < boardContent.length;bc++) {
				lblsAbout[bc].setVisible(false);
				lblsAbout[bc].setBounds(lblsAbout[0].getX() + INS + INSSMALL, lblsAbout[0].getY() - INS,
						lblsAbout[0].getWidth(), lblsAbout[0].getHeight());
				lblsAbout[bc].setIcon(boardContent[bc]);
			}
			
			lblsAbout[0].setVisible(true);

			/**
			 * to avoid caret
			 */
			JTextField tmp = new JTextField();
			layeredPane.add(tmp, Integer.valueOf(0));

			startFrame.dispose();
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

	private void setMenu() {
		mnbSim.add(mnuSim);

		JMenuItem[] mnis = new JMenuItem[] { mniRestart, mniPause, mniEnd, mnuAbout };

		for (int i = 0; i < mnis.length; i++) {
			mnuSim.add(mnis[i]);
			if (mnis[i].getText().equals("End")) {
				mnuSim.add(new JSeparator());
			}
		}

		JMenuItem[] mnisAbout = new JMenuItem[] { mniAuthor, mniSizeOfCup, mniNoOfCoffeeDispensers };

		for (int i = 0; i < mnisAbout.length; i++) {
			mnuAbout.add(mnisAbout[i]);
		}

		frame.setJMenuBar(mnbSim);

	}
	
	public static void setBoardEmpty() {
		for (int i = 1; i < GUICafeteria.getLblsAbout().length; i++) {
			GUICafeteria.getLblsAbout()[i].setVisible(false);
		}
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
		GUICafeteria.getTxfs()[iCD].setText("fill up...");
		GUICafeteria.getTxfs()[iCD].update(GUICafeteria.getTxfs()[iCD].getGraphics());

	}

	public static void printContinueWorking(int iCD) {
		GUICafeteria.getTxfs()[iCD].setText("continue...");
		GUICafeteria.getTxfs()[iCD].update(GUICafeteria.getTxfs()[iCD].getGraphics());
	}

	public static void printCupOfCoffeeVolume(int iCD, int volumeKA, String cupOfCoffeeSize) {
		GUICafeteria.getTxfs()[iCD].setText(volumeKA + " ml");
		GUICafeteria.getTxfs()[iCD].update(GUICafeteria.getTxfs()[iCD].getGraphics());
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

		while (pauseTime < 1|| pauseTime > 180) {
			String strPauseTime = (String) JOptionPane.showInputDialog(null, "Please enter pause time ("+ MINPAUSETIME + "- "+ MAXPAUSETIME + " (in seconds)): ",
					"Setting Pause Time", JOptionPane.QUESTION_MESSAGE, ICONMSG, null, "42");
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

	public static JFrame getStartFrame() {
		return startFrame;
	}

	public static void setStartFrame(JFrame startFrame) {
		GUICafeteria.startFrame = startFrame;
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static void setFrame(JFrame frame) {
		GUICafeteria.frame = frame;
	}

	public static JPanel getStartContentPane() {
		return startContentPane;
	}

	public static void setStartContentPane(JPanel startContentPane) {
		GUICafeteria.startContentPane = startContentPane;
	}

	public static JPanel getStartPanel() {
		return startPanel;
	}

	public static void setStartPanel(JPanel startPanel) {
		GUICafeteria.startPanel = startPanel;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public static void setContentPane(JPanel contentPane) {
		GUICafeteria.contentPane = contentPane;
	}

	public JLayeredPane getLayeredPane() {
		return layeredPane;
	}

	public void setLayeredPane(JLayeredPane layeredPane) {
		GUICafeteria.layeredPane = layeredPane;
	}

	public static JPanel getPnlSimulation() {
		return pnlSimulation;
	}

	public static void setPnlSimulation(JPanel pnlSimulation) {
		GUICafeteria.pnlSimulation = pnlSimulation;
	}

	public static JPanel getPnlKA1() {
		return pnlKA1;
	}

	public static void setPnlKA1(JPanel pnlKA1) {
		GUICafeteria.pnlKA1 = pnlKA1;
	}

	public static JPanel getPnlKA2() {
		return pnlKA2;
	}

	public static void setPnlKA2(JPanel pnlKA2) {
		GUICafeteria.pnlKA2 = pnlKA2;
	}

	public static JPanel getPnlKA3() {
		return pnlKA3;
	}

	public static void setPnlKA3(JPanel pnlKA3) {
		GUICafeteria.pnlKA3 = pnlKA3;
	}

	public static JPanel getPnlKA4() {
		return pnlKA4;
	}

	public static void setPnlKA4(JPanel pnlKA4) {
		GUICafeteria.pnlKA4 = pnlKA4;
	}

	public static JPanel getPnlKA5() {
		return pnlKA5;
	}

	public static void setPnlKA5(JPanel pnlKA5) {
		GUICafeteria.pnlKA5 = pnlKA5;
	}

	public static JButton getBtnStartSim() {
		return btnStartSim;
	}

	public static void setBtnStartSim(JButton btnStartSim) {
		GUICafeteria.btnStartSim = btnStartSim;
	}

	public static JLabel getLblImageSimulation() {
		return lblImageSimulation;
	}

	public static void setLblImageSimulation(JLabel lblImageSimulation) {
		GUICafeteria.lblImageSimulation = lblImageSimulation;
	}

	public static JLabel getLblImageKA1() {
		return lblImageKA1;
	}

	public static void setLblImageKA1(JLabel lblImageKA1) {
		GUICafeteria.lblImageKA1 = lblImageKA1;
	}

	public static JLabel getLblImageKA2() {
		return lblImageKA2;
	}

	public static void setLblImageKA2(JLabel lblImageKA2) {
		GUICafeteria.lblImageKA2 = lblImageKA2;
	}

	public static JLabel getLblImageKA3() {
		return lblImageKA3;
	}

	public static void setLblImageKA3(JLabel lblImageKA3) {
		GUICafeteria.lblImageKA3 = lblImageKA3;
	}

	public static JLabel getLblImageKA4() {
		return lblImageKA4;
	}

	public static void setLblImageKA4(JLabel lblImageKA4) {
		GUICafeteria.lblImageKA4 = lblImageKA4;
	}

	public static JLabel getLblImageKA5() {
		return lblImageKA5;
	}

	public static void setLblImageKA5(JLabel lblImageKA5) {
		GUICafeteria.lblImageKA5 = lblImageKA5;
	}

	public static JLabel getLblKA1() {
		return lblKA1;
	}

	public static void setLblKA1(JLabel lblKA1) {
		GUICafeteria.lblKA1 = lblKA1;
	}

	public static JLabel getLblKA2() {
		return lblKA2;
	}

	public static void setLblKA2(JLabel lblKA2) {
		GUICafeteria.lblKA2 = lblKA2;
	}

	public static JLabel getLblKA3() {
		return lblKA3;
	}

	public static void setLblKA3(JLabel lblKA3) {
		GUICafeteria.lblKA3 = lblKA3;
	}

	public static JLabel getLblKA4() {
		return lblKA4;
	}

	public static void setLblKA4(JLabel lblKA4) {
		GUICafeteria.lblKA4 = lblKA4;
	}

	public static JLabel getLblKA5() {
		return lblKA5;
	}

	public static void setLblKA5(JLabel lblKA5) {
		GUICafeteria.lblKA5 = lblKA5;
	}

	public static JTextField getTxfKA1() {
		return txfKA1;
	}

	public static void setTxfKA1(JTextField txfKA1) {
		GUICafeteria.txfKA1 = txfKA1;
	}

	public static JTextField getTxfKA2() {
		return txfKA2;
	}

	public static void setTxfKA2(JTextField txfKA2) {
		GUICafeteria.txfKA2 = txfKA2;
	}

	public static JTextField getTxfKA3() {
		return txfKA3;
	}

	public static void setTxfKA3(JTextField txfKA3) {
		GUICafeteria.txfKA3 = txfKA3;
	}

	public static JTextField getTxfKA4() {
		return txfKA4;
	}

	public static void setTxfKA4(JTextField txfKA4) {
		GUICafeteria.txfKA4 = txfKA4;
	}

	public static JTextField getTxfKA5() {
		return txfKA5;
	}

	public static void setTxfKA5(JTextField txfKA5) {
		GUICafeteria.txfKA5 = txfKA5;
	}

	

	public static Font getDig7() {
		return dig7;
	}

	public static void setDig7(Font dig7) {
		GUICafeteria.dig7 = dig7;
	}

	public static JMenuBar getMnbSim() {
		return mnbSim;
	}

	public static void setMnbSim(JMenuBar mnbSim) {
		GUICafeteria.mnbSim = mnbSim;
	}

	public static JMenu getMnuSim() {
		return mnuSim;
	}

	public static void setMnuSim(JMenu mnuSim) {
		GUICafeteria.mnuSim = mnuSim;
	}

	public static JMenuItem getMniRestart() {
		return mniRestart;
	}

	public static void setMniRestart(JMenuItem mniRestart) {
		GUICafeteria.mniRestart = mniRestart;
	}

	public static JMenuItem getMniPause() {
		return mniPause;
	}

	public static void setMniPause(JMenuItem mniPause) {
		GUICafeteria.mniPause = mniPause;
	}

	public static JMenuItem getMniEnd() {
		return mniEnd;
	}

	public static void setMniEnd(JMenuItem mniEnd) {
		GUICafeteria.mniEnd = mniEnd;
	}

	public static JMenu getMnuAbout() {
		return mnuAbout;
	}

	public static void setMniAbout(JMenu mnuAbout) {
		GUICafeteria.mnuAbout = mnuAbout;
	}

	public static JLabel getLblKKA1() {
		return lblKKA1;
	}

	public static void setLblKKA1(JLabel lblKKA1) {
		GUICafeteria.lblKKA1 = lblKKA1;
	}

	public static JLabel getLblKKA2() {
		return lblKKA2;
	}

	public static void setLblKKA2(JLabel lblKKA2) {
		GUICafeteria.lblKKA2 = lblKKA2;
	}

	public static JLabel getLblKKA3() {
		return lblKKA3;
	}

	public static void setLblKKA3(JLabel lblKKA3) {
		GUICafeteria.lblKKA3 = lblKKA3;
	}

	public static JLabel getLblKKA4() {
		return lblKKA4;
	}

	public static void setLblKKA4(JLabel lblKKA4) {
		GUICafeteria.lblKKA4 = lblKKA4;
	}

	public static JLabel getLblKKA5() {
		return lblKKA5;
	}

	public static void setLblKKA5(JLabel lblKKA5) {
		GUICafeteria.lblKKA5 = lblKKA5;
	}

	public static JMenuItem getMniAuthor() {
		return mniAuthor;
	}

	public static void setMniAuthor(JMenuItem mniAuthor) {
		GUICafeteria.mniAuthor = mniAuthor;
	}

	public static JMenuItem getMniSizeOfCup() {
		return mniSizeOfCup;
	}

	public static void setMniSizeOfCup(JMenuItem mniSizeOfCup) {
		GUICafeteria.mniSizeOfCup = mniSizeOfCup;
	}

	public static JMenuItem getMniNoOfCoffeeDispensers() {
		return mniNoOfCoffeeDispensers;
	}

	public static void setMniNoOfCoffeeDispensers(JMenuItem mniNoOfCoffeeDispensers) {
		GUICafeteria.mniNoOfCoffeeDispensers = mniNoOfCoffeeDispensers;
	}

	public static JTextField[] getTxfsCup() {
		return txfsCup;
	}

	public static void setTxfsCup(JTextField[] txfsCup) {
		GUICafeteria.txfsCup = txfsCup;
	}

	public static void setMnuAbout(JMenu mnuAbout) {
		GUICafeteria.mnuAbout = mnuAbout;
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

	public static JTextField[] getTxfs() {
		return txfs;
	}

	public static void setTxfs(JTextField[] txfs) {
		GUICafeteria.txfs = txfs;
	}

	public static JLabel[] getLbls() {
		return lbls;
	}

	public static void setLbls(JLabel[] lbls) {
		GUICafeteria.lbls = lbls;
	}

	public static JButton[] getBtnsPause() {
		return btnsPause;
	}

	public static void setBtnsPause(JButton[] btnsPause) {
		GUICafeteria.btnsPause = btnsPause;
	}

	public static JLabel[] getLblsAbout() {
		return lblsAbout;
	}

	public static void setLblsAbout(JLabel[] lblsAbout) {
		GUICafeteria.lblsAbout = lblsAbout;
	}

}
