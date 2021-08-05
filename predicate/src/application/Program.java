package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double min = 100.0;//valor prarametrizado com variavel
		Predicate<Product> pred = p -> p.getPrice() >= min;//exp lambida com variavel
		list.removeIf(pred);//remove com variavel
		//list.removeIf(Product :: nonStaticProductPredicate);//referencia para metodo não static
		//list.removeIf(Product :: staticProductPredicate);//referencia para metodo static
		//list.removeIf(new ProductPredicate());//instanc a interf
	    list.removeIf(p -> p.getPrice() >= 100);//exp. lamb. inline.
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
