package tests;

import main.CentralSystem;
import main.INotifiable;

public class CentralSystemVSIPrinterTest {

	public static void main(String[] args) {
		
		
		INotifiable central=new CentralSystem();
		
		central.clientArrivedFor("Servizi Finanziari"); 
		central.clientArrivedFor("Servizi Postali"); 
		central.clientArrivedFor("Altri Servizi"); 

		System.out.println(central.getQueues().size());
	}
}
