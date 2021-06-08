package guidemos;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyJFrame extends JFrame{

	public MyJFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(640, 480);
		this.setTitle("Demo JFrame");
		this.setLocationRelativeTo(null);
	}
}
