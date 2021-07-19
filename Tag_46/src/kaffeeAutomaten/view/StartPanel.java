package kaffeeAutomaten.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;


public class StartPanel extends JPanel {
	Font font = new Font(Font.MONOSPACED, Font.BOLD, 30);
	JTextPane text;

	public void zeichneStartBild() {

		this.add(text = new JTextPane());

		Font startFont = new Font(Font.MONOSPACED, Font.BOLD, 15);

		text.setFont(startFont);
		text.setEditable(false);
		text.setText(String.format("Das ist ein Test"));
		text.setLocation(this.getWidth() / 2, this.getHeight() / 2);
		text.setOpaque(false);
		repaint();
	}
	
	//not in use
	public void zeichneSimulation() {
		
		remove(text);
		this.add(text = new JTextPane());
		Font startFont = new Font(Font.MONOSPACED, Font.BOLD, 15);
		text.setFont(startFont);
		text.setEditable(false);
		text.setText(String.format("Gestartet"));
		text.setLocation(this.getWidth() / 2, this.getHeight() / 2);
		text.setOpaque(false);
		repaint();
	}

	
	
}
