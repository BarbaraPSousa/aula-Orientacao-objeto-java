package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFileEScanner {

	public static void main(String[] args) {
		
		//lendo arquivo
		
		File file = new File("C:\\temp\\novos-projetos\\in.txt");//instanciando um arquivo e passando o caminho
		Scanner sc = null;//declarando escaner para ler arquivo, valor inicial é null
		
		try {//quando estanciamos o arquivo com escane, ele ja tenta abrir, obrigatoriamente temos que tratar, por isso do Try
			sc = new Scanner(file);//instanciando o Scaner e abrindo 
			while(sc.hasNextLine()) {//testa se tem linha no arquivo
				System.out.println(sc.nextLine());//imprimindo a linhas na tela
			}			
		}
		catch (IOException e) {//tratando possivel erro
			System.out.println("Erro: " + e.getMessage());//mostrando o que aconteceu			
		}
		finally {//bloco fecha o recurso, indepedente do try te dado certo ou não 
			if(sc != null){//test para confirma que Scanner é diferente de null é não deixa da erro
				sc.close();	
			}
			
		}						
	}
}
