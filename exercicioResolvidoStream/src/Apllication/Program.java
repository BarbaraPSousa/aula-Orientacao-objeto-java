/*Fazer um programa para ler um conjunto de produtos a partir de um
arquivo em formato .csv (suponha que exista pelo menos um produto).
Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
nomes, em ordem decrescente, dos produtos que possuem preço
inferior ao preço médio.*/

package Apllication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());// comparando de string 
			
			double avg = list.stream()//criando stream
					.map(p -> p.getPrice())////map para criar nova stream com valor 
					.reduce(0.0, (x,y) -> x + y) / list.size();// reduce com func de soma e divivão por tamanho da lista
			System.out.println("Average price: " + String.format("%.2f", avg));//imprimindomedi na tela
			
			List<String> names = list.stream()//criando stream
					.filter(p -> p.getPrice() < avg)// filter, todos que tem o valor abaixo da media
					.map(p -> p.getName())//map para criar nova stream com nome de cada produtos
					.sorted(comp.reversed())//ordenando os nomes por ordem alfabetica inversa
					.collect(Collectors.toList());//tranformando a stream em list
			
			names.forEach(System.out::println);//imprimindo na tela
					
					
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());			
		}
		sc.close();
	}
}
