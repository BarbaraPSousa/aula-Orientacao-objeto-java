//Fazer um programa para ler três números inteiros.
//Em seguida, mostrar qual o Menor dentre os tres números lidos. 
//Em caso de empate, mostra apenas uma vez.
//Entrada 1º: 7 3 8 2º: 5 12 5 3º 9 9 9 
//Saida 1º:MENOR = 3 2º: MENOR = 5 3º MENOR = 9

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
