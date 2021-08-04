/*Um site de internet registra um log de acessos dos usuários. Um
registro de log consiste no nome de usuário (apenas uma palavra) e o
instante em que o usuário acessou o site no padrão ISO 8601,
separados por espaço, conforme exemplo. Fazer um programa que leia
o log de acessos a partir de um arquivo, e daí informe quantos usuários
distintos acessaram o site.*/

package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<LogEntry> set = new HashSet<>();//instanciando o set
			
			String line = br.readLine();//lendo a primeira linha do arquivo
			while(line != null) {
				
				String[] fields = line.split(" ");//recortando a string
				String userName = fields[0];//nome na posicao 0
				Date moment = Date.from(Instant.parse(fields[1]));//data na posicao 1
				
				set.add(new LogEntry(userName, moment));//add no set
				
				line = br.readLine();// lendo a ultima linha do arquivo
			}
			System.out.println("Total users: " + set.size());//tamanho do conjunto
			
			
		}
		catch(IOException e){
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

}
