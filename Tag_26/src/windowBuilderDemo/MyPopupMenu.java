package windowBuilderDemo;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class MyPopupMenu extends JPopupMenu {
	
	private JMenuItem open = new JMenuItem("Open File");
	private JMenuItem close= new JMenuItem("Close");
	
	public MyPopupMenu() {
		this.add(open);
		this.add(close);
	}
}
