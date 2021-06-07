package guidemos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameWindowListener {

	public static void main(String[] args) {
		MyJFrame frame = new MyJFrame();
//		JLabel label = new JLabel("Ein Label");
		
//		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
//		frame.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				
//			}
//		});
		frame.addWindowListener(new MyWindowAdapter());
		
//		frame.add(label);
		frame.setVisible(true);
		int temp;
		if(temp >= 20) {
			System.out.println("Eis essen!");
		} else {
			System.out.println("Nachmittagsaufgabe!");
		}
	}

}
