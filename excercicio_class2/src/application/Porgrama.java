package application;

import java.util.Locale;
import java.util.Scanner;

import entidade.Funcionario;


public class Porgrama {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionario func = new Funcionario();
		
		System.out.print("Nome:");
		func.name = sc.nextLine();
		System.out.print("Salario Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("funcionaro " + func);
		System.out.println();
		System.out.print("Qual o percentual para almento do salario? ");
		double porcentagem = sc.nextDouble();
		func.incrimentaSalario(porcentagem);
		
		System.out.println();
		System.out.println("Dados Atualizado: " + func);
		
		
		sc.close();

	}

}
