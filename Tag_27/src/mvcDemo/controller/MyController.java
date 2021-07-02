package mvcDemo.controller;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.text.JTextComponent;

import mvcDemo.model.Kunde;
import mvcDemo.view.MainFrame;
import mvcDemo.view.MainPanel;

public class MyController implements ActionListener{
	private MainFrame mainFrame;
	private MainPanel mainPanel;
	private Kunde kunde = new Kunde();
	private ArrayList<JTextComponent> listOfJTextComponent = new ArrayList<>();
	
	public MyController(String titel) {
		this.mainFrame = new MainFrame(titel);
		this.init();
	}
	
	private void init() {
		this.mainFrame.addMouseListener(new MyPopupMenuOpener());
		getElements(mainFrame);
	}
	
	private void getElements(Component root) {
		Container container = (Container) root;
		for(Component inner: container.getComponents()) {
			// Rekursiver Aufruf an alle unterliegenden Componenten
			getElements(inner);
			
			if(inner instanceof JPanel) {
				
			}
			// Für alle Buttons
			if(inner instanceof JButton) {
				((JButton) inner).addActionListener(this);
			}
			
			// Für die TextComponents
			if (inner instanceof JTextComponent) {
				this.listOfJTextComponent.add((JTextComponent) inner);
			}
				
			// Für die MenüBar
			if(inner instanceof JMenu) {
				for(Component menuComp : ((JMenu) inner).getMenuComponents()) {
					if(menuComp instanceof JMenuItem) {
						JMenuItem tmp = (JMenuItem) menuComp;
						tmp.addActionListener(MenuActionListener.getInstance());
					}
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		if (!this.listOfJTextComponent.isEmpty()) {
			for (JTextComponent jTextComponent : listOfJTextComponent) {
				if (jTextComponent.getName() != null) {
					switch (jTextComponent.getName().toLowerCase()) {
						case "vorname": {
							jTextComponent.setText(this.kunde.getVorname());
							break;
						}
						case "nachname": {
							jTextComponent.setText(this.kunde.getNachname());
							break;
						}
						case "adresse": {
							jTextComponent.setText(this.kunde.getAdresse());
							break;
						}
						case "kundennummer": {
							jTextComponent
									.setText(this.kunde.getKundennummer());
							break;
						}
						default: {
							jTextComponent.setText("hallo");
							break;
						}
					}
				}

			}
		}

	}
}
