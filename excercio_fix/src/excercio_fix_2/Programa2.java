package excercio_fix_2;

import java.util.Locale;
import java.util.Scanner;

import entidade2.Fincionario;

public class Programa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Fincionario fin = new Fincionario();
		
		
		System.out.print("Nome: " );
		fin.nome = sc.next();
		
	    System.out.print("Salario Pruto: ");
		fin.salario = sc.nextDouble();
		
		System.out.print("Imposto: ");
		fin.imposto = sc.nextDouble();
		System.out.println();
		
		System.out.println("Salario com Desconto:" +  fin.nome +  "," + "R$ "  +  fin.salarioComImposto());
		System.out.println();
		System.out.println("Qual percentual para aumentar o salário?");
		double porcentagem = sc.nextDouble();
		fin.salarioComAlmento(porcentagem);
		
		System.out.println();
		System.out.println("Atualizado na data: " + fin);
		
		
		
		
		
		sc.close();
	}

}
