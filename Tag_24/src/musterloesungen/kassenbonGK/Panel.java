package musterloesungen.kassenbonGK;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panel {

	private static int productNumber;
	private static String productName;
	private static double productPrice;
	private static String vk;
	private static boolean vkAusgewaehlt = false;
	private static boolean barClicked = false;
	private static String receiptHeader;
	private static String receiptSalesman;
	private static String receiptPosition;
//	public static String startHTML = "<html><font size = 22>";
//	public static String endHTML = "</font></html>";

	public static void PanelField() {

//		String filename="C:/Users/CC-Student/Downloads/SynchronGK/APPLICATION/ECLIPSE_WORKSPACE/Tag_24_GK/src/digital7.ttf";//this is for testing normally we would store the font file in our app (knows as an embedded resource), see this for help on that http://stackoverflow.com/questions/13796331/jar-embedded-resources-nullpointerexception/13797070#13797070
//
//		Font font = Font.createFont(Font.TRUETYPE_FONT, new File(filename));
//		font = font.deriveFont(Font.BOLD,28);
//
//		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//		ge.registerFont(font);

		// Font f1 = new Font("Digital-7", Font.BOLD, 22);

		JFrame jframe = new JFrame("Panel");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLayout(new GridLayout(1, 5));

		JLabel jlabel = new JLabel(/* startHTML + */"Bitte Verkäufer anmelden"/* + endHTML */, JLabel.RIGHT);
		jlabel.setFont(new Font("Arial", Font.PLAIN, 28));
//		jlabel.setFont(font);
		jlabel.setOpaque(true);
		jlabel.setBackground(Color.black);
		jlabel.setForeground(Color.orange);
		jlabel.setAlignmentX(SwingConstants.CENTER);

		receiptHeader = Receipt.ReceiptHeader();
		JLabel jlabelReceipt = new JLabel(receiptHeader + Main.endHTML, JLabel.CENTER);
		jlabelReceipt.setOpaque(true);
		jlabelReceipt.setBackground(Color.LIGHT_GRAY.brighter());

		JButton clear = new JButton("Clear");
		Color colorClear = new Color(255, 100, 100);
		clear.setBackground(colorClear);
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jlabel.setText("0.00");
				productNumber = 0;
				if(barClicked) {
					jlabelReceipt.setText(receiptHeader + Main.endHTML);
					barClicked = false;
					Main.basket.clear();
					productNumber = 0;
					vk = null;
					vkAusgewaehlt = false;
					jlabel.setText("Bitte Verk�ufer anmelden");
					
				}

			}
		});

		JButton storno = new JButton("Storno");
		Color colorStorno = new Color(100, 100, 100);
		storno.setBackground(colorStorno);
		storno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.basket.remove(Main.basket.size() - 1);
				jlabel.setText("Storno: - " + jlabel.getText());
				receiptPosition = Receipt.ReceiptPosition();

				jlabelReceipt.setText(receiptHeader + receiptSalesman + receiptPosition + Main.endHTML);
			}
		});

		JButton zws = new JButton("ZWS");
		Color colorZWS = new Color(50, 100, 200);
		zws.setBackground(colorZWS);
		zws.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (vk != null && vkAusgewaehlt == false) {
					// System.out.println("if " + vk);
					vkAusgewaehlt = true;
					receiptSalesman = Receipt.ReceiptSalesman("Es bediente Sie: " + vk + "<br>");
					jlabelReceipt.setText(receiptHeader + receiptSalesman + Main.endHTML);
					jlabel.setFont(new Font("Arial", Font.PLAIN, 28));
					jlabel.setText("0.00");

				} else if (vk != null && vkAusgewaehlt == true && (jlabel.getText().equals("0.00")
						|| jlabel.getText().equals(vk + " Press ZWS zum Best�tigen"))) {
					// System.out.println("else if " + vk);
					receiptSalesman = Receipt.ReceiptSalesman("Es bediente Sie: " + vk + "<br>");
					jlabelReceipt.setText(receiptHeader + receiptSalesman + Main.endHTML);
					jlabel.setFont(new Font("Arial", Font.PLAIN, 28));
					jlabel.setText("0.00");
				} else {
					// jlabel.setText("ZWS");
					// System.out.println("ZWS");
					Main.basket.add(new ReceiptItem(productNumber, productName, productPrice));
					receiptPosition = Receipt.ReceiptPosition();

					jlabelReceipt.setText(receiptHeader + receiptSalesman + receiptPosition + Main.endHTML);

					productNumber = 0;

				}
			}
		});

		JComboBox<String> auswahlVK = new JComboBox<String>();
		((JLabel) auswahlVK.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		auswahlVK.addItem("VK1 - M�ller");
		auswahlVK.addItem("VK2 - Meier");
		auswahlVK.addItem("VK3 - Mustermann");
		Color colorAuswahlVK = new Color(250, 250, 200);
		auswahlVK.setBackground(colorAuswahlVK);
		auswahlVK.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				vk = auswahlVK.getSelectedItem().toString();
				jlabel.setFont(new Font("Arial", Font.PLAIN, 15));
				jlabel.setText(vk + " Press ZWS zum Best�tigen");
				//System.out.println(vk);

			}
		});

		JButton bar = new JButton("BAR");
		Color colorBAR = new Color(100, 230, 200);
		bar.setBackground(colorBAR);
		bar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String receiptSum = Receipt.ReceiptSum();
				receiptPosition = Receipt.ReceiptPosition();

				jlabelReceipt.setText(receiptHeader + receiptSalesman + receiptPosition + receiptSum + Main.endHTML);
				barClicked = true;
				
			}
		});

		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button0 = new JButton("0");
		JButton button00 = new JButton("00");
		button7.setBackground(Color.lightGray);
		button8.setBackground(Color.lightGray);
		button9.setBackground(Color.lightGray);
		button4.setBackground(Color.lightGray);
		button5.setBackground(Color.lightGray);
		button6.setBackground(Color.lightGray);
		button1.setBackground(Color.lightGray);
		button2.setBackground(Color.lightGray);
		button3.setBackground(Color.lightGray);
		button0.setBackground(Color.lightGray);
		button00.setBackground(Color.lightGray);

		JButton buttonP0 = new JButton(Product.products[0].getProductName());
		JButton buttonP1 = new JButton(Product.products[1].getProductName());
		JButton buttonP2 = new JButton(Product.products[2].getProductName());
		JButton buttonP3 = new JButton(Product.products[3].getProductName());

		JPanel jpanel = new JPanel();
		GridBagLayout gb = new GridBagLayout();
		jpanel.setLayout(gb);

		addComponent(button7, jpanel, gb, 0, 0, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(button8, jpanel, gb, 2, 0, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(button9, jpanel, gb, 4, 0, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);

		addComponent(button4, jpanel, gb, 0, 2, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(button5, jpanel, gb, 2, 2, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(button6, jpanel, gb, 4, 2, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);

		addComponent(button1, jpanel, gb, 0, 4, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(button2, jpanel, gb, 2, 4, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(button3, jpanel, gb, 4, 4, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);

		addComponent(button0, jpanel, gb, 0, 6, 4, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(button00, jpanel, gb, 4, 6, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		
		// ActionListener als eigene Anonyme Innere Klasse anstatt bei jedem Button.
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				int p = Integer.parseInt(btn.getText());
				if(vkAusgewaehlt) {
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 10 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}else {
				jlabel.setFont(new Font("Arial", Font.PLAIN, 28));
				jlabel.setText("Bitte Verk�ufer anmelden");
			}
			}
		};
		button7.addActionListener(al);
		
		/*
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				int p = Integer.parseInt(btn.getText());
				if(vkAusgewaehlt) {
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 10 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}else {
				jlabel.setFont(new Font("Arial", Font.PLAIN, 28));
				jlabel.setText("Bitte Verk�ufer anmelden");
			}
			}
		});
		*/

		button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 8;
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 10 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}
		});

		button9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 9;
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 10 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}
		});
		
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 4;
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 10 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}
		});
		
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 5;
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 10 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}
		});
		
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 6;
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 10 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}
		});
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 1;
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 10 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}
		});
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 2;
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 10 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}
		});
		
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 3;
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 10 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}
		});
		
		button0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 0;
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 10 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}
		});
		
		button00.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 0;
				if (productNumber == 0) {
					productNumber = p;
				} else {
					productNumber = productNumber * 100 + p;
				}
				jlabel.setText(String.valueOf(productNumber) + "x ");

			}
		});
		
		JPanel jpanel2 = new JPanel();
		jpanel2.setLayout(gb);

