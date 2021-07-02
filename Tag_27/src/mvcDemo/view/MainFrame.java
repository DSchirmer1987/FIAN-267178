package mvcDemo.view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
		
		((JMenuItem)this.getJMenuBar().getMenu(0).getMenuComponent(0)).addActionListener(null);
	}

	public MainFrame() {
		this("EXIT_ON_CLOSE");
	}

	public MainPanel getMainPanel() {
		return this.mainPanel;
	}

}
