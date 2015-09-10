package printercolleagues;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import main.INotifiable;

public class ClientsArrivedNotifier extends JButton {

	private static final long serialVersionUID = 5678200371196125741L;
	private INotifiable central;

	/**
	 * 
	 * @param clientService
	 *            : il servizio di cui si occupa
	 * @param notifiable
	 *            : il sistema a cui notificare
	 */
	public ClientsArrivedNotifier(String clientService, INotifiable notifiable) {
		this.central = notifiable;
		super.setText(clientService);
		super.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				central.clientArrivedFor(clientService);
				central.askPrint(clientService);
			}

		});
	}
}
