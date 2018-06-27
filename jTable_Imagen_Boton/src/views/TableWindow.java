package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import controllers.Actions;
import controllers.Controller;

public class TableWindow extends JFrame{

	private static final int IMAGE_HEIGHT = 150;
	private static final String BTN_BACKGROUND_COLOR = "#1c79c0";
	private static final String TITLE = "Tabla con botones";
	private static final int COLUMN_WITH_JBUTTON = 2;
	private static final int COLUMN_WITH_IMAGE = 1;
	private static final String PATH_ICON = "/img/icon.png";
	private static final String[] TABLE_IDENTIFIERS = new String[]{"nombre", "foto", "Boton"};
	private static final long serialVersionUID = 1L;
	private DefaultTableModel model;
	private ImageIcon image;
	
	
	public TableWindow(Controller controller) {
		setSize(300, 300);
		setTitle(TITLE);	
		setIconImage(new ImageIcon(getClass().getResource(PATH_ICON)).getImage());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setJMenuBar(new MenuBar(controller));

		model = new DefaultTableModel();
		model.setColumnIdentifiers(TABLE_IDENTIFIERS);
		JTable table = new JTable(model){
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return row != COLUMN_WITH_IMAGE;
			}
		};
		
		image = new ImageIcon(getClass().getResource(PATH_ICON));
		
		table.getColumnModel().getColumn(COLUMN_WITH_IMAGE).setCellRenderer(new TableCellRenderer() {
			@Override
			public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
					int row, int column) {
				return (JLabel)value;
			}
		});
		table.setRowHeight(IMAGE_HEIGHT);
		
		table.getColumnModel().getColumn(COLUMN_WITH_JBUTTON).setCellRenderer(new JButtonCellRender());
		table.getColumnModel().getColumn(COLUMN_WITH_JBUTTON).setCellEditor(new JButtonCellEditor());
		
		JScrollPane jScrollPane = new JScrollPane(table);
		add(jScrollPane, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public void addRegistryToTable(String name, Controller controller) {
		JButton btnDelete = new JButton("Event");
		btnDelete.addActionListener(controller);
		btnDelete.setActionCommand(Actions.DELETE.toString());
		btnDelete.setBackground(Color.decode(BTN_BACKGROUND_COLOR));
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setName(name);
		model.addRow(new Object[]{name, new JLabel(image), btnDelete});
	}
}