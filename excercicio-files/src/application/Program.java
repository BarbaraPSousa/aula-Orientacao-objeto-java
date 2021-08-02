/*Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade)*/

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		
		String path = "C:\\Users\\BARBARA\\Desktop\\Curso Javas\\int.txt";//caminho do arquivo

		List<Product> list = new ArrayList<>();// isntanciando lista
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){//lendo arquivo com red
			
			String line = br.readLine();//variavel para lera primeira linha
			line = 	br.readLine();//ler a segunda pra frente
			while(line != null) {//ler arq. ate que seja diferente de null
			
				String[]vect = line.split(",");//criando vetor para colocar o conteudo da lista e separando com ,
				String name = vect[0];//primaira posicaço
				Double price = Double.parseDouble(vect[1]);//segunda posicao, convertido para Double
				Integer quantity =Integer.parseInt(vect[2]);//terceira posição
				
				Product prod = new Product(name, price, quantity);//instanciando os produtos
				
				list.add(prod);//add produc na lista
				
				line = br.readLine();//leia de novo
			}
			System.out.println("PODUCTS: ");//imprimindo lista
			for(Product p: list) {//para cada produto p na lista list
				System.out.println(p);//imprima na tela
			}						
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());//mosta erro na tela
		}
		
	}
}
