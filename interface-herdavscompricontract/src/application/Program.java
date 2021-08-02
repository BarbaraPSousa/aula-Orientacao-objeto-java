package application;

import model.entities.AbstractShepe;
import model.entities.Circle;
import model.entities.Rectangle;
import moldel.enums.Color;

public class Program {

	public static void main(String[] args) {
	
		AbstractShepe s1 = new Circle(Color.BLACK, 2.0);
		AbstractShepe s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle Color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f",s1.area()));
		System.out.println("Rectangle Color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f",s2.area()));
	}
}
/*com a criação da Interface, a variavel foi trocada para AbstracShape*/
