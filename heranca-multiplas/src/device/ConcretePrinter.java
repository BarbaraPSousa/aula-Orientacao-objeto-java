package device;

public class ConcretePrinter extends Device implements Printer{//class herda de device e implementa interface printer

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {//sobescrendo o metodo da clss Device
		System.out.println("Printng processing: " + doc);		
	}
	@Override
	public void print(String doc) {//sobcrevendo o metodo da interface
		System.out.println("Printng: " + doc);
	}	
}
