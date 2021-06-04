package guidemos.jop;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOPDemo {

	public static void main(String[] args) {
		String name = "";
		
//		name = JOptionPane.showInputDialog("Bitte geben Sie einen Namen ein!");
//		
//		System.out.println(name);
//		JOptionPane.showMessageDialog(null, name);
		
//		int option = JOptionPane.showConfirmDialog(null, "Sind Sie sicher sicher?", "Klick OK!", JOptionPane.YES_NO_OPTION);
		String options[] = {"Ja", "Nein", "Weiﬂ nicht", "Sp‰ter", "Abbruch"};
		ImageIcon icon = new ImageIcon("src/icon.png");
		Image image = icon.getImage();
		Image newImage = image.getScaledInstance(64, 64, Image.SCALE_SMOOTH);
		icon = new ImageIcon(newImage);
		int option = JOptionPane.showOptionDialog(	null, 
										"Sind Sie einverstanden?", 
										"AGB", JOptionPane.YES_NO_OPTION, 
										JOptionPane.ERROR_MESSAGE, 
										icon, 
										options, 
										options[0]
									);
		System.out.println(option);
	}

}
