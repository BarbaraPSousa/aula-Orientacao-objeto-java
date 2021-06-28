import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double idade = sc.nextDouble();
		double soma = 0;
		double cont = 0;
		
		
		while(idade >= 0) {
			soma += idade;
			cont += 1;		
			idade = sc.nextDouble();
		}
		if(cont > 0) {
			double media =(double) soma / cont;
			System.out.printf("%.2f%n", media);
		}
		else {
			System.out.println("impossivel Calcular");
		}
		

		
		
		sc.close();
	}

}
