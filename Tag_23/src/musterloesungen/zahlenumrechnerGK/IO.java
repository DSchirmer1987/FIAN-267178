package musterloesungen.zahlenumrechnerGK;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IO {
	public static String dezimal;


	
/*
	public static String userInputDecimal() {
		String msg = "<html><body>Bitte geben Sie eine Ganze Zahl ein und entscheiden danach,<br>ob Sie sie in eine binäre oder in eine Hexadezimalzahl umwandeln wollen:</body><html>";
		String title = "Zahlenkonvertierung dezimal in binär/hexadezimal";
		int msgType = JOptionPane.PLAIN_MESSAGE;
		String dezimal = JOptionPane.showInputDialog(null, msg, title, msgType);
		if (dezimal == null) {
			System.exit(0);
		} else {
			Calc.checkUserInput(dezimal);

		}

		return dezimal;

	}
*/
	public static void userInputConvert() {
		JFrame frame = new JFrame("Zahlenkonvertierer");
		JPanel panel = new JPanel(new GridLayout(4, 2));
		JButton btnBinary = new JButton("Binär");
		JButton btnHexToDec = new JButton("Hex zu Dezimal");
		JButton btnBinaryToDec = new JButton("Binär zu Dezimal");
		JButton btnHex = new JButton("Hexadezimal");
		JLabel lbl = new JLabel("Bitte geben Sie einen Ganze Zahl ein: ");
		JTextField txt = new JTextField();
		JLabel lblResult = new JLabel("Ergebnis: ");
		JLabel result = new JLabel("");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(500, 200);
		frame.setResizable(false);

		frame.setLocationRelativeTo(null);
		frame.setContentPane(panel);

		panel.add(lbl);
		panel.add(txt);
		panel.add(btnBinary);
		panel.add(btnHex);
		
		panel.add(btnBinaryToDec);
		panel.add(btnHexToDec);
		panel.add(lblResult);
		panel.add(result);
		frame.setVisible(true);

		dezimal = "-1";
		
		btnBinary.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dezimal = txt.getText();
				Calc.checkUserInput(dezimal);
				String binary = "binär: " + Calc.dezimalNachBinaer(dezimal);
				result.setText(binary);

			}

		});

		btnHex.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dezimal = txt.getText();
				Calc.checkUserInput(dezimal);
				String hex = "0x " + Calc.dezimalNachHexadezimal(dezimal).toUpperCase();
				result.setText(hex);
				
			}

		});
		
		btnBinaryToDec.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dezimal = txt.getText();
				Calc.checkUserInputBinaryToDec(dezimal);
				String binary = "dezimal: " + Calc.binaryToDecimal(dezimal);
				result.setText(binary);

			}

		});
		
		btnHexToDec.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dezimal = txt.getText();
				Calc.checkUserInputToDec(dezimal);
				String binary = "dezimal: " + Calc.hexToDecimal(dezimal);
				result.setText(binary);

			}

		});

	}

	public static void errorMessage() {
		JOptionPane.showMessageDialog(null, "Bitte einen gültigen Wert eingeben (Ganze Zahl).", "Warnung!",
				JOptionPane.ERROR_MESSAGE, null);
//		IO.userInputConvert();
	}
	
	public static void errorMessageToDec() {
		JOptionPane.showMessageDialog(null, "Bitte einen gültigen Wert eingeben.", "Warnung!",
				JOptionPane.ERROR_MESSAGE, null);
//		IO.userInputConvert();
	}

}
