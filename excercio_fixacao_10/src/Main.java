import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double x = sc.nextDouble();
		
		if(x < 0 || x == 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("N�O NEGATIVO");
		}
			

		
	sc.close();
	}

}
