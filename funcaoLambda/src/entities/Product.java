package entities;

public class Product /*implements Comparable<Product>*/{
	
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
	

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
/*
	@Override
	public int compareTo(Product p) {//comparando o nome convertido para maiuculo e comparando o o nome do outro produto
		return name.toUpperCase().compareTo(p.getName().toUpperCase());
	} retirado para melhor implementação atravez do metodo defaul method "sort*/
	
	

}
