/*Fazer um programa que, a partir de uma lista de produtos, calcule a
soma dos preços somente dos produtos cujo nome começa com "T".*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import molde.service.ProductService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		ProductService ps = new ProductService();//instanciando class
		
		
		//double sum = ps.filteredSum(list);//variavel auxi, com lista
		//double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');//variavel auxi, com lista e predicado M
		//double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');//variavel auxi, com lista e predicado T
		double sum = ps.filteredSum(list, p -> p.getPrice() < 100.0);//variavel auxi, com lista e predicado menor que 100
		
		System.out.println("Sum = " + String.format("%.2f", sum));//imprimo o valor total
		
	}
}
