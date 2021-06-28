import java.util.Locale;
import java.util.Scanner;

// Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
// seguir, calcule e mostre o valor da conta a pagar.

public class Main {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cod = sc.nextDouble();
		double conti = sc.nextDouble();
		double total;
		
		if(cod == 1) {
			total = conti * 4.00;
		}
		else if (cod == 2) {
			total = conti * 4.50;
		}
		else if (cod == 3) {
			total = conti * 5.00;
		}
		else if(cod == 4) {
			total = conti * 2.00;
		}
		else
			total = conti * 1.50;
		System.out.printf("TOTAL = %.2f",total);
	
		
		sc.close();
	}

}
