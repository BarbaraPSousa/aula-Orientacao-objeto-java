//Fazer um programa que leia o n�mero de um funcion�rio, 
//seu n�mero de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio desse funcion�rio. 
//A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais. 

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
