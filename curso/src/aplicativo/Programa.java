/*Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):

 Resolvendo problema com orientação ao objeto */

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
		x.a = sc.nextDouble(); // lendo o numero inteiro e guardando informaçao
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();  // lendo o numero inteiro e guardando informaçao
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
