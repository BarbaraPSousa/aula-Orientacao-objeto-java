import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double fun = sc.nextDouble();
		double horas = sc.nextDouble();
		double valorhora = sc.nextDouble();
		double salario = horas * valorhora;
		
		System.out.printf("NUMBER = %.2f%n", fun);
		System.out.printf("SALARY = R$ %.2f%n", salario);
		
		
	
		sc.close();
	}

}
