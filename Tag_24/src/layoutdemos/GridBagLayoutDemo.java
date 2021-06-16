package layoutdemos;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridBagLayoutDemo {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("GridBagLayoutDemo");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Button");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Button4");
		
		// Abandon all Hope when you have to use GridBagLayout!
		GridBagLayout gb = new GridBagLayout();
		jframe.setLayout(gb);
		
		
		// x, y
		addComponent(new JButton("1"), jframe, gb, 0, 0, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(new JButton("2"), jframe, gb, 0, 2, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		
		addComponent(new JButton("3"), jframe, gb, 2, 0, 1, 4, 0.5, 1.0, GridBagConstraints.BOTH);
		addComponent(new JButton("6"), jframe, gb, 3, 0, 1, 4, 0.5, 1.0, GridBagConstraints.BOTH);
		
		addComponent(new JButton("4"), jframe, gb, 0, 4, 3, 1, 1.0, 1.0, GridBagConstraints.BOTH);
		
		addComponent(new JButton("5"), jframe, gb, 0, 5, 3, 1, 1.0, 1.0, GridBagConstraints.BOTH);
		
//		addComponent(new JButton("6"), jframe, gb, 4, 5, 4, 1, 1.0, 1.0);
		
//		addComponent(new JButton("7"), jframe, gb, 4, 4, 1, 1, 1.0, 1.0);
		
		
//		addComponent(new JButton("8"), jframe, gb, 9, 5, 1, 1, 1.0, 1.0);
		
		jframe.setSize(640, 480);
		jframe.setVisible(true);

	}
	
	/**
	 * 
	 * @param comp Component zum hinzufügen
	 * @param cont Container zu dem hinzugefügt werden soll
	 * @param gb GridBag
	 * @param x Position X-Achse
	 * @param y Position Y-Achse
	 * @param width Breite
	 * @param height Höhe
	 * @param weightx Spaltenverteilung der Breite
	 * @param weighty Reihenverteilung der Höhe
	 */
	public static void addComponent(Component comp, Container cont, GridBagLayout gb, int x, int y, int width, int height, double weightx, double weighty, int fill) {
		// Nebenbedingugnen / Einschränkungen des Gridbaglayouts
		GridBagConstraints gbc = new GridBagConstraints();
		// Fill = Wie soll der ungenutzte Bereich ausgefüllt werden.
		gbc.fill = fill;
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.weightx = weightx;
		gbc.weighty = weighty;
		gb.setConstraints(comp, gbc);
		cont.add(comp);
	}

}
