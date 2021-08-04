package service;

import java.util.ArrayList;
import java.util.List;

/*public class PrintService {*/
public class PrintService<T> {//class para ser do tipo T ou qualquer nome que quiser, des que utiliza o msm na implementa��o
	
	/*private  List<Integer> list = new ArrayList<>();//list para armazena valor inteiro*/
	/*private  List<Object> list = new ArrayList<>();//list para armazena Objet*/
	
	private  List<T> list = new ArrayList<>();//list para armazena valores do tipo T
	
	/*public void addValue(Integer value) {//opra�� que add valor inteiro*/
	/*public void addValue(Object value) {//opar��o que add na lista Obj*/
	public void addValue(T value) {//opar��o que add na lista Obj
		list.add(value);
	}
	
	/*public Integer first() {//opera�ao que devolve o primeiro elemento*/
	/*public Object first() {//opera�ao que devolve o primeiro elemento da lista de OBj*/
	
	public T first() {//opera�ao que devolve o primeiro elemento da lista T
		if(list.isEmpty())  {//Prog. defenciva, se n�o tver nada na lista
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);//primeira possi�ao na lista
	}
	
	public void print() {
		System.out.println("[");
		if(!list.isEmpty()) {//se lista n�o tiver fazia 
			System.out.println(list.get(0));//impimir o elemento da primeira posi��o 
		}
		for(int i = 1; i <list.size(); i++) {//do segundo elemento em diante
			System.out.println("," + list.get(i));//espaco mas o elemento
		}
		System.out.println("]");
	}	
}
/*Lista do Tipo Generic � possivel parametrizar o tipo e podemo fazer reuso e te melhor perfomace */
