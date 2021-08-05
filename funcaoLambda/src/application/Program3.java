package application;

import java.util.ArrayList;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		
		//Expressividade/codigo conciso
		
		List<Integer> list = new ArrayList<>();
		
		//sem Prog.fun verboso e oculpa muito espaço
		Integer sum = 0;
		for(Integer x : list) {
			sum += x;			
		}
		//com Prog.fun simples 
		sum = list.stream().reduce(0, Integer:: sum);
	}
	
}
