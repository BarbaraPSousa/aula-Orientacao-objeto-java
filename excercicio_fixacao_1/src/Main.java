import java.util.Scanner;

//Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
//mensagem explicativa, conforme exemplos.



public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int soma = x + y;
				
		System.out.println("SOMA = " + soma);
		
		
		sc.close();
	}

}
