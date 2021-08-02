package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFileReaderEBuffredReader {

	public static void main(String[] args) {

		String path = "C:\\temp\\novos-projetos\\in.txt";// variavel para ler o caminho do arquivo
		FileReader fr = null;// variavel com valor atribuido
		BufferedReader br = null;

		try {
			fr = new FileReader(path);// instac. com o caminho do arquivo
			br = new BufferedReader(fr);// inst. aparti do File para deixa mas rapido a leitura

			String line = br.readLine();// variavel para ler linha do arq, se tiver no final vai retorna null

			while (line != null) {// se line for diferente de null, leu com sulcesso
				System.out.println(line);// imprime na tela
				line = br.readLine();// pedi para ler outra linha
			}
		}
		catch (IOException e) {// tratando possivel erro
			System.out.println("Error: " + e.getMessage());
		} 
		finally {// fecahando recurso
			try {// como pode da um erro temos que tratar
				if (br != null) {
					br.close();
				}

				if (fr != null) {
					fr.close();
				}
			} 
			catch (IOException e) {// tratando possivel erro
				e.printStackTrace();
			}
		}
	}
}
