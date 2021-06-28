package excercio_fix;

import java.util.Locale;
import java.util.Scanner;

import entidade1.Triangulo;

public class Programa1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc  = new Scanner(System.in);	
		Triangulo tri = new Triangulo();
		
		System.out.println("Insira a largura e a altura do retângulo: ");
		tri.largura = sc.nextDouble();
		tri.altura = sc.nextDouble();
		System.out.printf("AREA = %.2f%n" , tri.area());
		System.out.printf("PERIMETRO = %.2f%n" , tri.perimetro());
		System.out.printf("DIAGONAL = %.2f%n" , tri.diagonal());
		
		
		sc.close();
	}

}
