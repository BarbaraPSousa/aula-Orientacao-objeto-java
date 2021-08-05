package util;

import java.util.function.Predicate;

import entities.Product;
//predicado com intef

public class ProductPredicate implements Predicate<Product> {//implementa a intef predic

	@Override
	public boolean test(Product p) {//metodo test
		return p.getPrice() >= 100.0;
	}

}
