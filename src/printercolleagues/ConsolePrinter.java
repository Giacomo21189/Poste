package printercolleagues;

public class ConsolePrinter  implements IPrinter {

	@Override
	public void print(String clientService, int number) {
		System.out.println("Biglietto per: " + clientService + " numero: " + number);
	}
	
}
