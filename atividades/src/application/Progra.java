/*Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Progra {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		
		System.out.println("Enter rectangle width and height:");
		rec.heigth = sc.nextDouble();
		rec.whidth = sc.nextDouble();
		System.out.printf("Area = %.2f%n" + rec.area());
		System.out.printf("Perimeter =  %.2f%n",rec.perimeter());
		System.out.printf("Diagonal = %.2f%n" + rec.diagonal());
		
		sc.close();

	}

}
