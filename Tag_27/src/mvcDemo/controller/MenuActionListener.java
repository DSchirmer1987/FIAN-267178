package mvcDemo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuActionListener implements ActionListener {
	
	private final static MenuActionListener instance = new MenuActionListener();
	
	public static MenuActionListener getInstance() {
		return MenuActionListener.instance;
	}

	private MenuActionListener() {

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand().toLowerCase()) {
			case "new":{
				System.out.println("Neu Laden");
				break;
			}
			case "open file":{
				System.out.println("Open File");
				break;
			}
			case "exit":{
				System.out.println("Exit");
				System.exit(0);
				break;
			}
			case "about":{
				System.out.println("\u00a9 by Nobody");
				System.exit(0);
				break;
			}
			default:{
				System.out.println("Unbekannt");
				break;
			}
		}
		
	}
}
