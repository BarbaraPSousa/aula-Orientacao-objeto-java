package excercio_fix_3;

import java.util.Locale;
import java.util.Scanner;

import entidade3.Funcionario;



public class Porgrama3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario fun = new Funcionario();
		
		System.out.print("Nome: ");
		fun.nome = sc.nextLine();
		System.out.println();
		
		System.out.println("Salario Grosso: ");
		fun.salarioGrosso = sc.nextDouble();
		System.out.println();
		
		System.out.println("imposto: ");
		fun.taxa = sc.nextDouble();
		System.out.println();
		
		System.out.println("Valor Atualizado: R$ " + fun.descontoImposto());
		System.out.println();
		
		System.out.println("Qual o percentual de almento? ");
		double porgentagem = sc.nextDouble();
		fun.salarioComAlmento(porgentagem);
		
		System.out.println();
		System.out.println("Valor atualizado: " + fun);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
