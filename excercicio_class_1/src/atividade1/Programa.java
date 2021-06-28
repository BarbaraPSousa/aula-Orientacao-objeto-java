package atividade1;

import java.util.Locale;
import java.util.Scanner;

import entidade.Rectangle;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();		
		
		
		System.out.println("Insira a largura e a altura do retângulo: ");
		
		rect.altura = sc.nextDouble();
		rect.largura = sc.nextDouble();
		
		
		System.out.printf("Area = %.2f%n", rect.area());
		System.out.printf("PERIMETRO = %.2f%n", rect.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

		
		
		
		
		sc.close();

	}

}
