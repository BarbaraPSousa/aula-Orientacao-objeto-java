package util;

public class CurrencyConverter {

	public static double IOF = 0.06;

	
	public static double dollarEmReal(double resultado, double valorDolla){
		return  resultado * valorDolla * (1.0 + IOF);
	}
}
