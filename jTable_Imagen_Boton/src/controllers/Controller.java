package controllers;

import controllers.Actions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

import views.TableWindow;

public class Controller implements ActionListener{
	
	private TableWindow tableWindow;
	
	public Controller() {
		tableWindow = new TableWindow(this);
	}

	public void actionPerformed(ActionEvent e) {
		switch (Actions.valueOf(e.getActionCommand())) {
			case ADD:
				add();
			break;
			case DELETE:
				executeAction(((JComponent)e.getSource()).getName());
			break;
		}
	}
	
	private void add() {
		String name = JOptionPane.showInputDialog(tableWindow, "Nombre ");
		tableWindow.addRegistryToTable(name, this);
	}

	private void executeAction(String id) {
		JOptionPane.showMessageDialog(tableWindow, "Nombre: " + id,
				"Nombre", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void main(String[] args) {
		new Controller();
	}
}