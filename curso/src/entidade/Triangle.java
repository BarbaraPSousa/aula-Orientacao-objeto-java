//Criando Classe

package entidade; // pacote Clase

//Declarando atributos

	public class Triangle {
	
	public double a;// atributos da classe do tipo double
	public double b;
	public double c;
	
/* Criando Fun�ao para calcular Aria:
1� (public)  indica que a fun. vai poder ser usada em outro arquivi; 
2� tipo de retorno da operacao(double, String, Int ..)
3� nome da operacao (Aria ou o que eu criar)
4� parameto se for necessario(tipo a,b || x,Y)*/
	
		public double area() {//n�o precisa colocar parametro, pois ja foi declarado.
		double p = (a  + b + c) / 2.0; //n�o precisa colocar o Objeto, pois estamos trabalhando o atributo da Classe
		return Math.sqrt(p*(p-a)*(p-b)* (p-c));
		}
}
