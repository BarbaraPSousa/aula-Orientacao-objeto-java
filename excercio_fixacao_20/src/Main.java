import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double senha = sc.nextDouble();
		
		while(senha != 2002 ) {
			System.out.println(" Senha Invalidada");
			senha = sc.nextDouble();
		}
		
		System.out.println("Acesso Permitido");
		
	
		sc.close();
	}

}
