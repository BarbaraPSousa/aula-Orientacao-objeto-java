package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		 Stream<Integer> st1 = list.stream().map(x -> x *10);//String com map
		 System.out.println(Arrays.toString(st1.toArray()));//impri.
		 
		 int sum = list.stream().reduce(0, (x, y) -> x + y);//reduce recebe 1 elemento neutro e uma função com 2 argumentos
		 System.out.println("Sum = " + sum);
		 
		 List<Integer> newList = list.stream() //criando strime
				 .filter(x -> x % 2 == 0)  // filtrando e passando predicado de numeros par
				 .map(x -> x *10) //map passando funcao p/ multiplicar os numeropares filtrados
				 .collect(Collectors.toList()); // collects tranformando para lista tranformandos osn numeros para lsiat
		 System.out.println(Arrays.toString(newList.toArray())); // impri. 	
	}
}
