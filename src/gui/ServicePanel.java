package gui;

import javax.swing.JButton;
import javax.swing.JPanel;

import printercolleagues.ClientsArrivedNotifier;
import main.CentralSystem;
import main.INotifiable;

public class ServicePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private INotifiable centrale = new CentralSystem();

	private JButton[] btns = {
			new ClientsArrivedNotifier("Servizi Postali", centrale),
			new ClientsArrivedNotifier("Servizi Bancari", centrale),
			new ClientsArrivedNotifier("Altri Servizi", centrale) };

	public ServicePanel() {
		for (int i = 0; i < btns.length; i++) {
			this.add(btns[i]);
		}
	}
}
