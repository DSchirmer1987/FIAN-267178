package musterloesungen.aufgabenBinaryCalcKB;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalcGui extends JFrame {

	private JPanel decimal, binary, hex, content, buttonbox;
	private JButton decUmwandeln, binUmwandeln, hexUmwandeln;
	private JTextField decField, binField, hexField;
	private JLabel decLabel, binLabel, hexLabel;

	public CalcGui() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);

		content = new JPanel();
		decimal = new JPanel();
		binary = new JPanel();
		hex = new JPanel();
		buttonbox = new JPanel();
		decUmwandeln = new JButton("Dezimalzahl Umwandeln");
		binUmwandeln = new JButton("Binärzahl Umwandeln");
		hexUmwandeln = new JButton("Hexadezimalzahl Umwandeln");
		decField = new JTextField();
		binField = new JTextField();
		hexField = new JTextField();
		decLabel = new JLabel("Hier Dezimalzahl eintragen");
		binLabel = new JLabel("Hier Binärzahl eintragen");
		hexLabel = new JLabel("Hier Hexadezimalzahl eintragen");

		Dimension dim = new Dimension(220, 30);
		decField.setPreferredSize(dim);
		binField.setPreferredSize(dim);
		hexField.setPreferredSize(dim);

		decField.addActionListener(new DecFieldListener());
		binField.addActionListener(new BinFieldListener());
		hexField.addActionListener(new HexFieldListener());
		decUmwandeln.addActionListener(new DecFieldListener());
		binUmwandeln.addActionListener(new BinFieldListener());
		hexUmwandeln.addActionListener(new HexFieldListener());
		
		content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
		buttonbox.setLayout(new GridLayout(3,1));
		
		buttonbox.add(decUmwandeln);
		buttonbox.add(binUmwandeln);
		buttonbox.add(hexUmwandeln);

		decimal.add(decField);
		binary.add(binField);
		hex.add(hexField);

		content.add(decLabel);
		content.add(decimal);
		content.add(binLabel);
		content.add(binary);
		content.add(hexLabel);
		content.add(hex);

		this.getContentPane().add(BorderLayout.CENTER, content);
		this.getContentPane().add(BorderLayout.SOUTH, buttonbox);
		
		decField.setText("42");
		binField.setText("101010");
		hexField.setText("2a");
	}

	class DecFieldListener implements ActionListener {
		int input = 0;

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				input = Integer.parseInt(decField.getText());
				binField.setText(Integer.toBinaryString(input));
				hexField.setText(Integer.toHexString(input));
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

	class BinFieldListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int decimal = Integer.parseInt(binField.getText(), 2);
				decField.setText(decimal + "");
				hexField.setText(Integer.toHexString(decimal));
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}

	class HexFieldListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int decimal = Integer.parseInt(hexField.getText(), 16);
				decField.setText(decimal + "");
				binField.setText(Integer.toBinaryString(decimal));

			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}
// not in use
//	class ButtonListener implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//		if(decField.hasFocus()) {
//			int input=0;
//			try {
//				input = Integer.parseInt(decField.getText());
//				binField.setText(Integer.toBinaryString(input));
//				hexField.setText(Integer.toHexString(input));
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//		}else if(binField.hasFocus()) {
//			try {
//				int decimal = Integer.parseInt(binField.getText(), 2);
//				decField.setText(decimal + "");
//				hexField.setText(Integer.toHexString(decimal));
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//		}else {
//			try {
//				int decimal = Integer.parseInt(hexField.getText(), 16);
//				decField.setText(decimal + "");
//				binField.setText(Integer.toBinaryString(decimal));
//
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//		}
//
//		}
//
//	}
}
