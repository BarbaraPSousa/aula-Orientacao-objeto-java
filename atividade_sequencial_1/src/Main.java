//Fa�a um programa para ler dois valores inteiros, 
//e depois mostrar na tela a soma desses n�meros com uma mensagem explicativa,
//conforme exemplos

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		
		A = sc.nextInt();
		B = sc.nextInt();
		soma = A + B;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
