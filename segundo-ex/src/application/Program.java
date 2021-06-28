package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtc;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produtc product = new Produtc();
		
		System.out.println("Entre com o valor na data:"); // Pergunta Usuario
		System.out.print("Name: "); // Pergunta Usuario
		product.nome = sc.nextLine(); // resposta Usario
		System.out.print("Valor: "); // Pergunta Usuario
		product.valor = sc.nextDouble(); // resposta Usario
		System.out.print("Quantidade no estoque:"); // Pergunta Usuario
		product.quantidade = sc.nextInt(); // resposta Usario
		
	//	product.toString()  serve para converte o Obj para String
	
		System.out.println("Produto na data: " + product); // mostrando produto
		System.out.println(); // Pular a linha
		
		System.out.print("AdicionadoProduto no  estoque: ");
		int quantidade = sc.nextInt(); // usuario digitar a quantidade de produtos
		product.addProdutos(quantidade); // atualização da contidade dentro do obj pro
		System.out.println("Produto na data: " + product); // mostrando produto
		System.out.println(); // Pular a linha
		
		System.out.print("Entre com o numero de produto para ser removidoo do estoque: ");
		quantidade = sc.nextInt(); // usuario digitar a quantidade de produtos
		product.remoProdutos(quantidade);  // atualização da contidade
		
		System.out.println("Produto na data " + product); // mostrando produto
		System.out.println(); // Pular a linha
		
	
		sc.close();

	}

}
