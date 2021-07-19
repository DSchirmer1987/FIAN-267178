package kaffeeAutomaten.view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JTextPane;

public class HeaderPanel extends JPanel {

	JTextPane text = new JTextPane();
	Font font = new Font(Font.MONOSPACED, Font.BOLD,40);
	
	HeaderPanel(){
		text.setEditable(false);
		text.setOpaque(false);
		text.setFont(font);
		text.setText("Kaffee Junkie Simulator");
		this.setBackground(Color.LIGHT_GRAY);
		this.add(text);
		
		
	}

	public JTextPane getText() {
		return text;
	}

	public void setText(JTextPane text) {
		this.text = text;
	}

	public Font getFont() {
		return font;
	}

	public void setFont(Font font) {
		this.font = font;
	}
	
	
	
	
}
