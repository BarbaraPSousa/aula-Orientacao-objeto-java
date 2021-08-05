package util;

import java.util.function.Consumer;

import entities.Product;

public class PriceUpdate implements Consumer<Product>{//Impl. intef consu

	@Override
	public void accept(Product p) {//metodo que almenta em 10%
		p.setPrice(p.getPrice() * 1.1);		
	}
}
