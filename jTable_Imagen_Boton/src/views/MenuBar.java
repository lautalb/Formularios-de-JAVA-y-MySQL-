package views;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import controllers.Actions;
import controllers.Controller;

public class MenuBar extends JMenuBar{

	private static final long serialVersionUID = 1L;

	public MenuBar(Controller controller) {

		JMenu menuFile = new JMenu("Personas");

		JMenuItem itemAddProgram = new JMenuItem("Agregar");
		itemAddProgram.addActionListener(controller);
		itemAddProgram.setActionCommand(Actions.ADD.toString());
		itemAddProgram.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS, ActionEvent.CTRL_MASK));
		menuFile.add(itemAddProgram);
		
		add(menuFile);
	}
}