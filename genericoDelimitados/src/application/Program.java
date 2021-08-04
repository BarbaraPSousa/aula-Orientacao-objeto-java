/*Deseja-se fazer um programa que leia uma quantidade N, e depois N nomes de
pessoas. Ao final, imprima esses números de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado.*/

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\BARBARA\\Desktop\\Curso Javas\\int.txt";//caminho do arquivo

		try(BufferedReader br = new BufferedReader(new FileReader(path))){//intanciando
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");//recorta a string e guarda no vetor
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));//varre o arquivo e add todos os product na list
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);//operacao que informa maior valor
			System.out.println("Max: ");
			System.out.println(x);
		}
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
 