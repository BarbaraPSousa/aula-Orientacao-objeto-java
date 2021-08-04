/*Deseja-se fazer um programa que leia uma quantidade N, e depois N n�meros
inteiros. Ao final, imprima esses n�meros de forma organizada conforme
exemplo. Em seguida, informar qual foi o primeiro valor informado.*/

package application;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*PrintService ps = new PrintService();intanciando clss com valores inteiro*/
		/*PrintServiceString ps = new PrintServiceString();//intanciando clss com valores inteiro*/
		/*PrintService ps = new PrintService();//intanciando clss com valores Objet*/
		
		PrintService<Integer> ps = new PrintService<>();//intanciando clss com valores Inteiro Generics

		
		
		System.out.print("How may values: ");
		int n = sc.nextInt();
		
		/*ps.addValue("Maria");//aceita o obj do tipo obj, pois tudo em javas OO, o que leva a seguran�a de tipos.ao troca instancia para Generics de Inteiro, n�o � possivel fazer convers�o para String*/
		
		for(int i = 0; i < n; i++) {//para cada valor na lista
			int value = sc.nextInt();//com lista sendo OBj generica aceita todos os tipo de variavel
			ps.addValue(value);//add na lista
		}
		
		ps.print();
		/*System.out.println("First: " + ps.first());*/
		/*Integer x = (Integer) ps.first();//n�o aceita sem fazer um casting*/
		Integer x = ps.first();//n�o precisa vafer casting
		System.out.println("First: " + x);//imprimindo
		
		sc.close();
	}

}
/*OBJ: lista de obj aceita dotos tipo de OO, porem se resolve todos so conflitos do programa, sofre com questa de perfomaces pois para realizar algumas fun�oes temo que fazer o casting, box, anbox, etc.., alesm disso o mas importante � a segun�a de tipo. */