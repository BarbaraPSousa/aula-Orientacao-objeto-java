package entities;

public class Produtc {

	public String nome;
	public double valor;
	public int quantidade;
	
	public double totalVelueInStock() {
		return valor * quantidade;
	}
	public void addProdutos(int quantidade) { // add produto é altera o valor da varial quantidade com soma.
		this.quantidade += quantidade; // this quer dizer que vc quer acessar o valor da classe e não o parametro da funcao
	}
	
	public void remoProdutos(int quantidade) { // void porque não retorna um valor
		this.quantidade -= quantidade;
	}
	//formatação do Produto
	public String toString() { // pode complementa a String
		return nome + ", $" + String.format("%.2f", valor) +", " + quantidade + " unidade , Total: $: " + String.format("%.2f", valor);
	}
	
}
