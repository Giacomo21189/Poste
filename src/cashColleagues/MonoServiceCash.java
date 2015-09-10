package cashColleagues;

import main.CentralSystem;

public class MonoServiceCash {

	private String serviceName;
	private CentralSystem central;

	public MonoServiceCash(String serviceName, CentralSystem central) {
		this.serviceName=serviceName;
		this.central=central;
	}
	
	public void serveClient() {
		central.getQueues().get(serviceName).clientServed();
	}
	
}
