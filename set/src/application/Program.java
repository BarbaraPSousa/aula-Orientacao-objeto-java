package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set1= new HashSet<>();//intanciando set com implementação Hash, sendo mas rapido mas sem ordem
		Set<String> set2 = new TreeSet<>();//intanciando set com implementação Tree, sendo mas lento porem colocando em ordem		
		Set<String> set3 = new LinkedHashSet<>();//intanciando set com implementação 
		
		//add elemento no conjunto
		System.out.println("Conjunto com HashSet");
		set1.add("TV");
		set1.add("Notebook");
		set1.add("Tablet");
		
		System.out.println("Conjunto com TreeSet");
		set2.add("TV");
		set2.add("Notebook");
		set2.add("Tablet");
		set1.remove("Tablet");//remove intem
		set2.removeIf(x -> x.length() >= 3);//remove com predicado
		set3.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println("Conjunto com LinkedHashSet");
		set3.add("TV");
		set3.add("Notebook");
		set3.add("Tablet");
		
		//verificar se no conjunto tem elemento descrito
		System.out.println(set1.contains("Notebook"));
		
		//impri o elemento do conjunto
		for(String p : set3) {
			System.out.println(p);
		}
		
	}
}
