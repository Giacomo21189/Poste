package utils;

public interface IMyQueue {

	public void addClient();
	int getTotalClient();
	void clientServed();
	int nextClientToBeServed();
	int awaitingSize();
}
