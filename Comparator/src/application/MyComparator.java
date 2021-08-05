package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product>{//class implementa interfase Produ

	@Override
	public int compare(Product p1, Product p2) {//metodo de comparação do produto
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());//comparando por nome, indepedente de letras mauculas ou minusculas
	}

}
