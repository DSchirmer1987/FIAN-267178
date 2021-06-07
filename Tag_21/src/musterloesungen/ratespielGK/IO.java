package musterloesungen.ratespielGK;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class IO {
	
	public static void startGuessingGame() {
		JOptionPane.showMessageDialog(null, "Eine Zahl zwischen 1 und 100 erraten", "Ratespiel...", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void endGuessingGame(int numberOfAttempts) {
		String versuch = " Versuche";
		if(numberOfAttempts == 1) versuch = " Versuch";
		String msg = "Sie haben das Ratespiel gel�st und daf�r " + numberOfAttempts + versuch + " ben�tigt.";
		String title = "Herzlichen Gl�ckwunsch!";
		int msgType = JOptionPane.PLAIN_MESSAGE;
		ImageIcon icon = new ImageIcon("src/musterloesungen/RatespielGK/win3.png");
		
		JOptionPane.showMessageDialog(null, msg, title, msgType, icon);
		System.exit(0);
	}
	
	public static void guessingDialogue(int rndNumber, int numberOfAttempts) throws IllegalAccessException {
		String guess = JOptionPane.showInputDialog("Bitte geben Sie Ihre Rate-Zahl ein (bisherige Versuche: " + numberOfAttempts + ").");
		String hint = CreateNCheckRandomNumber.checkRandomNumber(guess, rndNumber, numberOfAttempts);
		
		if(hint.equals("Treffer")) {
			endGuessingGame(numberOfAttempts);
		}
		if(hint.equals("gr��er")) {
		JOptionPane.showMessageDialog(null, "Ihr Wert ist zu gro�.", "Tip!", JOptionPane.PLAIN_MESSAGE);
		} else {
		JOptionPane.showMessageDialog(null, "Ihr Wert ist zu klein.", "Tip!", JOptionPane.PLAIN_MESSAGE);
		}
	}
	
	public static void exceptionDialogue() {
	JOptionPane.showMessageDialog(null, "Bitte einen g�ltigen Wert eingeben (Zahl zwischen 1 und 100).", "Warnung!", JOptionPane.ERROR_MESSAGE, null);
	}


}
