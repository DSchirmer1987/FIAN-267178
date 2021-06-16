package layoutdemos;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BoxLayoutDemo {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("BoxlayoutDemo");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Button");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Button4");
		
//		button.setSize(200, 52);
//		button.setPreferredSize(new Dimension(200, 200));
		button.setMinimumSize(new Dimension(200, 200));
		button.setMaximumSize(new Dimension(300, 300));
		
		Box box = new Box(BoxLayout.X_AXIS);
		box.add(button);
		box.add(button2);
		box.add(button3);
		box.add(button4);
		
		jframe.add(box);
		jframe.setSize(640, 175);
		jframe.setVisible(true);
	}

}
