package entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product p ) {//metodo statico que faz o test
		return p.getPrice() >= 100.0;
	}

	public boolean nonStaticProductPredicate() {//metodo n�o statico que faz o test
		return price >= 100.0;
	}

	
	@Override
	public String toString() {
		return "Product " + name + ", price = " + price;
	}
}
