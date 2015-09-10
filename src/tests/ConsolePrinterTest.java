package tests;

import printercolleagues.ConsolePrinter;
import printercolleagues.IPrinter;

public class ConsolePrinterTest {

	public static void main(String[] args) {
		
		IPrinter consolePrinter=new ConsolePrinter();
		
		consolePrinter.print("Servizi Finanziari", 1);
		consolePrinter.print("Servizi Finanziari", 2);
		consolePrinter.print("Servizi Postali", 1);
		consolePrinter.print("Altri Servizi", 1);
	}
}
