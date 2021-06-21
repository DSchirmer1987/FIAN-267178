package mvcDemo.view.menu;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuBar extends JMenuBar {

	private JMenu mnuFile = new JMenu("File");
	private JMenu mnuHelp = new JMenu("Help");
	private JMenuItem mniAbout = new JMenuItem("About");
	private JMenuItem mniNew = new JMenuItem("New");
	private JMenuItem mniOpen = new JMenuItem("Open File");
	private JMenuItem mniExit = new JMenuItem("Exit");
	
	
	public MyMenuBar() {
		init();
	}
	
	private void init() {
		this.mnuFile.add(mniNew);
		this.mnuFile.add(mniOpen);
		this.mnuFile.addSeparator();
		this.mnuFile.add(mniExit);
		
		this.mnuHelp.add(mniAbout);

		this.add(mnuFile);
		this.add(mnuHelp);
	}
}
