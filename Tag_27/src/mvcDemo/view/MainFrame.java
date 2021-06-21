package mvcDemo.view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import mvcDemo.view.menu.MyMenuBar;

public class MainFrame extends JFrame {

	private MainPanel mainPanel = new MainPanel();

	private JMenuBar mnbMain = new MyMenuBar();

	public MainFrame(String title) {
		super(title);
		this.setResizable(false);
//		this.setLocation(-1000, 50);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(640, 480);
		this.setContentPane(mainPanel);

		this.setJMenuBar(mnbMain);

		this.setVisible(true);
	}

	public MainFrame() {
		this("EXIT_ON_CLOSE");
	}

	public MainPanel getMainPanel() {
		return this.mainPanel;
	}

}
