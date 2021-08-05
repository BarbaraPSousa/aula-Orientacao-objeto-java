package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program2 {

	//Funcao sao obj de primeira ordem ou class
	
	public static int compareProducts(Product p1, Product p2) {//função de comparação por valor
		return p1.getPrice().compareTo(p2.getPrice());
	}
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.0));
		list.add(new Product("Tablet", 450.0));
		
		list.sort(Program2:: compareProducts);//passandoa  referencia da funcao passado com argumento, sendo conhecido com fun de primeira orde ou class
		list.forEach(System.out::println);
		
		//expressao lambida
		list.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));//sem necessidade de declarar a varial dotipo, o compilador dedus o tipo, sendo assim chamamos de inferencia de tipos
	}
}
