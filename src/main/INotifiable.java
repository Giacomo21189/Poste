package main;

import java.util.HashMap;

import utils.IMyQueue;

public interface INotifiable {

	public void clientArrivedFor(String clientService);
	public HashMap<String, IMyQueue> getQueues();
	public void askPrint(String clientService);
}
