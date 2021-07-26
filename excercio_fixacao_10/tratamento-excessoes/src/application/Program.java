			
			/*Estrutura try-catch*/

package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try{ /*significa tenta fazer o que esta dentro do bloco*/
			String[]vect = sc.nextLine().split(" ");
			int position = sc.nextInt(); //perguntando quantas posi��o
			//System.out.println(vect[position]); //acessando posi��o do vec
		}
		/*Captura*/	/*Nome do erro*/			 /*Apelido */	
		catch      (ArrayIndexOutOfBoundsException e) { /*significa capitura o erro*/
			System.out.println("Invelid position!");
		}
		catch(InputMismatchException e) {
			System.out.println("Input error");
		}
	
		System.out.println("End of program.");
		
		
		sc.close();

	}

}
