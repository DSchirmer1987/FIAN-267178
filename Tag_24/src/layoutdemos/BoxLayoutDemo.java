package layoutdemos;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoxLayoutDemo {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("BoxlayoutDemo");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Button");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Button4");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

//		p2.setBackground(Color.BLACK);
		p2.add(new JLabel("Hallo"));
		p3.setBackground(Color.GREEN);
		
		
		
		p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
		p1.add(p2);
		p1.add(p3);
		
//		button.setSize(200, 52);
//		button.setPreferredSize(new Dimension(200, 200));
		button.setMinimumSize(new Dimension(200, 200));
		button.setMaximumSize(new Dimension(300, 300));
		
//		Box box = new Box(BoxLayout.X_AXIS);
//		box.add(button);
//		box.add(button2);
//		box.add(button3);
//		box.add(button4);
		jframe.setContentPane(p1);
//		jframe.add(box);
		jframe.setSize(640, 175);
		jframe.setVisible(true);
	}

}
