//Criando ordem de pedido 

package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		/* Declarando no OO */ /* Id c*/ /* Status agaurdando pagamento */
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT); // imprime o mesmo nome que foi definido no enun
	                            	/* Intante do pedido */										

		System.out.println(order); // sem ToString Conversão de String para enun */

		/* intancia um OBS */ /* Variavel */ /* tipo de intancia */
		OrderStatus os1 = OrderStatus.DELIVERED;
		/* FORMA DE STRING */
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

		System.out.println(os1);
		System.out.println(os2);
	}
}