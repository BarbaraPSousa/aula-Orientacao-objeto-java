package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		
		Map<Product, Double> stock = new HashMap<>();//instanciando o Map
		
		//instanciando o produc
		Product p1 = new Product("Tv", 900.0);
		Product p2 = new Product("Notbook", 1200.0);
		Product p3 = new Product("Tablet", 400.00);
		
		//inserindo dados no stock
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		Product ps = new Product("Tv", 900.0);
		
		System.out.println("Constais 'ps' hey: " + stock.containsKey(ps));//sera que no meu map tem um proc cpm nme kay?
	}

}