//		addComponent(jlabel, jpanel2, gb, 4, 0, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
//		addComponent(jlabelReceipt, jpanel2, gb, 4, 2, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(buttonP0, jpanel2, gb, 0, 0, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(buttonP1, jpanel2, gb, 2, 0, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(buttonP2, jpanel2, gb, 0, 2, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(buttonP3, jpanel2, gb, 2, 2, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);

		buttonP0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 0;
				productName = Product.products[p].getProductName();

				if (productNumber == 0) {
					productNumber = 1;

				}
				productPrice = Product.products[p].getProductPrice();
				jlabel.setText(String.valueOf(productNumber) + "x " + productPrice);

			}
		});

		buttonP1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 1;
				productName = Product.products[p].getProductName();

				if (productNumber == 0) {
					productNumber = 1;

				}
				productPrice = Product.products[p].getProductPrice();
				jlabel.setText(String.valueOf(productNumber) + "x " + productPrice);

			}
		});

		buttonP2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 2;
				productName = Product.products[p].getProductName();

				if (productNumber == 0) {
					productNumber = 1;

				}
				productPrice = Product.products[p].getProductPrice();
				jlabel.setText(String.valueOf(productNumber) + "x " + productPrice);

			}
		});

		buttonP3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p = 3;
				productName = Product.products[p].getProductName();

				if (productNumber == 0) {
					productNumber = 1;

				}
				productPrice = Product.products[p].getProductPrice();
				jlabel.setText(String.valueOf(productNumber) + "x " + productPrice);

			}
		});

		JPanel jpanel3 = new JPanel();
		jpanel3.setLayout(gb);

		addComponent(clear, jpanel3, gb, 0, 0, 4, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(storno, jpanel3, gb, 0, 4, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(zws, jpanel3, gb, 2, 4, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(auswahlVK, jpanel3, gb, 0, 6, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);
		addComponent(bar, jpanel3, gb, 2, 6, 2, 2, 1.0, 1.0, GridBagConstraints.BOTH);

		JPanel jpanel4 = new JPanel();
		jpanel4.setLayout(gb);

		addComponent(jlabel, jpanel4, gb, 0, 0, 6, 2, 1.0, 0.2, GridBagConstraints.BOTH);
		addComponent(jlabelReceipt, jpanel4, gb, 2, 2, 6, 2, 1.0, 1.0, GridBagConstraints.BOTH);

//		jframe.add(clear);
//		jframe.add(jlabel);
		jframe.add(jpanel);
		jframe.add(jpanel2);
		jframe.add(jpanel3);
		jframe.add(jpanel4);
//		jframe.add(zws);
//		jframe.add(auswahlVK);
//		jframe.add(jlabelReceipt);

		jframe.setSize(1280, 480);
		jframe.setVisible(true);

	}

	/**
	 * 
	 * @param comp    Component zum hinzuf�gen
	 * @param cont    Container zu dem hinzugef�gt werden soll
	 * @param gb      GridBag
	 * @param x       Position X-Achse
	 * @param y       Position Y-Achse
	 * @param width   Breite
	 * @param height  H�he
	 * @param weightx Spaltenverteilung der Breite
	 * @param weighty Reihenverteilung der H�he
	 */
	public static void addComponent(Component comp, Container cont, GridBagLayout gb, int x, int y, int width,
			int height, double weightx, double weighty, int fill) {
		// Nebenbedingugnen / Einschr�nkungen des Gridbaglayouts
		GridBagConstraints gbc = new GridBagConstraints();
		// Fill = Wie soll der ungenutzte Bereich ausgef�llt werden.
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
