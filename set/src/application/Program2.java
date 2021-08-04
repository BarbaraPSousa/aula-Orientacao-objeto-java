package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program2 {

	public static void main(String[] args) {		
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));//Primeiro conjunto
		Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));//segunda conju
		
		//union
		Set<Integer> c = new TreeSet<>(a);//terceiro conjunto copia do a
		c.addAll(b);//união do conjunto a e b
		System.out.println(c);
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);//quarto conj, copia do a
		d.retainAll(b);//somente os elemento em comum
		System.out.println(d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);//quinto conj  copia do a
		e.removeAll(b);//remover todos que ta no conjunto b
		System.out.println(e);;		
	}

}
