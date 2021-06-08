package guidemos;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame extends JFrame {
	
	private class MyDispatcher implements KeyEventDispatcher{
		@Override
		public boolean dispatchKeyEvent(KeyEvent e) {
			if(e.getID() == KeyEvent.KEY_PRESSED) {
				System.out.println("Typed");
			} else if (e.getID() == KeyEvent.KEY_RELEASED) {
				System.out.println("Released");
			} else if (e.getID() == KeyEvent.KEY_TYPED) {
				System.out.println("Typed");
			}
			return false;
		}
	}
	
	public MyJFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 480);
		this.setTitle("Demo JFrame");
		this.setLocationRelativeTo(null);
		KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		manager.addKeyEventDispatcher(new MyDispatcher());
	}


}


