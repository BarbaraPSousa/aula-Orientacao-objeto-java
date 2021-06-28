/* Classe  menbro comu (Sem Statico)*/
package application_estatico_2;

import java.util.Locale;
import java.util.Scanner;

import util.Calular;

public class ProgramaSclaEsta2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calular cal = new Calular(); // quando não é statico tem que Intancia "chamar" o objeto
		
		System.out.println("Entre como valor do Raio: ");
		double raio = sc.nextDouble();
		
		double c = cal.circufencia(raio);
		
		double v = cal.volume(raio);
		
		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI velho:  %.2f%n", cal.PI);
		
		sc.close();

	}
}