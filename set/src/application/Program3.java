package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product;

public class Program3 {

	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));

		for(Product p: set) {
			System.out.println(p);//imprimindo na tela
		}
	}
}
/*Toda vez que utilizamos o TreeSet, temos que implementa na class resp o comparable, para fazer a ordena��o correta*/
