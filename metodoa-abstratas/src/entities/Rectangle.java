package entities;

import entities.enums.Color;

public class Rectangle extends Shape{ /*Com a Super Clss é ABS o proprio compilado pedi para incluir o metodo e  ser sobescrevido*/ 

	private Double width;
	private Double height;
	
	public Rectangle() {
		super();	
	}
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	public Double getWidth() {
		return width;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	@Override
	public double area() {/*Impementando o metodo ABS da Super Class*/
		return width * height;
	}
}
