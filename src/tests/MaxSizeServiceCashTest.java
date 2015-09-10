package tests;

import main.CentralSystem;
import cashColleagues.MaxSizeServiceCash;

public class MaxSizeServiceCashTest {

	public static void main(String[] args) {

		CentralSystem centrale = new CentralSystem();
		centrale.clientArrivedFor("Servizi Bancari");
		centrale.clientArrivedFor("Servizi Bancari");
		centrale.clientArrivedFor("Servizi Postali");
		centrale.clientArrivedFor("Servizi Postali");
		centrale.clientArrivedFor("Servizi Postali");
		centrale.clientArrivedFor("Altri Servizi");
		centrale.clientArrivedFor("Altri Servizi");
		centrale.clientArrivedFor("Altri Servizi");
		centrale.clientArrivedFor("Altri Servizi");

		MaxSizeServiceCash cashMaxSize = new MaxSizeServiceCash(centrale);

		System.out.println("numero clienti in coda prima: ");
		
		System.out.println("numero clienti non serviti per servizi bancari: "+centrale.getQueues().get("Servizi Bancari").awaitingSize());
		System.out.println("numero clienti non serviti per servizi postali: "+centrale.getQueues().get("Servizi Postali").awaitingSize());
		System.out.println("numero clienti non serviti per altri servizi: "+centrale.getQueues().get("Altri Servizi").awaitingSize());
		
		cashMaxSize.serveClient();
		
		System.out.println("numero clienti in coda dopo: ");

		System.out.println("numero clienti non serviti per servizi bancari: "+centrale.getQueues().get("Servizi Bancari").awaitingSize());
		System.out.println("numero clienti non serviti per servizi postali: "+centrale.getQueues().get("Servizi Postali").awaitingSize());
		System.out.println("numero clienti non serviti per altri servizi: "+centrale.getQueues().get("Altri Servizi").awaitingSize());

	}
}
