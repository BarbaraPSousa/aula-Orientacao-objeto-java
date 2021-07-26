		/*Utilizando STACK TRACE*/

package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramStackTrace {

	public static void main(String[] args) {
		


		System.out.println("End of program"); // finaliza o programa

	}
	public static void method1() { //criando metodo 1
		
		System.out.println("***METHOD2 START***");
		method2(); // chama o metodo 2
		System.out.println("***METHOD2 END***");
		
	}

	public static void method2() {//criando metodo 1
		
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invelid position!");
			e.printStackTrace(); // rastriando o erro
			sc.next(); // só para podemos ver antes do programa continuar
		} 
		catch (InputMismatchException e) {
			System.out.println("Input error");
		}

		sc.close();
		System.out.println("***METHOD2 END***");
	}
}
