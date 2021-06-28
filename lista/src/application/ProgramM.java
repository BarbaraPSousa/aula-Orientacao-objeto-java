/*Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz.*/

package application;

import java.util.Scanner;

public class ProgramM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		/*lendo varial n*/
		int n = sc.nextInt();
		
		/*Criando Matriz*/
/*Os cochetes indica bidimencional se colocar mas almeta*/
		int[][]  mat =  new int[n][n]; /*o que ta dentro do cochete indica contidade passada pelo usuario*/
		       /*Nome variavel matriz*/    
				
		 /*Lendo a matriz Toda*/
		
		/*Lendo as linha*/	   /*sempre que tiver leitura de contidade de linha usa mat.length*/	
		for(int i= 0 ;    i < mat.length ; i++) {
			/*Lendo as colunas*/     /*sempre que tiver leitura de coluna matriz utilizarMat[i].length*/
			for(int j= 0 ;        j <mat[i].length ; j++) {
				/*Usuario passa os dados para armazenar na matris.*/
				mat[i][j]= sc.nextInt();
			}
		}
		/*pulando linha*/
		System.out.println();
		
		/*lendo as diagonal*/
		System.out.println("Main diagonal:");
		
		/*usa for para ler */
		for(int i = 0; i<mat.length; i++) {
							/*print elemento da matriz na linha I e coluna I*/	
			System.out.print(mat [i][i] +" ");			
		}
		/*pulando linha*/
		System.out.println();
		
		/*lendo numero negativo*/
		
		/*iniciar uma varial*/		
		int  count = 0;		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j< mat[i].length; j++) {
				/*se a I e J for negativo soma */
				if(mat[i][j]< 0) {
					count++;
				}
			}			
		}					/*imprimindo o valor de numeros negativos*/		
		System.out.println("negative numbers = " + count);		
		
		
		sc.close();

	}

}
