package CafeteriaIIGK.model;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.lang.management.ManagementFactory;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public interface IDrinkingCoffee {
	
	/**
	 * configuration info
	 */
	String MAINPATH = ManagementFactory.getRuntimeMXBean().getClassPath() + "/CafeteriaIIGK/data/";
	String AUTHOR = "GK";
	
	String SIMNAME = "Pausenraum-Simulation", SIMTITLE = "Cafeteria II (Simulation) GK";
	int NUMBEROFCOFFEEDISPENSER = 5;
	int MAXVOLUMEDISPENSER = 5000;
	int PERIODOFFILLUP = 30000;
	int INTERVAL = 1000;
	
	int MINPAUSETIME = 1, MAXPAUSETIME = 180;
	
	Icon ICONCAFETERIA = new ImageIcon(MAINPATH + "icon/Cafeteria.png");
	Icon ICONCOFFEEDISPENSER = new ImageIcon(MAINPATH + "icon/CoffeeDispenser.png");
	Icon ICONCUP = new ImageIcon(MAINPATH + "icon/Cup.png");
	
	Icon ICONBOARD = new ImageIcon(MAINPATH + "icon/Board.png");
	Icon ICONAUTHOR = new ImageIcon(MAINPATH + "icon/Author.png");
	Icon ICONSIZEOFCUPS = new ImageIcon(MAINPATH + "icon/SizeOfCups.png");
	Icon ICONNUMBEROFCOFFEEDISPENSERS = new ImageIcon(MAINPATH + "icon/NumberOfCoffeeDispensers.png");
	Icon ICONPAUSE = new ImageIcon(MAINPATH + "icon/Pause.png");
	
	Icon ICONMSG = new ImageIcon(MAINPATH + "icon/CaPa.png");
	
	
	Dimension SCREENSIZE = Toolkit.getDefaultToolkit().getScreenSize();
	int STARTFRAMEWIDTH = 400, STARTFRAMEHEIGHT = 200, STARTLEFT = (int) (SCREENSIZE.getWidth()/2 - STARTFRAMEWIDTH/2), STARTTOP = (int) (SCREENSIZE.getHeight()/2 - STARTFRAMEHEIGHT/2);
	int FRAMEWIDTH = 1350, FRAMEHEIGHT = 900, LEFT =(int) (SCREENSIZE.getWidth()/2 - FRAMEWIDTH/2), TOP = (int) (SCREENSIZE.getHeight()/2 - FRAMEHEIGHT/2);
	
	/**
	 * own insets
	 */
	int INSSMALL = 5, INS = 15;

}
