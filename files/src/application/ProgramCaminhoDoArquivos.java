package application;

import java.io.File;
import java.util.Scanner;

public class ProgramCaminhoDoArquivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");// usuario digita um caminho
		String strPath = sc.nextLine();//guardadno informacão
		
		File path = new File(strPath);//instanciando o file com caminho passado pelo usuario
		
		System.out.println("getName: " + path.getName());//informa o nome do arquivo
		System.out.println("getParent: " + path.getParent());//informa só o caminho sem o nome
		System.out.println("getPath: " + path.getPath());//informa todo caminho 

		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
