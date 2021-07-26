/*BLOCO FANALLY*/

package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProgramBlocoFinally {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\BARBARA\\Desktop\\Curso Javas\\int.txt");//caminho a onde esta o arquivo
		Scanner sc = null;
		try {
			sc = new Scanner(file);// Scanner ler arquivis não só informações do console
			while (sc.hasNext()) {// percorre a linha do arquivo
				System.out.println(sc.nextLine());
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		finally { // fecha o programa
			if (sc != null) {//se a variavel for diferente de nulo chame o sc
				sc.close();
			}
			System.out.println("Finally block excecuted"); // testando se o Bloco Fanally esta rodando corretamente
		}
	}
}
