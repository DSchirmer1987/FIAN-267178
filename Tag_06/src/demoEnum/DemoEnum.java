package demoEnum;

import javax.swing.JFrame;

public class DemoEnum {
	public static void main(String[] args) {
		Resolution res = Resolution.Large;
		// Nicht möglich mit Enums
//		res = new Resolution(125,125);
		
		JFrame frame = new JFrame();
		frame.setTitle("Fenster");
		frame.setSize(res.getWidth(), res.getHeight());
		frame.setVisible(true);
		
		System.out.println(res);
		System.out.println(res.getHeight());
	}
}
