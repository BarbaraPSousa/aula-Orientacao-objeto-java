    
     /*METODOS ABSTRATOS*/

package entities;

import entities.enums.Color;

public abstract class Shape { /*Class que tenha pelo nemos 1 metodos Abs é obrigatorio ser abs*/ 
	
	private Color color;
	
	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	/*metodo abstrados*/
	public abstract double area();/*Como o metodo é muito generico não realiza as função, somente nas sub Class quando sobre escreve*/
	

}
