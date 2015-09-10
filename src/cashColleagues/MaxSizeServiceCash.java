package cashColleagues;

import java.util.Collections;
import java.util.Comparator;

import main.CentralSystem;
import utils.IMyQueue;

public class MaxSizeServiceCash {

	private CentralSystem centrale;

	public MaxSizeServiceCash(CentralSystem centrale) {
		this.centrale = centrale;
	}

	public void serveClient() {

		Collections.max(centrale.getQueues().values(),
				new Comparator<IMyQueue>() {

					@Override
					public int compare(IMyQueue queue, IMyQueue other) {
						return queue.awaitingSize() - other.awaitingSize();
					}

				}).clientServed();

	}
}
