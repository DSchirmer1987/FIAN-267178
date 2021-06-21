package musterloesungen.rechnerKB;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EastPanel extends JPanel {

	String rechnung;
	ButtonBox box = new ButtonBox();
	JTextArea text = new JTextArea();

	EastPanel() {
		super();
		this.setLayout(new GridLayout(2, 1));
		this.add(text);
		this.add(box);
	}

	class ButtonBox extends JPanel {

		JButton sieben = new JButton("7");
		JButton acht = new JButton("8");
		JButton neun = new JButton("9");
		JButton division = new JButton("/");
		JButton vier = new JButton("4");
		JButton fuenf = new JButton("5");
		JButton sechs = new JButton("6");
		JButton multiplikation = new JButton("*");
		JButton eins = new JButton("1");
		JButton zwei = new JButton("2");
		JButton drei = new JButton("3");
		JButton subtraktion = new JButton("-");
		JButton zero = new JButton("0");
		JButton komma = new JButton(",");
		JButton gleich = new JButton("=");
		JButton plus = new JButton("+");

		JButton[] box = { sieben, acht, neun, division, vier, fuenf, sechs, multiplikation, eins, zwei, drei,
				subtraktion, zero, komma, gleich, plus };

		public ButtonBox() {

			this.setLayout(new GridLayout(4, 4, 2, 2));
			for (int i = 0; i < box.length; i++) {
				this.add(box[i]);
			}
			eins.addActionListener(new NumberButtonListener());
			zwei.addActionListener(new NumberButtonListener());
			drei.addActionListener(new NumberButtonListener());
			vier.addActionListener(new NumberButtonListener());
			fuenf.addActionListener(new NumberButtonListener());
			sechs.addActionListener(new NumberButtonListener());
			sieben.addActionListener(new NumberButtonListener());
			acht.addActionListener(new NumberButtonListener());
			neun.addActionListener(new NumberButtonListener());
			zero.addActionListener(new NumberButtonListener());
			
			division.addActionListener(new OpsButtonListener());
			multiplikation.addActionListener(new OpsButtonListener());
			plus.addActionListener(new OpsButtonListener());
			subtraktion.addActionListener(new OpsButtonListener());
			komma.addActionListener(new OpsButtonListener());
			gleich.addActionListener(new istGleichListener());
		}
	}

	class NumberButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			text.append(btn.getText());
		}

	}

	class OpsButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String eingabe=null;
			if(text!=null) {
			String monitor = text.getText();
			JButton btn = (JButton) e.getSource();
			eingabe=(btn.getText());
			if(!eingabe.equals(monitor.substring(monitor.length()-1))) {
				
				if(monitor.substring(monitor.length()-1).equals("+")||monitor.substring(monitor.length()-1).equals("-")||monitor.substring(monitor.length()-1).equals("*")||monitor.substring(monitor.length()-1).equals("/")) {
					monitor=monitor.substring(0, monitor.length()-1)+eingabe;
					text.setText(monitor);
				}else
				text.append(btn.getText());
			}
			}
		}

	}
	
	class istGleichListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			text.append(String.format("\n"));
			text.append(ALU.ausrechnen(text.getText()));
			
		}
		
	}
}
