package guidemos;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class DocumentListenerDemo {

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
				
		txt.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				System.out.println("removeUpdate");				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				System.out.println("insertUpdate");
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				System.out.println("changedUpdate");
			}
		});
		
		btn.addActionListener(e -> txt.setFont(new Font(Font.SERIF, Font.BOLD, 15)));

		frame.setVisible(true);

	}

}
