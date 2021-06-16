package layoutdemos;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("FlowLayoutDemo");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Button");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Button4");
		
		button.setPreferredSize(new Dimension(100, 100));
		
		jframe.setLayout(new FlowLayout());
		
		jframe.add(button);
		jframe.add(button2);
		jframe.add(button3);
		jframe.add(button4);
		
		jframe.setSize(640, 175);
		jframe.setVisible(true);
	}

}
