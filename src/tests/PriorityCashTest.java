package tests;

import main.CentralSystem;
import cashColleagues.PriorityServiceCash;

public class PriorityCashTest {

	public static void main(String[] args) {
		CentralSystem centrale=new CentralSystem();
	
		centrale.clientArrivedFor("Altri Servizi");
		centrale.clientArrivedFor("Servizi Postali");
		centrale.clientArrivedFor("Servizi Bancari");
		centrale.clientArrivedFor("Servizi Bancari");
		

		PriorityServiceCash priorCash=new PriorityServiceCash("Servizi Postali", centrale);
		
		//qualcuno serve l'unico cliente arrivato per i servizi postali...
		
		centrale.getQueues().get("Servizi Postali").clientServed();
		
		System.out.println("prima: ");
		
		
		System.out.println("numero clienti non serviti per servizi postali: "+centrale.getQueues().get("Servizi Postali").awaitingSize());
		System.out.println("numero clienti non serviti per altri servizi: "+centrale.getQueues().get("Altri Servizi").awaitingSize());
		System.out.println("numero clienti non serviti per servizi bancari: "+centrale.getQueues().get("Servizi Bancari").awaitingSize());
		
		
		priorCash.serveClient();
		
		System.out.println("dopo: ");

		System.out.println("numero clienti non serviti per servizi postali: "+centrale.getQueues().get("Servizi Postali").awaitingSize());
		System.out.println("numero clienti non serviti per altri servizi: "+centrale.getQueues().get("Altri Servizi").awaitingSize());
		System.out.println("numero clienti non serviti per servizi bancari: "+centrale.getQueues().get("Servizi Bancari").awaitingSize());

	}
}
