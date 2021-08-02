package model.entities;

import moldel.enums.Color;

public abstract class AbstractShepe implements Shape{//criado nova class que implenta interface e define atributo
	
	private Color color;

	public AbstractShepe(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
/*msm que a class implementa a interface, n�o vai ser feito a mplementa��o nela. utilizamos o Abstract para q possa ser compilado sem erros*/