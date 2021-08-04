/*Vamos fazer um método que copia os elementos de uma lista para uma outra lista que pode ser mais genérica que a primeira.*/	

package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
	
		/*Covariancia
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;//lis de qualquer tipo que extende Number
		
		Number x = list.get(0);//deixa acessar
		
		//List.add(20); não deixa inserir
		
		//Contravariancia
		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNum = myObjs;// lista de qualquer tipo ou super tipo de number
		
		myNum.add(10);//deixa inserir
		myNum.add(3.14);
		
		/Number x = myNum.get(0); não deixa acessar */
		
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);//lista de int
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);//list de double
		List<Object> myObjs = new ArrayList<Object>();//list de obj
		
		copy(myInts, myObjs);//copiar list int para lista generic
		printList(myObjs);
		
		copy(myDoubles, myObjs);// copiar lista double para list generic
		printList(myObjs);			
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {//metodo que define lista de origem e destino
		for(Number number : source) {//para cada number na lista de origim(covariancia)
			destiny.add(number);//vai add na lista de destino (Contravariancia)
		}
	}

	public static void printList(List<?> list) {//função para imprimir qualquer tipo de lis
		for(Object objs: list) {
			System.out.print(objs + " ");
		}
		System.out.println();
	}
}
