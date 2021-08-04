package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		/*
		 * List<?> myObjs= new ArrayList<>();//Lista coringa, aceita todos
		 * //List<Object> myObjs = new ArrayList<>(); lista de obj List<Integer>
		 * myNumber = new ArrayList<>();//lista de inteiro myObjs = myNumber;// não é
		 * possivel fazer atribuição, pois uma lista de int, não é uma lista de obj,
		 * porem aceita lista coringa
		 * 
		 * Object obj; Integer x = 10; obj = x; // seaplica, pois int é uma lista de
		 * obj.
		 */

		List<Integer> myIntes = Arrays.asList(5, 2, 10);//List da inteiro
		printList(myIntes);//imprime a lista
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");//lista de String
		printList(myStrs);//imprime a lista		
	}

	public static void printList(List<?> list) {//metodo com list coring, funciona para qualquer tipo de lista, assim podemos trabalhar com mas de 1 tipo no msm projeto
		//list.add(3); não é possivel add dados na lista de coringa
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
