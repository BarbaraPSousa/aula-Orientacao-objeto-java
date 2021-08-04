package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
	
	public static void main(String[] args) {
		
/*Fazer um método para retornar a soma das áreas de uma lista de
figuras.*/

		List<Shape> myShapes = new ArrayList<>();//lista de Shap
		myShapes.add(new Rectangle(3.0, 2.0));//add figura
		myShapes.add(new Circle(2.0));//add figura
		
		List<Circle> myCircle = new ArrayList<>(); // list de Circulosub tipo de Shape
		myCircle.add(new Circle(2.0));//add figura
		myCircle.add(new Circle(3.0));
		
		/*System.out.println("total area: " + totalArea(myShapes));//so funciona se a lista for de Shap, conforme definono no metodo*/
		System.out.println("total area: " + totalArea(myCircle));	//para aceita qualquer tipo de list, temos que redefinir o metodo com o coringa

	}
	
	public static double totalArea(List<? extends Shape> list) {//metodo que retorna o tatal de area definido com coringa delimitado
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
		/*OBs: não é possivel add elemento na lista*/		
	}	
}