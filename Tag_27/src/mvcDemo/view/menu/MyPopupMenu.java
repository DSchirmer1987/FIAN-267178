package mvcDemo.view.menu;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class MyPopupMenu extends JPopupMenu {

	private JMenuItem mniOpen = new JMenuItem("Open File");
	private JMenuItem mniSave = new JMenuItem("Save File");
	
	public MyPopupMenu() {
		this.add(mniOpen);
		this.add(mniSave);
	}
	
}
