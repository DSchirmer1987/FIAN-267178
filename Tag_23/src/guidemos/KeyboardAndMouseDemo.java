package guidemos;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyboardAndMouseDemo {

	public static void main(String[] args) {
		MyJFrame frame = new MyJFrame();
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		
		JLabel lbl = new JLabel("Ein Label");
		JTextField txt = new JTextField();
		JButton btn = new JButton("Button");
		frame.setContentPane(panel);
		panel.add(btn);
		panel.add(lbl);
		panel.add(txt);
		
		
		// Mouse-Events
		panel.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Maus geklickt");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Mouse Entered");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Mouse Exited");
			}
			
		});
		
		/*	
		btn.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("Typed");
			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("Pressed");
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("Released");
			}
			
		});
		*/
		
		// Auslösen eines MouseEvents
		MouseEvent me = new MouseEvent(
				frame, 
				MouseEvent.MOUSE_CLICKED, 
				System.currentTimeMillis(), 
				0, 
				620, 
				440, 
				1, 
				false
				);
		frame.dispatchEvent(me);
		
		frame.setVisible(true);

	}

}
