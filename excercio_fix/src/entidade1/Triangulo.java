package entidade1;

public class Triangulo {

	public double largura; // largura
	public double altura; // Altura

	public double area() { // calculo aria
		return  largura * altura;
	}

	public double perimetro() { // calculo perimetro
		return  2*( largura + altura);

	}

	public double diagonal() { // calculo diagonal
		return  Math.sqrt(largura * largura + altura*altura);
	}
	

}



