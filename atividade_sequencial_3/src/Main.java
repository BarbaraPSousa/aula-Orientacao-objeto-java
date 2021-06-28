//Fazer um programa que leia o número de um funcionário, 
//seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
//A seguir, mostre o número e o salário do funcionário, com duas casas decimais. 

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int dif = (A* B - C* D);
		
		System.out.println("DIFRENCA= " + dif);
		
		
		
	
		sc.close();
		

	}

}
