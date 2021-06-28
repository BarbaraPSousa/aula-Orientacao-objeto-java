//Fazer um programa para ler tr�s n�meros inteiros.
//Em seguida, mostrar qual o Menor dentre os tres n�meros lidos. 
//Em caso de empate, mostra apenas uma vez.
//Entrada 1�: 7 3 8 2�: 5 12 5 3� 9 9 9 
//Saida 1�:MENOR = 3 2�: MENOR = 5 3� MENOR = 9

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
    if(a < b && a < c) {
	   System.out.println("MENOR = " + a);	
}
    else if(b < c){
	System.out.println("MENOR = " + b);
}	
	else {
		System.out.println("MENOR = " + c);
}	
	
		
		sc.close();
	}

}
