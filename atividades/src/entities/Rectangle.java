package entities;

public class Rectangle {
	
	public double whidth; // largura
	public double heigth; // altura

	public double area() {
		return  whidth * heigth;
	}
	public double perimeter() {
		return 2* (whidth + heigth);
	}
	public double diagonal() {
		return Math.sqrt(whidth * whidth + heigth * heigth);
	}
}
