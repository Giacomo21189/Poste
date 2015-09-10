package tests;

import main.CentralSystem;
import cashColleagues.MonoServiceCash;

public class MonoServiceCashTest {

	public static void main(String[] args) {

		CentralSystem centrale=new CentralSystem();
		centrale.clientArrivedFor("Servizi Bancari");
		centrale.clientArrivedFor("Servizi Bancari");
		centrale.clientArrivedFor("Servizi Postali");
		centrale.clientArrivedFor("Altri Servizi");

		MonoServiceCash cashMono=new MonoServiceCash("Servizi Bancari", centrale);
		
		cashMono.serveClient(); 
		
		System.out.println(centrale.getQueues().get("Servizi Bancari").nextClientToBeServed());
		
		MonoServiceCash cashMono2=new MonoServiceCash("Servizi Postali", centrale);

		cashMono2.serveClient();
		System.out.println(centrale.getQueues().get("Servizi Postali").nextClientToBeServed());
	}

}
