package excercio_fix_4;

import java.util.Locale;
import java.util.Scanner;

import entidade4.Aluno;

public class Programa4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno alu = new Aluno();
		
		System.out.print("Nome: ");
		alu.nome = sc.nextLine();
		alu.nota1 = sc.nextDouble();
		alu.nota2 = sc.nextDouble();
		alu.nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f%n", alu.notaFinal());
		
		if(alu.notaFinal() < 60 ){
			System.out.println("Reprovado");
			System.out.printf("Falta: %.2f%n", alu.mediaFinal());
		}		
		else
			System.out.println("Aprovado");
		
		
		
		
		
		sc.close();

	}

}
