package graphicdemo;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class GraphicApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mixed Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLayout(new GridLayout(0,2));
		frame.setSize(640,480);
//		frame.add(new StrichmannPanel());
		frame.add(new StrichmannPanel());
		
		frame.setVisible(true);

	}

}
