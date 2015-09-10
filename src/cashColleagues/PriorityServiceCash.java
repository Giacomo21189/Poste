package cashColleagues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import main.CentralSystem;
import utils.IMyQueue;

public class PriorityServiceCash {

	private CentralSystem centrale;
	private String nomeServizio;

	public PriorityServiceCash(String nomeServizio, CentralSystem centrale) {
		this.centrale = centrale;
		this.nomeServizio = nomeServizio;
	}

	public void serveClient() {
		IMyQueue queueToServe = centrale.getQueues().get(nomeServizio);
		if (queueToServe.awaitingSize() == 0) {
			
			queueToServe = changeQueue(centrale.getQueues());
		}
		queueToServe.clientServed();
	}

	private IMyQueue changeQueue(HashMap<String, IMyQueue> queues) {
		List<IMyQueue> lista = new ArrayList<IMyQueue>();
		lista.addAll(queues.values());
		do{Collections.shuffle(lista);}
		while (lista.get(0).awaitingSize() == 0);
		return lista.get(0);

	}

}
