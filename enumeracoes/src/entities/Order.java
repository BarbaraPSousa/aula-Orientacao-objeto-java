//Class Order
package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {

	private Integer id; /*numero do pedido*/
	private Date moment;/*intante que o pedido*/
	private OrderStatus status;/*Atributo Status do pedido feito em Enun*/

	public Order() {/*Contruto vazio*/	
	}
	
	public Order(Integer id, Date moment, OrderStatus status) { /*Contrutor com argumento*/
		this.id = id;
		this.moment = moment;
		this.status = status;
	}


	/*Gets e Sets*/
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}
}




