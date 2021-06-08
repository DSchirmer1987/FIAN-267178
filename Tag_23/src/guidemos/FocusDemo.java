package guidemos;

import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocusDemo {

	public static void main(String[] args) {
		MyJFrame frame = new MyJFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		
		JLabel lbl = new JLabel("Ein Label");
		JTextField txt = new JTextField();
		JButton btn = new JButton("Button");
		frame.setContentPane(panel);
		frame.add(btn);
		frame.add(lbl);
		frame.add(txt);
		
		txt.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("Lost");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("Gained");				
			}
		});
		

		frame.setVisible(true);

	}

}
