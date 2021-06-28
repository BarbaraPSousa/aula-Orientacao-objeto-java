package excercio_fix2;

import java.util.Locale;
import java.util.Scanner;

import entidade2.Triangulo;

public class Programa {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo tri = new Triangulo();
		
		
		System.out.println("Insira a largura e a altura do retângulo: ");
		tri.altura = sc.nextDouble();
		tri.largura = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", tri.area());
		System.out.printf("PERIMETRO = %.2f%n", tri.perimetro());
		System.out.printf("DIAMETRO = %.2f%n", tri.diagonal());
		
	
		sc.close();

	}

}
