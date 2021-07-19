package kaffeeAutomaten.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuBar extends JMenuBar {

	private JMenu mnuFile = new JMenu("Menü");
	private JMenu mnuHelp = new JMenu("Help");
	private JMenuItem mniAbout = new JMenuItem("About");
	private JMenuItem mniStart = new JMenuItem("Neustart");
	private JMenuItem mniPause = new JMenuItem("Pause");
	private JMenuItem mniEnd = new JMenuItem("Beenden");
	private JMenuItem mniExit = new JMenuItem("Exit");
	
	private void init() {
		this.mnuFile.add(mniStart);
		this.mnuFile.add(mniPause);
		this.mnuFile.add(mniEnd);
		this.mnuFile.addSeparator();
		this.mnuFile.add(mniExit);
		
		this.mnuHelp.add(mniAbout);

		this.add(mnuFile);
		this.add(mnuHelp);
	}
	
	public MyMenuBar() {
		init();
	}
	
	
	
	
	
	
	

}
