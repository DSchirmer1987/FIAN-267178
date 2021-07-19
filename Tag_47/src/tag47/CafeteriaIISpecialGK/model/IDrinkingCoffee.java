package tag47.CafeteriaIISpecialGK.model;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public interface IDrinkingCoffee {
	
	/**
	 * configuration info
	 */
	Dimension
	SCREENSIZE = Toolkit.getDefaultToolkit().getScreenSize();
	
	String
	MAINPATH = "src/tag47/CafeteriaIISpecialGK/data/",
	AUTHOR = "GK",
	SIMNAME = "Pausenraum-Simulation", SIMTITLE = "Cafeteria II (Simulation) GK",
	MENUNAME = "Simulation", SUBMENUTEXT = "About",
	BTNSTARTTEXT = "Pausenraum-Simulation";
	
	int
	NUMBEROFCOFFEEDISPENSER = 2, MAXVOLUMEDISPENSER = 5000, PERIODOFFILLUP = 30000, INTERVAL = 1000,
	MINPAUSETIME = 1, MAXPAUSETIME = 180,
	STARTFRAMEWIDTH = 400, STARTFRAMEHEIGHT = 200, STARTLEFT = (int) (SCREENSIZE.getWidth()/2 - STARTFRAMEWIDTH/2), STARTTOP = (int) (SCREENSIZE.getHeight()/2 - STARTFRAMEHEIGHT/2),
	FRAMEWIDTH = 1350, FRAMEHEIGHT = 900, LEFT =(int) (SCREENSIZE.getWidth()/2 - FRAMEWIDTH/2), TOP = (int) (SCREENSIZE.getHeight()/2 - FRAMEHEIGHT/2),
	/**
	 * own insets
	 */
	INSSMALL = 5, INS = 15;
		
	Icon
	ICONCAFETERIA = new ImageIcon(MAINPATH + "icon/Cafeteria.png"), ICONCOFFEEDISPENSER = new ImageIcon(MAINPATH + "icon/CoffeeDispenser.png"),
	ICONCUP = new ImageIcon(MAINPATH + "icon/Cup.png"), ICONBOARD = new ImageIcon(MAINPATH + "icon/Board.png"),
	ICONAUTHOR = new ImageIcon(MAINPATH + "icon/Author.png"), ICONSIZEOFCUPS = new ImageIcon(MAINPATH + "icon/SizeOfCups.png"),
	ICONNUMBEROFCOFFEEDISPENSERS = new ImageIcon(MAINPATH + "icon/NumberOfCoffeeDispensers.png"), ICONPAUSE = new ImageIcon(MAINPATH + "icon/Pause.png"),
	ICONQUESTION = new ImageIcon(MAINPATH + "icon/CaPaQuestion.png"), ICONWARNING = new ImageIcon(MAINPATH + "icon/CaPaWarning.png");
	
	
	
	


}
