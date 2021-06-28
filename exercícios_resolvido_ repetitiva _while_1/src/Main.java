// Leia uma quantidade indenterminada de duplas de valores inteiros X e Y.
//Escreva para cada X e Y uma mensagem que indique se estes valores forem digitados em ordem crescente ou decrescente.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != y) {
			if(x < y){
				System.out.println("Crescente");
			}
			else {
			System.out.println("Decrecente");
		}
		x = sc.nextInt();
		y = sc.nextInt();
		}
		
		
		sc.close();
	}

}
