package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		//equals
		System.out.println("Equals");
		String a = "Maria";
		String b = "Alex";
		System.out.println("****");
		
		System.out.println(a.equals(b));//comparando em boolean se a é igual a b. R: falso
	
		//HashCode
		System.out.println("HashCode");
		String c = "Barbara";
		String d = "Pamela";
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());//gera um codigo de numero inteiro para cada OO.
		System.out.println("****");
		
		//Personalizados
		
		Client c1 = new Client("Maria","maria@gmail");
		Client c2 = new Client("Alex","alex@gmail");
		Client c3 = new Client("Maria","alex@gmail");
		Client c4 = new Client("Alex","alex@gmail");
		
		String s1 = "test";
		String s2 = "test";
		
		System.out.println("Personalizados");
		System.out.println(c1.hashCode());//compara por conteudo
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c2.equals(c4));
		System.out.println(c4==c2);//compara a referencia de memoria
		System.out.println(s1==s2);//neste caso o compilador da um tratamento difernte			
	}
}
