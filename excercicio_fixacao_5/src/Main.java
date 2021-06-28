import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.


public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double cod1 = sc.nextDouble();
		double peca1 = sc.nextDouble();
		double valor1 = sc.nextDouble();
		
		double cod2 = sc.nextDouble();
		double peca2 = sc.nextDouble();
		double valor2 = sc.nextDouble();
		
		double total = peca1 * valor1 + peca2 * valor2;
		
		System.out.printf("VALOR A PAGAR = R$%.2f%n", total);
		
		
		
		sc.close();

	}

}
