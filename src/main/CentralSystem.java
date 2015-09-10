package main;

import java.util.HashMap;

import printercolleagues.ConsolePrinter;
import printercolleagues.IPrinter;
import utils.IMyQueue;
import utils.MyQueue;

public class CentralSystem implements INotifiable {

	private HashMap<String, IMyQueue> queues = new HashMap<String, IMyQueue>();

	private IPrinter clientTicketPrinter=new ConsolePrinter();

	/**
	 * 
	 * @param clientTicketPrinter
	 *            : : il modulo che si occuperà di stampare i biglietti ai
	 *            clienti appena arrivati
	 */

	public CentralSystem() {
	}

	public CentralSystem(IPrinter clientTiketPrinter) {
		this.clientTicketPrinter = clientTiketPrinter;
	}

	@Override
	public void clientArrivedFor(String clientService) {
		if (!(queues.containsKey(clientService))) {
			queues.put(clientService, new MyQueue());
		}
		queues.get(clientService).addClient();
	}

	@Override
	public void askPrint(String clientService) {
		clientTicketPrinter.print(clientService, queues.get(clientService).getTotalClient());
	}

	@Override
	public HashMap<String,IMyQueue> getQueues() {
		return queues;
	}
}
