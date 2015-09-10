package utils;

public class MyQueue implements IMyQueue {

	private int totalClient;
	private int nextClient = 1;

	@Override
	public void addClient() {
		this.totalClient++;
	}

	@Override
	public int getTotalClient() {
		return totalClient;
	}

	@Override
	public void clientServed() {
		if (nextClient <= totalClient) {
			nextClient++;
		}
	}

	@Override
	public int nextClientToBeServed() {
		return nextClient;
	}

	@Override
	public int awaitingSize() {
		/* next client -1 è il client attuale */
		return totalClient - (nextClient - 1);
	}

}
