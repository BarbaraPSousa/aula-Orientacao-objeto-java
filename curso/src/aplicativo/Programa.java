/*Fazer um programa para ler as medidas dos lados de dois tri�ngulos X e Y (suponha medidas
v�lidas). Em seguida, mostrar o valor das �reas dos dois tri�ngulos e dizer qual dos dois tri�ngulos
possui a maior �rea.
A f�rmula para calcular a �rea de um tri�ngulo a partir das medidas de seus lados a, b e c � a
seguinte (f�rmula de Heron):

 Resolvendo problema com orienta��o ao objeto */

package aplicativo;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangle;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		Triangle x,y; // criando variaves com Class
		x = new Triangle(); // Criando Objeto com comando NEW, para que ele exista
		y = new Triangle(); // Criando Objeto com comando NEW
		
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble(); // lendo o numero inteiro e guardando informa�ao
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();  // lendo o numero inteiro e guardando informa�ao
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
//Calculo soa feitos na classe
		
		double areaX = x.area(); // chamando o objeto que foi calculado na classe
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("larger area: X");
		}
		else {
			System.out.println("Larger area : Y");
		}
		
		
		sc.close();
	}

}
