
//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas,
//o valor que recebe por hora e calcula o sal�rio desse funcion�rio. 
//A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais. 

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int funcionario = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorHora = sc.nextDouble();
		double salario = (horasTrabalhadas * valorHora);
		
		System.out.println("NUMBER = " + funcionario);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		sc.close();
		

	}

}
