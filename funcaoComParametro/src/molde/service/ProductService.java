package molde.service;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	public double filteredSum(List<Product> list, Predicate<Product> criteria) {//metodo soma filtrada
		double sum = 0.0;
		for(Product p : list) {//percorre todos o sproduc da list
			//if(p.getName().charAt(0) == 'T') {//se o produc for = a T,
			if(criteria.test(p)) {//teste generico para qualquer predicado
				sum += p.getPrice();//soma o valor
			}
		}
		return sum;
	}
}
