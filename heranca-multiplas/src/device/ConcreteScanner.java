package device;

public class ConcreteScanner extends Device implements Scanner{//clss tanto herda de device e complementa ai nterface scanner

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {//sobescrendo o metodo da clss Devi
		System.out.println("Scanner processing: " + doc);		
	}
	@Override
	public String scan() {//sobcrevendo o metodo da interface
		return "Scanned content";
	}		
}
