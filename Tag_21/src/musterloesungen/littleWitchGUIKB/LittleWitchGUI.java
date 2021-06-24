package musterloesungen.littleWitchGUIKB;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LittleWitchGUI {

	private int clock;
	private String text;
	private JButton button;
	private JPanel left;
	private JPanel right;
	private JFrame frame;
	private JLabel oneL, twoL, threeL, fourL, fiveL, sixL, sevenL, eightL, nineL, tenL, elevenL, twelfL, thirteenL;
	private BufferedImage image = null;
	private JLabel label;
	private String[] files;

	public static void main(String[] args) {

		LittleWitchGUI lw = new LittleWitchGUI();
		lw.los();
	}

	public void los() {
		clock = 6;
		files = new String[] { "src/witch2.jpg", "src/witch3.jpg", "src/witch4.jpg", "src/witch5.jpg", "src/witch6.jpg",
				"src/witch7.jpg", "src/witch8.jpg" };
		text = String.format("Morgens fr�h um " + clock);
		frame = new JFrame();
		left = new JPanel();
		left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
		right = new JPanel();

		// Bild einlesen und dem Label right zuordnen

		try {
			image = ImageIO.read(new File("src/witch.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label = new JLabel(new ImageIcon(image));
		right.add(label);

		// button erstellen und AL hinzuf�gen
		button = new JButton("Klick mich");
		button.addActionListener(new ButtonListener());

		// Labels f�r das Gedicht hinzuf�gen
		oneL = new JLabel();
		oneL.setText(text);
		left.add(oneL);
		twoL = new JLabel();
		left.add(twoL);
		threeL = new JLabel();
		left.add(threeL);
		fourL = new JLabel();
		left.add(fourL);
		fiveL = new JLabel();
		left.add(fiveL);
		sixL = new JLabel();
		left.add(sixL);
		sevenL = new JLabel();
		left.add(sevenL);
		eightL = new JLabel();
		left.add(eightL);
		nineL = new JLabel();
		left.add(nineL);
		tenL = new JLabel();
		left.add(tenL);
		elevenL = new JLabel();
		left.add(elevenL);
		twelfL = new JLabel();
		left.add(twelfL);
		thirteenL = new JLabel();
		left.add(thirteenL);

		// Panels und Button dem Frame hinzuf�gen
		frame.getContentPane().add(BorderLayout.WEST, left);
		frame.getContentPane().add(BorderLayout.EAST, right);
		frame.getContentPane().add(BorderLayout.SOUTH, button);

		// frame definieren
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650, 600);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}

	// Methode die die Ausgabe regelt indem sie den Labels ihren Text zuweist
	public void setText() {
		switch (clock) {
		case 6:
			twoL.setText("Kommt die kleine Hex.");

			break;
		case 7:
			threeL.setText(text);
			fourL.setText("schabt sie gelbe R�ben.");
			break;
		case 8:
			fiveL.setText(text);
			sixL.setText("wird Kaffee gemacht.");
			break;
		case 9:
			sevenL.setText(text);
			eightL.setText("geht sie in die Scheun'.");
			break;
		case 10:
			nineL.setText(text);
			tenL.setText("hackt sie Holz und Sp�n'.");
			break;
		case 11:
			elevenL.setText("Feuert an um " + clock + ", \nkocht dann bis um "+(clock+1)+".");
			break;
		case 12:
			twelfL.setText("Fr�schebein und Krebs und Fisch.");
			thirteenL.setText("Hurtig Kinder kommt zu Tisch.");
			break;
		}

	}

	// ActionListener f�r den Button
	class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			setText();
			clock++;
			text = "Morgens fr�h um " + clock;
			if(clock<14) {
			BufferedImage newimage = null;
			try {
				newimage = ImageIO.read(new File(files[clock - 7]));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Image image = newimage.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
			right.remove(label);
			label = new JLabel(new ImageIcon(image));
			right.add(label);
			}
		}

	}

}
