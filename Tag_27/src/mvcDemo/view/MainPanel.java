package mvcDemo.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainPanel extends JPanel {

	private JTextField txfDisplay = new JTextField(25);

	private JPanel pnlPage_start = new JPanel();
	private JPanel pnlPage_end = new JPanel();
	private JPanel pnlLine_start = new JPanel();
	private JPanel pnlLine_end = new JPanel();
	private JPanel pnlCenter = new JPanel();

	private JButton btnOne = new JButton("Click one");
	private JButton btnTwo = new JButton("Click two");
	private JButton btnThree = new JButton("Click Three");

	public MainPanel() {
		init();
	}

	private void init() {
		this.setLayout(new BorderLayout());
		this.add(pnlPage_start, BorderLayout.PAGE_START);
		this.add(pnlPage_end, BorderLayout.PAGE_END);
		this.add(pnlLine_start, BorderLayout.LINE_START);
		this.add(pnlLine_end, BorderLayout.LINE_END);
		this.add(pnlCenter, BorderLayout.CENTER);

		txfDisplay.setName("display");

		pnlCenter.setLayout(new GridLayout(0, 2));

		JTextField txf1 = new JTextField(45);
		txf1.setName("vorname");
		JTextField txf2 = new JTextField(45);
		txf2.setName("nachname");
		JTextField txf3 = new JTextField(45);
		txf3.setName("adresse");
		JTextField txf4 = new JTextField(45);
		txf4.setName("kundennummer");

		JLabel lblName = new JLabel("name");

		lblName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getClickCount());
				System.out.println("Label geklickt");
			}
		});

		pnlCenter.add(lblName);
		pnlCenter.add(txf1);
		pnlCenter.add(new JLabel("nachname"));
		pnlCenter.add(txf2);
		pnlCenter.add(new JLabel("Adresse"));
		pnlCenter.add(txf3);
		pnlCenter.add(new JLabel("KDNr."));
		pnlCenter.add(txf4);

		/**
		 * Panel Page_Start
		 */
		pnlPage_start.add(txfDisplay);
		pnlPage_start.add(btnOne);
		// pnlPage_start.add(new JSeparator());
		pnlPage_start.add(btnTwo);
		pnlPage_end.add(btnThree);
	}
}
