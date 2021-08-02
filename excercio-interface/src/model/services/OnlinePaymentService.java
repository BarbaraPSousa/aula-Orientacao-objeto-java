package model.services;

public interface OnlinePaymentService {
	
	double paymentFee(double amount);//assinatura do metodos 
	
	double interest(double amount, int months);

}
