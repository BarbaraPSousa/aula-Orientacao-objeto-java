package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto =  new Produto();
		
		System.out.println("Enter product data: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Valor: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.print("Produto na data: " + produto);
		
		System.out.println();
		System.out.print("Entre com o numero de produto para ser adicionado no estoque:  ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.print("Atualizar na data: " + produto);
		
		
		System.out.println();
		System.out.print("Entre com o numero de produto para ser removido no estoque:  ");
		quantidade = sc.nextInt();
		System.out.print("Atualizar na data: " + produto);
		
		sc.close();
	}

}
