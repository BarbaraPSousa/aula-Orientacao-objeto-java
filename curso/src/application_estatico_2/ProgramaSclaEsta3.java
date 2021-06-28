/*Com Objetos Classe Statico)*/

package application_estatico_2;

import java.util.Locale;
import java.util.Scanner;

import util2.Calcular;

public class ProgramaSclaEsta3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Calular cal = new Calular(); não preciza estanciar o objeto pois o mesmo foi
		 * criado com Ststico
		 */

		System.out.println("Entre como valor do Raio: ");
		double raio = sc.nextDouble();

		double c = Calcular.circufencia(raio); // Basta colocar o nome da funcao sem preciar estanciar.

		double v = Calcular.volume(raio);

		System.out.printf("Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI velho: %.2f%n",  Calcular.PI);

		sc.close();

	}

}
