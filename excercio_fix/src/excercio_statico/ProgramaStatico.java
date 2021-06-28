package excercio_statico;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramaStatico {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double valorDollar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double resultado = sc.nextDouble();
		double conversao = CurrencyConverter.dollarEmReal(resultado, valorDollar);
		System.out.printf("Amount to be paid in reais = %.2f", conversao );

		sc.close();

	}
}
