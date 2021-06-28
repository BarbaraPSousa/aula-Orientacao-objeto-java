package atividade3;

import java.util.Locale;
import java.util.Scanner;

import entidade.Nota;


public class Programa {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Nota not = new Nota();
		
		not.nome = sc.nextLine();
		not.nota1 = sc.nextDouble();
		not.nota2 = sc.nextDouble();
		not.nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f%n", not.notaFinal());
		
		if(not.notaFinal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("falta %.2f Pontos%n", not.faltandoNota());
		}
		else {
			System.out.println("APROVADO");
		}
			
		
		
		
		
		
		
		
		sc.close();

	}

}
