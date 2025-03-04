/*Encapsulando Atributos*/


package entities;

public class Product2 {

	
	/* Trocando os atributo */
	private String name;
	private double price;
	private int quantity;
	
	public Product2() { 
	}
	
/*Construtores*/
	public Product2(String name, double price, int quantity) {
		this.name  = name;
		this.price = price;
		this.quantity = quantity;
	}
/* segundo contrutor (Sobre carga)	*/
	public Product2(String name, double prece) { 
		this.name = name;
		this.price = price;		
	}
	
/*Criando Metodo para acessar os atributos encapsulado*/
	
	public void setName(String name) { // para acessar as informa��o do atributo priveti
		this.name = name;
	}
	
	public  String getName() { // para ler as informa��es do atributo priveti
		 return name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() { // N�O CRIA O METODO SET POIS PROTEGE O MEU OBJETO DE ALTERA��O INCONSISTENTE, S� PODE SE MUDADO ATRAVES DAS OPERA��ES. 
		return quantity;
	}
	
//Metodo
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
