package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileWriterEBufferedWriter {//escrever arquivos

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good nigth"};//criando string com valores
		
		String path = "C:\\temp\\novos-projetos\\out.txt";//caminho do arquivo
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){//intanciando o recurso, true nao deixa recriar arquivo, só acrecentar o que ja tem
			for(String line : lines) {//para cada linha contido no vetor line 
				bw.write(line);//escre linha no arquivo
				bw.newLine();//quebra de linha
			}
		}
		catch (IOException e) {//tratando possivel erro
			e.printStackTrace();
		}
	}
}
