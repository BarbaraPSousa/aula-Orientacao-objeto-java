package application;

import java.util.Arrays;

public class Program {

	//Transparencia referencial é quando seu resultado sempre vai ser o msm independente de outros, simplismente previsivel
	
	public static int globalValue = 3;//tributo stat que determina o vaolor da funcao
	
	public static void main(String[] args) {
		
		int[] vect = new int[]{3, 4, 5};// crindo vec 
		changeOddvalues(vect);//mude os valres impar
		System.out.println(Arrays.toString(vect));// imrimir na tela o vec	
	}

	public static void changeOddvalues(int[] number) {//função para testa vec
		for(int i =0; i < number.length; i++) {
			if(number[i] % 2 != 0) {//se valor for impar
				number[i] += globalValue;//acresente no glob.
			}
		}
	}
}
/*OBS: changeOddvalues(vect); depende de outra, sendo assim ela não tem transparencia referencial*/