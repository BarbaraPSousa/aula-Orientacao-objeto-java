import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto;
		
		if(salario <= 2000.00) {
			imposto = 00.00;
		}
		else if(salario <= 3000.00) {
			imposto = (salario - 3000.00) *0.8;
		}
		else if (salario <= 4500.00) {
			imposto = (salario - 3000.00)* 0.18 + 1000 * 0.08;
		}
		else
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 100.0 * 0.08;
		
		if (imposto == 0) {
			System.out.println("INSENTO");
		}
		else 
			System.out.printf("R$: %.2f%n", imposto);
		
		
		
		
		
		sc.close();

	}

}
