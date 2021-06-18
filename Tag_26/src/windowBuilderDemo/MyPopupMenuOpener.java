package windowBuilderDemo;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPopupMenuOpener extends MouseAdapter {

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.isPopupTrigger()) {
			MyPopupMenu pm = new MyPopupMenu();
			pm.show(e.getComponent(), e.getX(), e.getY());
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.isPopupTrigger()) {
			MyPopupMenu pm = new MyPopupMenu();
			pm.show(e.getComponent(), e.getX(), e.getY());
		}
	}
	
}
