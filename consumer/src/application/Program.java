/*Fazer um programa que, a partir de uma lista de produtos, aumente o
preço dos produtos em 10%
.*/

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		double factor = 1.1;//valor prarametrizado com variavel
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);;//exp lambida com variavel
		//list.removeIf(pred);//remove com variavel
	    // list.forEach(Product :: nonStaticProductUpdate);//referencia para metodo não static
		//list.forEach(Product :: staticProductUpdate);//referencia para metodo static
		//list.forEach(new PriceUpdate());//instanc a interf
	    
		list.forEach(p -> p.setPrice(p.getPrice()* factor));//exp. lamb. inline.

		list.forEach(System.out:: println);//impimindo a lista
	}
}
