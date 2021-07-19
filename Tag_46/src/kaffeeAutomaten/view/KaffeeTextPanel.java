package kaffeeAutomaten.view;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import kaffeeAutomaten.controller.Pausenraum;

public class KaffeeTextPanel extends JPanel {

	private Dimension dimension = new Dimension(150, 150);
	private JLabel label;
	private JTextPane text;
	private JButton unterbrechen;
	private Pausenraum pr;

	public KaffeeTextPanel(String labelTxt, Pausenraum pr) {
		super();
		this.pr = pr;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(label = new JLabel(labelTxt));
		this.add(text = new JTextPane());
		text.setPreferredSize(dimension);
//		this.add(unterbrechen = new JButton("       Unterbrechen       "));
//		unterbrechen.addActionListener(new Unterbrecher());
		label.setAlignmentX(JLabel.CENTER_ALIGNMENT);
//		unterbrechen.setAlignmentX(JButton.CENTER_ALIGNMENT);
//		unterbrechen.setName(labelTxt);

	}

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JTextPane getText() {
		return text;
	}

	public void setText(JTextPane text) {
		this.text = text;
	}

	public JButton getUnterbrechen() {
		return unterbrechen;
	}

	public void setUnterbrechen(JButton unterbrechen) {
		this.unterbrechen = unterbrechen;
	}
	
	private class Unterbrecher implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			pr.getAutomaten()[Integer.parseInt(unterbrechen.getName())].unterbrechen();
			
		}
		
	}

}
