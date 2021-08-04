package service;

import java.util.ArrayList;
import java.util.List;

/*public class PrintService {*/
public class PrintService<T> {//class para ser do tipo T ou qualquer nome que quiser, des que utiliza o msm na implementação
	
	/*private  List<Integer> list = new ArrayList<>();//list para armazena valor inteiro*/
	/*private  List<Object> list = new ArrayList<>();//list para armazena Objet*/
	
	private  List<T> list = new ArrayList<>();//list para armazena valores do tipo T
	
	/*public void addValue(Integer value) {//opraçã que add valor inteiro*/
	/*public void addValue(Object value) {//oparção que add na lista Obj*/
	public void addValue(T value) {//oparção que add na lista Obj
		list.add(value);
	}
	
	/*public Integer first() {//operaçao que devolve o primeiro elemento*/
	/*public Object first() {//operaçao que devolve o primeiro elemento da lista de OBj*/
	
	public T first() {//operaçao que devolve o primeiro elemento da lista T
		if(list.isEmpty())  {//Prog. defenciva, se não tver nada na lista
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);//primeira possiçao na lista
	}
	
	public void print() {
		System.out.println("[");
		if(!list.isEmpty()) {//se lista não tiver fazia 
			System.out.println(list.get(0));//impimir o elemento da primeira posição 
		}
		for(int i = 1; i <list.size(); i++) {//do segundo elemento em diante
			System.out.println("," + list.get(i));//espaco mas o elemento
		}
		System.out.println("]");
	}	
}
/*Lista do Tipo Generic é possivel parametrizar o tipo e podemo fazer reuso e te melhor perfomace */
