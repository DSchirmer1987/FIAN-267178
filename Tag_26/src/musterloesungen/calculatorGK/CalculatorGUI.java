package musterloesungen.calculatorGK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.border.EtchedBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	public static String str1st = "", str2nd = "", strTmpResult = "", strResult = "", strCalcOp = "";
	public static boolean start = true, str1stSet = false, str2ndStart = true, chainOp = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

//		CalcTest ct = new CalcTest();
//		ct.testInteger();
//		ct.testDouble();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculatorGUI() {
		setTitle("CalculatorGK");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 440, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(50, 20, 50, 20));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 380, 0 };
		gbl_contentPane.rowHeights = new int[] { 90, 50, 400 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0 };
		contentPane.setLayout(gbl_contentPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		panel_1.setPreferredSize(new Dimension(380, 80));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.insets = new Insets(10, 0, 0, 0);
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		contentPane.add(panel_1, gbc_panel_1);

		// TODO limit to 10 digits
		JLabel lblNewLabel = new JLabel("0 "); // 10 digits allowed
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(0, 204, 102));
		lblNewLabel.setBackground(Color.BLACK);
		Font dig7 = null;
		try {
			dig7 = Font.createFont(Font.TRUETYPE_FONT, new File("src/musterloesungen/calculatorGK/digital-7.ttf"));
			dig7 = dig7.deriveFont(Font.PLAIN, 72);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(dig7);
		} catch (FontFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		lblNewLabel.setFont(new Font("Digital-7", Font.PLAIN, 72));
		lblNewLabel.setFont(dig7);
		lblNewLabel.setPreferredSize(new Dimension(360, 60));

		panel_1.add(lblNewLabel);

		JPanel panel_3 = new JPanel();
		panel_3.setPreferredSize(new Dimension(380, 50));
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 1;
		contentPane.add(panel_3, gbc_panel_3);

		JButton btnNewButton_1 = new JButton("AC");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("0");
				str1st = "";
				str2nd = "";
				strTmpResult = "";
				strResult = "";
				strCalcOp = "";
				start = true;
				str1stSet = false;
				str2ndStart = true;
			}
		});

		panel_3.add(btnNewButton_1);

		JLabel lblNewLabel_1 = new JLabel("ten digits simple Version 0.1 ");
		lblNewLabel_1.setPreferredSize(new Dimension(270, 50));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		panel_3.add(lblNewLabel_1);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setPreferredSize(new Dimension(400, 400));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		contentPane.add(panel, gbc_panel);
		panel.setLayout(new MigLayout("", "[390px]", "[491px]"));

		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(360, 400));
		panel.add(panel_2, "cell 0 0,alignx center,aligny center");
		panel_2.setLayout(new GridLayout(4, 4, 20, 20));

//		JButton btnNewButton = new JButton("New button");
//		panel.add(btnNewButton);

		String[] buttons = new String[] { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=",
				"+" };

		for (int i = 0; i < 16; i++) {

			JButton btnNewButton = new JButton(buttons[i]);
			Color c = new Color(200, 200, 200);
			btnNewButton.setPreferredSize(new Dimension(20, 20));
			btnNewButton.setOpaque(true);

			btnNewButton.setBackground(c);
			btnNewButton.setForeground(new Color(255, 255, 255));

			if ((i + 1) % 4 == 0 || btnNewButton.getText().equals("=") || btnNewButton.getText().equals("."))
				btnNewButton.setBackground(new Color(150, 150, 150));
			if (btnNewButton.getText().equals("=") || btnNewButton.getText().equals("."))
				btnNewButton.setForeground(new Color(0, 0, 0));

			btnNewButton.setFont(new Font("Arial", Font.PLAIN, 36));
			panel_2.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {

					String getTxt = ((JButton) e.getSource()).getText();
					if (start) {
						lblNewLabel.setText("");
						start = false;
					}

					if (getTxt.equals("=")) {
						Action.ActionResult(lblNewLabel, getTxt);
					} else if (getTxt.equals("/") || getTxt.equals("*") || getTxt.equals("-") || getTxt.equals("+")) {
						Action.ActionCalc(lblNewLabel, getTxt);
					} else if (!str1stSet) {
						Action.ActionNumbers1st(lblNewLabel, getTxt);
					} else {
						Action.ActionNumbers2nd(lblNewLabel, getTxt);
					}

					System.out.println(getTxt);

				}
			});
		}
	}

}
