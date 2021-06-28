/* Classe com menbro Statico*/

package application_estatico;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaSclaEsta {

	public static final double PI = 3.14159; // menbro estatico (final diz que n�o � variavel e n�o pode mudar) contantes sempre letra maiuculas e com _para separa.
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre como valor do Raio: ");
		double raio = sc.nextDouble();
		
		double c = circufencia(raio);
		
		double v = volume(raio);
		
		System.out.printf("3.00Circuferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI velho:  %.2f%n", PI);
		
		sc.close();

	}
	public static double circufencia(double raio) {
		return 2.0 * PI * raio;
	}
	public static double volume(double raio) {
		return 4.0 * PI * raio * raio /3.0;
	}
}
/*N�o pode chamar na mesma classe um menbro que n�o seja statico, dentro de um que � estaticp*/