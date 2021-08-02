package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramTryWithResouces {

	public static void main(String[] args) {

		String path = "C:\\temp\\novos-projetos\\in.txt";// variavel para ler o caminho do arquivo


		try (BufferedReader br = new BufferedReader(new FileReader(path))){//instanciando direto no tray
			
			String line = br.readLine();// variavel para ler linhaa linha do arq, se tiver no final vai retorna null

			while (line != null) {// se line for diferente de null, leu com sucesso
				System.out.println(line);// imprime na tela
				line = br.readLine();// pedi para ler outra linha
			}
		}
		catch (IOException e) {// tratando possivel erro
			System.out.println("Error: " + e.getMessage());		
		}
	}
}
