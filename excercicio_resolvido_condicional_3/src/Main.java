//Leia 3 valores de ponto flutuante e efetue os calculo das equações de Bhaskara.
// Se não for possível calcular as raíze, mostre a mensagem correspondente
//"Impossível calcular",caso haja uma divisão por 0 ou raize um numero negativo
//ENTRADA: Leia tres valores de ponto flutuante(double) A,B e c.
//1°:10.0 20.1 5.1 2º:0.0 20.0 5.0 3º10.03.05 5.0
//SAIDA: Se não houver possibilidade de calcular as raizes, apresente "Impossível calcular",caso haja uma divisão por 0 ou raize um numero negativo
//1°:R1 = -0.29788 R2 = -1.71212 2º:R1 = -0.02466 R2 = -19.68409 3º Impossível calcular.



import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = b * b - 4.0 *a * c;
		
		if(a == 0 || delta <0.0) {
			System.out.println("Impossivel Calcular");
		}
		else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		

		
		
		sc.close();
	}

}
