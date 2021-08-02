package application;

import java.io.File;
import java.util.Scanner;

public class ProgramManipulandoPastaFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");//pedido para usuario o caminho
		String strPath = sc.nextLine();
		
		File path = new File(strPath);//variavel para instanciar file com a informação passada
		
		//verificado todas as pastas do caminho informado		
		File[] folders = path.listFiles(File::isDirectory);//filtrando a lista somente quem é diretorios ou pasta
		System.out.println("FOLDERS:");//informação na tela
		for(File folder: folders) {//para cada pasta na lista 
			System.out.println(folder);//imprima a lista
		}
		//verificando lista de Arquivos
		File[]files = path.listFiles(File::isFile);//variavel para filtra só a lista de arquivos
		System.out.println("FILES:");
		for(File file: files) {//para cada arquivo na lista
			System.out.println(file);//imprima lista		
		}
		//Criando uma subpasta
		
		boolean success = new File(strPath + "\\subdir").mkdir();// instacia para criar uma subpasta
		System.out.println("Directory created sucessfully: " + success);
		
		
		
		sc.close();
	}
}
