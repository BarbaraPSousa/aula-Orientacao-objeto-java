/*Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em
seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o
sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto �
afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe
projetada abaixo.*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entitis.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario fun = new Funcionario();
	
		System.out.print("Name: ");
		fun.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		fun.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		fun.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + fun);
		System.out.println();
		System.out.println();
		System.out.print("Which percentage to increase salary: ");
		double porcentage = sc.nextDouble();
		System.out.println();
		System.out.print("Updated data: " + fun);
	
		
		sc.close();

	}

}
