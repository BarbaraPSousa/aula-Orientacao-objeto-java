package device;

/*public class ComboDevice extends Scanner, Printer{não existe em javas a possibilidade de uma class herda de 2, utilizamos interface para isso */

public class ComboDevice extends Device implements Scanner, Printer {// é possivel usar 2 interfaces, como declaradas

	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {//sobescrevendo metodo da interface Print
		System.out.println("Combo Printing: " + doc);

	}

	@Override
	public String scan() {//sobescrevendo metodo da interface Scanner
		return "Combo Scan resulte";
	}

	@Override
	public void processDoc(String doc) {//sobescrevendo metodo da Class Divece
		System.out.println("Combo processing: " + doc);

	}
}
/*A implementaqção de mas de uma interface não é herança multipla, pois a class não está herdadno e sim comprindo contrato*/
