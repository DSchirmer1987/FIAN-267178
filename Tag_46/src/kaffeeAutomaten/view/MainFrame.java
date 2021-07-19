package kaffeeAutomaten.view;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

import kaffeeAutomaten.controller.Pausenraum;



public class MainFrame extends JFrame {

	private MainPanel mainPanel;
	private JMenuBar mnbMain;
	private Pausenraum pr;
	private SouthPanel sp;

	public MainFrame(Pausenraum pr) {
		super();
		this.pr=pr;
		mainPanel = new MainPanel(pr,this);
		mnbMain = new MyMenuBar();
		sp= new SouthPanel(pr, this);
		
		this.setResizable(false);
//		this.setLocation(-1000, 50);
		this.setLocationRelativeTo(null);
		this.setSize(1000, 480);
		this.add(sp, BorderLayout.SOUTH);
		this.add(mainPanel, BorderLayout.CENTER);
		this.add(new HeaderPanel(),BorderLayout.NORTH);
//		this.add(new MyJTextPanel("Mitarbeiter"), BorderLayout.SOUTH);
		this.setJMenuBar(mnbMain);
		this.setTitle("Kaffee Junkies");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	

	public JMenuBar getMnbMain() {
		return mnbMain;
	}



	public void setMnbMain(JMenuBar mnbMain) {
		this.mnbMain = mnbMain;
	}



	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}



	public MainPanel getMainPanel() {
		return this.mainPanel;
	}



	public Pausenraum getPr() {
		return pr;
	}



	public void setPr(Pausenraum pr) {
		this.pr = pr;
	}



	public SouthPanel getSp() {
		return sp;
	}



	public void setSp(SouthPanel sp) {
		this.sp = sp;
	}

}
