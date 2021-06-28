// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159


import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio = sc.nextDouble();
		double pi = 314159;
		double aria = raio * pi;
		
		System.out.printf("%f%n", aria);
		
		
		
		sc.close();
	}

}
