package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream();//criando uma strem de inteiro
		st1 = list.stream().map(x -> x *10);//criando uma strem com map
		System.out.println(Arrays.toString(st1.toArray()));//imprimindo Strem
		
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");//Crindo um stream.of
		System.out.println(Arrays.toString(st2.toArray()));//imprimeindo
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);//strime infinita
		System.out.println(Arrays.toString(st3.limit(10).toArray()));//limitando Strime em 10
			
		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p-> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);//criando Stream com regra de fibonate
		System.out.println(Arrays.toString(st4.limit(10).toArray()));//imprimindo apenas 10
		
		
	}

}
