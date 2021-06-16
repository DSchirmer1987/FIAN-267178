package layoutdemos;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDemo {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("BorderlayoutDemo");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jframe.setLayout(new BorderLayout());
		JButton button = new JButton("Button");
		JPanel panel = new JPanel();
		panel.setSize(20, 156);
		panel.add(button);
		
		jframe.add(new JButton("Button"), BorderLayout.NORTH);
		jframe.add(new JButton("Button2"), BorderLayout.SOUTH);
		jframe.add(new JButton("Button3"), BorderLayout.WEST);
		jframe.add(new JButton("Button4"), BorderLayout.EAST);
		jframe.add(panel);
		
		jframe.setSize(640, 480);
		jframe.setVisible(true);
	}

}
