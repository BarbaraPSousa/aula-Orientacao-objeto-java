import java.util.Scanner;

// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		if (x %2 == 0) {
			System.out.println("PAR");
		}
		else
			System.out.println("IMPAR");
		
		
		
		sc.close();
	}

}
