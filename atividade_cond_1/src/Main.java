//Fazer um programa para ler um n�mero inteiro, 
//e depois dizer se este n�mero � negativo ou n�o.


import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		 
		if(x < 0 ) {
			System.out.printf("NEGATIVO %n");
		}
		else {
			System.out.printf("N�O NEGATIVO %n");
		}
		
		
		
		
		
		
		sc.close();
	}

}
